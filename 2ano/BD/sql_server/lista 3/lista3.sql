----------------------exercicio1-----------------------------------

-- cria��o de banco de dados --
create database ExercBD01

--abrindo uma base de dados --
use ExercBD01

--criando uma tabela--
CREATE TABLE pet
(
   NumRegistro INT, --criando campo para a inser��o do resgistro
   Nome VARCHAR (80), --cria��o do campo nome
   Especie VARCHAR (25), --cria��o do campo especie
   Raca varchar(30), --cria��o do campo ra�a 
   Cor varchar(40), --cria��o do campo cor
   Nascimento datetime, --cria��o do campo nascimento
   Sexo varchar(9) --cria��o do campo sexo
);


------------------------exercicio2-------------------------
-- cria��o de banco de dados --
create database ExercBD02

--abrindo uma base de dados --
use ExercBD02
--criando uma tabela--
CREATE TABLE Departamento
(
   CodFunc INT, --criando campo CodFunc
   NomeDepto VARCHAR (80), --cria��o do campo nomeDepto
);
--criando a segunda tabela--
CREATE TABLE Funcionario --criando a tabela funcion�rio
(
   CodFunc INT, --criando campo CodFunc
   NomeFunc varchar (50), --cria��o do campo nomefunc
   CodDepto int, --criando campo coddepto
   Ramal int null, --criando campo ramal
   salario float, --criando campo sal�rio
   DataAdmissao datetime, --criando campo dataadmissao
   DataCadastro datetime, --criando campo datacadastro
   Sexo char(1) --criando campo sexo
);



------------------------exercicio3-------------------------------

-- cria��o de banco de dados --
create database ExercBD03

--abrindo uma base de dados --
use ExercBD03

--criando uma tabela--
CREATE TABLE Produtos
(
   Tipoproduto VARCHAR (20) not null, --cria��o do campo Tipo do produto
   Lote int not null, --cria��o do campo lote
   ID int primary key, --cria��o do campo id do produto
   marca varchar(25) not null unique, --cria��o do campo marca
   ean int unique, --cria��o do campo ean
   Preco float not null,--cria��o do campo pre�o
   Loca1 varchar (3), --cria��o do campo local identificado por uma letra(identifica a prateleira) e um n�mero (identifica o nicho da prateleira)
   Estoque int not null, --cria��o do campo estoque
);

--criando uma tabela--
CREATE TABLE funcion�rio
(
   Nome VARCHAR (50) not null, --cria��o do campo nome
   dataNasc VARCHAR (10) not null, --cria��o do campo dataNasc
   RG varchar(9) not null unique, --cria��o do campo RG 
   CPF varchar(14) not null unique, --cria��o do campo CPF
   telefone datetime unique, --cria��o do campo telefone
   CEP varchar(9) not null unique,--cria��o do campo CEP
   RM int primary key, --cria��o do campo RM
   CTPS varchar (12) not null unique, --cria��o do campo CTPS
   Formacao varchar (35) not null, --cria��o do campo Forma��o
);


--criando uma tabela--
CREATE TABLE fornecedor
(
   Nomefor VARCHAR (50) not null unique, --cria��o do campo nome do fornecedor
   Transportadora VARCHAR (50) not null unique, --cria��o do campo transportadora
   MEI varchar(15) not null unique, --cria��o do campo MEI 
   CNPJ varchar(18) not null unique, --cria��o do campo CNPJ
   email varchar (60), --cria��o do campo e-mail
   Tipomate varchar(8) not null, --cria��o do campo Tipo de material
   ID int primary key, --cria��o do campo ID
);


--criando uma tabela--
CREATE TABLE departamento
(
   funcao VARCHAR (25) not null, --cria��o do campo setor
   setor VARCHAR (30) not null, --cria��o do campo fun��o
   quantifunc int not null unique, --cria��o do campo quantidade de funcion�rio 
   Loca1 varchar(20) not null unique, --cria��o do campo local
   contato varchar (15) not null, --cria��o do campo contato e-mail/telefone
   ID int primary key, --cria��o do campo ID
);


