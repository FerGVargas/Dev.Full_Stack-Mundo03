CREATE TABLE Produto (
idProduto INTEGER NOT NULL IDENTITY,
nome VARCHAR(255) NOT NULL,
quantidade INTEGER NOT NULL,
precoVenda NUMERIC(10,2) NOT NULL,
PRIMARY KEY(idProduto)
);

CREATE TABLE Pessoa (
idPessoa INTEGER NOT NULL,
nome VARCHAR(255) NOT NULL,
logradouro VARCHAR(255),
cidade VARCHAR(255),
estado CHAR(2),
telefone VARCHAR(11),
email VARCHAR(255) NOT NULL,
PRIMARY KEY(idPessoa)
);

CREATE TABLE Usuario (
idUsuario INTEGER NOT NULL,
login VARCHAR(255) NOT NULL,
senha VARCHAR(255) NOT NULL,
PRIMARY KEY(idUsuario)
);

CREATE TABLE PessoaJuridica (
CNPJ VARCHAR(14) NOT NULL,
Pessoa_idPessoa INTEGER NOT NULL,
PRIMARY KEY(CNPJ),
FOREIGN KEY(Pessoa_idPessoa)
REFERENCES Pessoa(idPessoa)
);

CREATE TABLE PessoaFisica (
CPF VARCHAR(11) NOT NULL,
Pessoa_idPessoa INTEGER NOT NULL,
PRIMARY KEY(CPF),
FOREIGN KEY(Pessoa_idPessoa)
REFERENCES Pessoa(idPessoa)
);

CREATE TABLE Movimento (
idMovimento INTEGER NOT NULL   IDENTITY,
Usuario_idUsuario INTEGER NOT NULL,
Pessoa_idPessoa INTEGER NOT NULL,
Produto_idProduto INTEGER NOT NULL,
quantidade INTEGER NOT NULL,
tipo CHAR(1) NOT NULL,
valorUnit NUMERIC(10,2) NOT NULL,
PRIMARY KEY(idMovimento),

FOREIGN KEY(Produto_idProduto)
REFERENCES Produto(idProduto),

FOREIGN KEY(Pessoa_idPessoa)
REFERENCES Pessoa(idPessoa),

FOREIGN KEY(Usuario_idUsuario)
REFERENCES Usuario(idUsuario)
);

CREATE INDEX PessoaJuridica_FKIndex1 ON PessoaJuridica (Pessoa_idPessoa);

CREATE INDEX IFK_PessoaJuridica ON PessoaJuridica (Pessoa_idPessoa);

CREATE INDEX PessoaFisica_FKIndex1 ON PessoaFisica (Pessoa_idPessoa);

CREATE INDEX Movimento_FKIndex1 ON Movimento (Produto_idProduto);

CREATE INDEX Movimento_FKIndex2 ON Movimento (Pessoa_idPessoa);

CREATE INDEX Movimento_FKIndex3 ON Movimento (Usuario_idUsuario);

CREATE INDEX IFK_ItemMovimentado ON Movimento (Produto_idProduto);

CREATE INDEX IFK_Cliente ON Movimento (Pessoa_idPessoa);

CREATE INDEX IFK_Responsavel ON Movimento (Usuario_idUsuario);



