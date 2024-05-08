----------------------exercicio1-----------------------------------

-- criação de banco de dados --
create database ExercBD01

--abrindo uma base de dados --
use ExercBD01

--criando uma tabela--
CREATE TABLE pet
(
   NumRegistro INT, --criando campo para a inserção do resgistro
   Nome VARCHAR (80), --criação do campo nome
   Especie VARCHAR (25), --criação do campo especie
   Raca varchar(30), --criação do campo raça 
   Cor varchar(40), --criação do campo cor
   Nascimento datetime, --criação do campo nascimento
   Sexo varchar(9) --criação do campo sexo
);


------------------------exercicio2-------------------------
-- criação de banco de dados --
create database ExercBD02

--abrindo uma base de dados --
use ExercBD02
--criando uma tabela--
CREATE TABLE Departamento
(
   CodFunc INT, --criando campo CodFunc
   NomeDepto VARCHAR (80), --criação do campo nomeDepto
);
--criando a segunda tabela--
CREATE TABLE Funcionario --criando a tabela funcionário
(
   CodFunc INT, --criando campo CodFunc
   NomeFunc varchar (50), --criação do campo nomefunc
   CodDepto int, --criando campo coddepto
   Ramal int null, --criando campo ramal
   salario float, --criando campo salário
   DataAdmissao datetime, --criando campo dataadmissao
   DataCadastro datetime, --criando campo datacadastro
   Sexo char(1) --criando campo sexo
);



------------------------exercicio3-------------------------------

-- criação de banco de dados --
create database ExercBD03

--abrindo uma base de dados --
use ExercBD03

--criando uma tabela--
CREATE TABLE Produtos
(
   Tipoproduto VARCHAR (20) not null, --criação do campo Tipo do produto
   Lote int not null, --criação do campo lote
   ID int primary key, --criação do campo id do produto
   marca varchar(25) not null unique, --criação do campo marca
   ean int unique, --criação do campo ean
   Preco float not null,--criação do campo preço
   Loca1 varchar (3), --criação do campo local identificado por uma letra(identifica a prateleira) e um número (identifica o nicho da prateleira)
   Estoque int not null, --criação do campo estoque
);

--criando uma tabela--
CREATE TABLE funcionário
(
   Nome VARCHAR (50) not null, --criação do campo nome
   dataNasc VARCHAR (10) not null, --criação do campo dataNasc
   RG varchar(9) not null unique, --criação do campo RG 
   CPF varchar(14) not null unique, --criação do campo CPF
   telefone datetime unique, --criação do campo telefone
   CEP varchar(9) not null unique,--criação do campo CEP
   RM int primary key, --criação do campo RM
   CTPS varchar (12) not null unique, --criação do campo CTPS
   Formacao varchar (35) not null, --criação do campo Formação
);


--criando uma tabela--
CREATE TABLE fornecedor
(
   Nomefor VARCHAR (50) not null unique, --criação do campo nome do fornecedor
   Transportadora VARCHAR (50) not null unique, --criação do campo transportadora
   MEI varchar(15) not null unique, --criação do campo MEI 
   CNPJ varchar(18) not null unique, --criação do campo CNPJ
   email varchar (60), --criação do campo e-mail
   Tipomate varchar(8) not null, --criação do campo Tipo de material
   ID int primary key, --criação do campo ID
);


--criando uma tabela--
CREATE TABLE departamento
(
   funcao VARCHAR (25) not null, --criação do campo setor
   setor VARCHAR (30) not null, --criação do campo função
   quantifunc int not null unique, --criação do campo quantidade de funcionário 
   Loca1 varchar(20) not null unique, --criação do campo local
   contato varchar (15) not null, --criação do campo contato e-mail/telefone
   ID int primary key, --criação do campo ID
);


