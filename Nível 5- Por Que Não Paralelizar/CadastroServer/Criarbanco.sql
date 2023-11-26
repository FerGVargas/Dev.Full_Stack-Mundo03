-- Obsv: Utilizar dbo. caso a tabela já exista
CREATE TABLE Pessoa (
    ID INT PRIMARY KEY,
    Nome VARCHAR(255),
    Logradouro VARCHAR(255),
    Cidade VARCHAR(255),
    Estado Char(2),
    Telefone VARCHAR(255),
    Email VARCHAR(255),
);

Create TABLE Usuario (
    IDUsuario INT PRIMARY KEY,
    Login VARCHAR(255),
    Senha VARCHAR(255)
);

CREATE TABLE PessoaFisica (
    IDPessoa INT PRIMARY KEY,
    CPF VARCHAR(255),
    FOREIGN KEY (IDPESSOA) REFERENCES Pessoa(ID)
);

CREATE TABLE PessoaJuridica (
	IDPessoa INT PRIMARY KEY,
	CNPJ VARCHAR(255),
	FOREIGN KEY (IDPESSOA) REFERENCES PESSOA(ID)
);

Create TABLE Produto (
    IDProduto INT PRIMARY KEY,
    Nome VARCHAR(255),
    Quantidade INT,
    PrecoVenda VARCHAR(255)
);

CREATE TABLE Movimento (
    IDMovimento INT PRIMARY KEY,
    IDUsuario INT,
    IDPessoa INT,
    IDProduto INT, 
    Quantidade VARCHAR(255),
    Tipo CHAR(1),
    ValorUnitario VARCHAR(255),
    FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario),
    FOREIGN KEY (IDPessoa) REFERENCES PESSOA(ID),
    FOREIGN KEY (IDProduto) REFERENCES Produto(IDProduto)
);