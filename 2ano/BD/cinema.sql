-- criar bd eletronic_store
CREATE DATABASE cinema_bd;

-- abrir bd eletronic_store
use cinema_bd;

------------------ criação tabela Salas ---------------------
CREATE TABLE Salas
(
num_sala int identity(1,1) PRIMARY KEY,
quant_cadeiras int NOT NULL,
);

INSERT INTO Salas (quant_cadeiras) 
VALUES (40);

------------------ criação tabela Sessões ---------------------

CREATE TABLE Sessoes
(
num_sala int NOT NULL,
cod_filme int NOT NULL,
hora_sessao time NOT NULL,
dia_sessao date NOT NULL,
tipo_sessao varchar(20) NOT NULL,
preco_sessao float NOT NULL,

foreign key (num_sala) references Salas,
);

INSERT INTO Sessoes (dia_sessao, hora_sessao, tipo_sessao, preco_sessao)
VALUES ('2023-10-27', '8:20', '3D', 11.29);

INSERT INTO Sessoes (dia_sessao, tipo_sessao, preco_sessao)
VALUES ('2023-11-26', '3D', 14.59);

INSERT INTO Sessoes (dia_sessao, tipo_sessao, preco_sessao)
VALUES ('2023-11-15', 'Normal', 20.79);

select * from Sessoes;
------------------ criação tabela filme ---------------------

CREATE TABLE Filmes
(
cod_filme int identity(1,1) PRIMARY KEY,
nome_filme varchar (60) NOT NULL,
genero_filme varchar (60) NOT NULL,
duracao_filme varchar (6) NOT NULL,
);

INSERT INTO funcionario (cod_cargo, nome_func, email_func, tel_func, data_adms, dtnasc_func, login_func, senha_func) 
VALUES (1,'André Oliveira Paim', 'angreen2016br@gmail.com', '11999329072', '2023-08-28', '2007-03-02', 'andre', 'A400058dre');

INSERT INTO funcionario (cod_cargo, nome_func, email_func, tel_func, data_adms, dtnasc_func, login_func, senha_func) 
VALUES (2, 'Bruno Aparecido Vivencio Rodrigues', 'aparecidobruno749@gmail.com', '11913555780', '2023-08-28', '2006-11-15', 'Sancho', 'Brunola911');

INSERT INTO funcionario (cod_cargo, nome_func, email_func, tel_func, data_adms, dtnasc_func, login_func, senha_func) 
VALUES (2, 'Igor Nogueira Pessoa', 'igornnpessoa@gmail.com', '119936004', '2023-08-28', '2006-04-22', 'TheBester', 'senha123@');

------------------ criação tabela notafiscal ---------------------

CREATE TABLE notafiscal
(
cod_nota int identity(1,1) PRIMARY KEY,
cod_cli int NOT NULL,
cod_func int NOT NULL,
dtcompra_nota date NOT NULL,

foreign key (cod_cli) references dadoscliente,
foreign key (cod_func) references funcionario,
);

------------------ criação tabela produto ---------------------

CREATE TABLE produto
(
cod_pro int identity(1,1) PRIMARY KEY,
preco float NOT NULL,
estoque int NOT NULL,
codbarras varchar(10) NOT NULL, --	CÓDIGO 128 (padrão desse código de barras)--
nome_pro varchar (80) NOT NULL,
);

INSERT INTO produto (preco, estoque, codbarras, nome_pro)
VALUES (2000.00, 5, 8743621987, 'Nintendo Switch edição limitada do brunolas');

INSERT INTO produto (preco, estoque, codbarras, nome_pro)
VALUES (3800.09, 201, 9745132864, 'Playstation 5 edição limitada do homem aranha 2');

INSERT INTO produto (preco, estoque, codbarras, nome_pro)
VALUES (2699.99, 2, 1243972164, 'Xbox Series X');

------------------ criação tabela itensnfiscal ---------------------

 CREATE TABLE itensnfiscal
(
cod_nota int NOT NULL,
cod_pro int NOT NULL,
qtcompra int NOT NULL,

foreign key (cod_nota) references notafiscal,
foreign key (cod_pro) references produto,
);
