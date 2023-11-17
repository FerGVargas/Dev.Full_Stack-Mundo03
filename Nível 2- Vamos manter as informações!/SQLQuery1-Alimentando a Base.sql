/* Usuario */

INSERT INTO Usuario (login, senha) values ('op1', 'op1');
INSERT INTO Usuario (login, senha) values ('op2', 'op2');

SELECT * FROM Usuario;

/* Produto */

INSERT INTO Produto (nome, quantidade, precoVenda) 
VALUES  
	('Banana', '100', '5.00'),
	('Laranja', '500', '2.00'),
	('Manga', '800', '4.00');

SELECT * FROM Produto;

/* Pessoa */

INSERT INTO Pessoa ( idPessoa, nome, logradouro, cidade, estado, telefone, email) 
VALUES 
	(1, 'Josefa', 'Rua 1 Vilarejo', 'Riacho do Sul', 'PA', '1111-1111', 'jojo@ariacho.com.br');
	(10, 'João', 'Rua 10, Quitandinha', 'Riacho do Sul', 'PA', '1111-1111', 'joao@riacho.com');
	(6, 'JJC', 'Rua A, Centro', 'Riacho do Sul', 'PA', '1212-1212', 'jjc@riacho.com');

SELECT * FROM Pessoa;

/* Pessoa Fisica*/

INSERT INTO PessoaFisica (cpf, Pessoa_idPessoa) 
VALUES 
	('12345678910', 10);

SELECT * FROM PessoaFisica;

/* Pessoa Juridica */

INSERT INTO PessoaJuridica (Pessoa_idPessoa, cnpj) 
VALUES 
	(6, '12345678900010');

SELECT * FROM PessoaJuridica;


/* Movimentação */

INSERT INTO Movimento (Usuario_idUsuario, Pessoa_idPessoa, Produto_idProduto, quantidade, tipo, valorUnit) 
VALUES 
	(1, 10, 5, 30, 'S', 5.00),
	(1, 1, 6, 15, 'S', 2.00),
	(2, 6, 6, 500, 'E', 2.00),
	(1, 6, 5, 200, 'E', 5.00),
	(2, 6, 7, 50, 'E', 4.00);

SELECT * FROM  Movimento;

/* Dados Pessoa Fisica e Juridica */

SELECT * FROM Pessoa;
SELECT * FROM PessoaFisica;
SELECT * FROM PessoaJuridica;

/* Movimentação de Entrada  */
	
SELECT 
	Movimento.tipo, 
	Pessoa.nome AS Fornecedor, 
	Produto.nome,
	Movimento.quantidade,
	Produto.precoVenda AS Preco_Unitario,
	(Movimento.quantidade * Produto.precoVenda) AS Valor_Total
FROM
	Movimento
JOIN 
	Produto ON Movimento.Produto_idProduto = Produto.idProduto 
JOIN
	Pessoa ON Movimento.Pessoa_idPessoa = Pessoa.idPessoa    
WHERE
	Movimento.tipo = 'E';

/* Movimentação de Saida  */

SELECT 
	Movimento.tipo, 
	Pessoa.nome AS Comprador, 
	Produto.nome,
	Movimento.quantidade,
	Produto.precoVenda AS Preco_Unitario,
	(Movimento.quantidade * Produto.precoVenda) AS Valor_Total
FROM
	Movimento
JOIN 
	Produto ON Movimento.Produto_idProduto = Produto.idProduto 
JOIN 
	Pessoa ON Movimento.Pessoa_idPessoa = Pessoa.idPessoa   
WHERE
	Movimento.tipo = 'S';

/* Entradas agrupadas */

SELECT
	Produto.nome AS Produto,
	SUM(Movimento.quantidade * Produto.precoVenda) AS Valor_Total_Entradas
FROM
	Movimento
JOIN
	Produto ON Movimento.Produto_idProduto  = Produto.idProduto
WHERE
	Movimento.tipo = 'E'
GROUP BY
	Produto.nome;


/* Saídas agrupadas */

SELECT
	Produto.nome AS Produto,
	SUM(Movimento.quantidade * Produto.precoVenda) AS Valor_Total_Saidas
FROM
	Movimento
JOIN
	Produto ON Movimento.Produto_idProduto = Produto.idProduto
WHERE
	Movimento.tipo = 'S'
GROUP BY
	Produto.nome;


/* Sem Movimentação Entrada */

SELECT
    Pessoa.nome AS Sem_Movimentação_Entrada
FROM
    Pessoa
WHERE
	idPessoa NOT IN (
SELECT DISTINCT 
	Movimento.Pessoa_idPessoa
FROM 
	Movimento
WHERE 
	Movimento.tipo = 'E');


/* Valor total de Entrada Op. */

SELECT 
	u.login, 
	SUM(quantidade * valorUnit) as Total_Entrada
FROM 
	Movimento AS m
INNER JOIN 
	Usuario AS u ON (m.Usuario_idUsuario = u.idUsuario)
WHERE 
	m.tipo = 'E'
GROUP BY 
	u.login


/* Valor total de Saída Op. */

SELECT
    Pessoa.nome AS Operador,
    SUM(Movimento.quantidade * Produto.precoVenda) AS Total_Saída
FROM
    Pessoa
LEFT JOIN
    Movimento ON Pessoa.idPessoa = Movimento.Pessoa_idPessoa
LEFT JOIN
    Produto ON Movimento.Produto_idProduto = Produto.idProduto
WHERE
    Movimento.tipo = 'S'
GROUP BY
    Pessoa.nome;

/* Média de Vendas por Produto (Ponderada) */

SELECT
    Produto.nome AS Produto,
    SUM(Movimento.quantidade * Movimento.valorUnit)/
	SUM(Movimento.quantidade) AS Medio_Venda
FROM
    Produto
LEFT JOIN
    Movimento ON Produto.idProduto = Movimento.Produto_idProduto
WHERE
    Movimento.tipo = 'S'
GROUP BY
    Produto.nome;

--Dev.Fer*