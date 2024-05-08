-- criar bd eletronic_store
CREATE DATABASE eletronic_store;

-- abrir bd eletronic_store
use eletronic_store;

------------------ criação tabela cargo ---------------------
CREATE TABLE cargo
(
cod_cargo int identity(1,1) PRIMARY KEY,
nome_cargo varchar (25) NOT NULL,
);

INSERT INTO cargo (nome_cargo) 
VALUES ('gerente');
INSERT INTO cargo (nome_cargo) 
VALUES ('caixa');

------------------ criação tabela dadoscliente ---------------------

CREATE TABLE dadoscliente
(
cod_cli int identity(1,1) PRIMARY KEY,
nome_cli varchar (60) NOT NULL,
cpf_cli int NOT NULL,
email_cli varchar(50) NOT NULL,
dtnasc_cli date NOT NULL,
);

INSERT INTO dadoscliente (nome_cli, cpf_cli, email_cli, dtnasc_cli)
VALUES ('Andrei Nunes Pereira', 11958734125, 'andrei@gmail.com', '2006-03-12');

------------------ criação tabela funcionario ---------------------

CREATE TABLE funcionario
(
cod_func int identity(1,1) PRIMARY KEY,
cod_cargo int NOT NULL,
nome_func varchar (60) NOT NULL,
email_func varchar (50) NOT NULL,
tel_func varchar (11) NOT NULL,
data_adms date NOT NULL,
dtnasc_func date NOT NULL,
login_func varchar (30) NOT NULL,
senha_func varchar (15) NOT NULL,

foreign key (cod_cargo) references cargo,
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
