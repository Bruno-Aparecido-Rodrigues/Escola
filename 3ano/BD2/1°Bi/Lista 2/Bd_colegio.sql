-- criar bd colegio
CREATE DATABASE Bd_Colegio;

-- abrir bd colegio
use Bd_Colegio;

--------------------------cria��o da tabela disciplinas
CREATE TABLE disciplinas
(
CodDisciplina char(2) PRIMARY KEY,
NomeDisciplina varchar(30),
);

INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('11', 'Banco de Dados');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('12', 'L�gica de Programa��o');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('13', 'Desenvolvimento de Software 1');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('21', 'Banco de Dados 2');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('22', 'Desenvolvimento de Software 2');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('23', 'Programa��o de Computadores 1');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('31', 'Banco de Dados 3');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('32','Programa��o de Computadores 2');
INSERT INTO disciplinas(CodDisciplina,NomeDisciplina)
VALUES ('33', 'Desenvolvimento de Software 3');

select * from disciplinas;
--------------------cria��o da tabela cursos-----------------
CREATE TABLE cursos
(
codcurso char (2) PRIMARY KEY,
nome varchar(50) NOT NULL,
coddisc1 char (2) NOT NULL,
coddisc2 char (2) NOT NULL,
coddisc3 char (2) NOT NULL,

foreign key (coddisc1) references disciplinas(CodDisciplina),
foreign key (coddisc2) references disciplinas(CodDisciplina),
foreign key (coddisc3) references disciplinas(CodDisciplina),
);

INSERT INTO cursos(codcurso,nome,coddisc1,coddisc2,coddisc3)
VALUES ('01','Auxiliar de Inform�tica','11','12','13');
INSERT INTO cursos(codcurso,nome,coddisc1,coddisc2,coddisc3)
VALUES ('02','Programador de computadores','21','22','23');
INSERT INTO cursos(codcurso,nome,coddisc1,coddisc2,coddisc3)
VALUES ('03','T�cnico em Inform�tica','31','32','33');

select * from cursos;
------------------ cria��o tabela alunos ---------------------
CREATE TABLE tblalunos
(
matricula varchar(5) PRIMARY KEY,
nome varchar(50) NOT NULL,
endereco varchar(50) NOT NULL,
cidade varchar(30) NOT NULL,
codcurso char(2) NOT NULL,
foreign key (codcurso) references cursos,
);

INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10001','Marcos Moraes','Rua Pe Roque, 2057','Mogi mirim','01');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10002','Maria Concei��o lopes','Rua Araras, 23','Mogi Gua�u','01');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10003','Ana Carina Lopes','Rua Peraltas, 222','Santos','01');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10004','Carlos Aguiar',' Rua Botafogo, 33','Santos','01');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10005','Andr� Luiz Dos Santos','Rua lopes conte, 3343','Sapuca�','01');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10006','Pedro Antonio Pimenta','Rua Altair Lopes 33','Itapira','02');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10007','Rita de C�ssia da Silva','Rua Eletromais, 33','Itapira','02');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10008','Caique dos Santos','Rua das Amoreiras 55','Campinas','02');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10009','Carlos Tavares','Rua Peixe 99','Santos','02');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10010','Antonio Carlos Caetano','Rua Josefina Alface, 987','Campinas','02');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10011','Ricardo Moreira','Rua do Pinhal 332','Aparecida','03');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10012','Richardson S. P. Campeao','Rua Pe Tricolor 433','S�o Paulo','03');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10013','Junior Camisa seis','Rua do Morumbi 433','S�o Paulo','03');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10014','Carina melo','Rua Osvaldo Ramos 88','Mogi Gua�u','03');
INSERT INTO tblalunos(matricula,nome,endereco,cidade,codcurso)
VALUES ('10015','Pedro melo','Rua Itoror� 3999','Mogi mirim','03');

select * from tblalunos;