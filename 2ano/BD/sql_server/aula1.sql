-- criação de banco de dados --
create database teste

--abrindo uma base de dados --
use teste

--criando uma tabela--
CREATE TABLE CLIENTE (
COD_CLI INT PRIMARY KEY NOT NULL,
NOME VARCHAR (50),
SOBRENOME VARCHAR (50)
)
--criando um novo campo--
alter table CLIENTE add telefone varchar (14)



--excluindo uma tabela--
drop table CLIENTE


--excluindo banco de dados--
use master
drop database teste