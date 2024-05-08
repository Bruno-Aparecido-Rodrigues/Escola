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

INSERT INTO Pet (NumRegistro, Nome, Especie, Raca, Cor, Nascimento, Sexo) VALUES
(1,'Pablo', 'Lontra', 'an� Oriental', 'Marrom', '25/09/2017', 'Feminino'),
(2,'Flaig', 'Cachorro', 'pug', 'bege', '11/09/2019', 'Masculino'),
(3,'Leandro', 'Cachorro', 'Vira-lata', 'Caramelo', '23/06/2020', 'Masculino'),
(4,'Kira', 'Gato', 'Vira-lata', 'branco', '12/02/2022', 'Feminino'),
(5,'yeager', 'Harpia', 'Brasileira', 'Preta', '09/03/2015', 'Feminino'),
(6,'cueio', 'Coelho', 'Bouscat', 'branco', '25/09/2012', 'Masculino'),
(7,'Juan', 'Cavalo', 'Puro  SAngue ingl�s', 'Preto', '03/12/2018', 'Masculino'),
(8,'Arthur', 'Cervo', 'veado-da-m�o-curta', 'Marrom', '29/05/2010', 'Maculino'),
(9,'Hamond', 'Hamster', 's�rio', 'laranja', '22/09/2021', 'Masculino'),
(10,'Hugo Alexandre', 'Lagarto', 'drag�o de komodo', 'preto', '07/01/2022', 'Masculino');

SELECT*from pet;

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
INSERT INTO Departamento(CodFunc, NomeDepto) VALUES
(1, 'Administra��o'),
(2, 'Logistica'),
(3, 'Recursos Humanos'),
(4, 'Marketing');

SELECT*from Departamento;
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

INSERT INTO Funcionario (CodFunc, NomeFunc,CodDepto,Ramal,salario,DataAdmissao,DataCadastro, Sexo) VALUES
(1, 'Heitor', 1, 979, 5000, '09/12/1999','10/10/2010','M'),
(2, 'Leonardo Scott', 3, 083, 2500, '22/02/2002','18/11/2002','M'),
(3, 'Monark', 4, 650, 0, '19/08/2001','19/07/2015','M'),
(4, 'Ethan', 2, 467, 7000, '09/10/1986','08/11/2017','M'),
(5, 'Davy Jones', 4,836, 10000, '09/12/1999','02/09/2012','M'),
(6, 'Ednaldo', 2, 647, 25000, '05/11/1998','05/03/2010','M'),
(7, 'Marlon Marques da Silva', 3, 279, 30000, '09/12/1999','12/12/2018','M'),
(8, 'adolfo', 1, 562, 1900, '07/04/2000','30/04/2008','M'),
(9, 'Agamenon', 3, 864, 2300, '05/09/1989','10/10/2007','M'),
(10, 'Leon Scott Kenedy', 2, 563, 5500, '15/12/1990','11/11/2015','M');

SELECT*from Funcionario;