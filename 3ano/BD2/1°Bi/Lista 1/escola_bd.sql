-- criar bd Escola
CREATE DATABASE Escola_bd;

-- abrir bd escola
use Escola_bd;

------------------ criação tabela alunos ---------------------
CREATE TABLE tblalunos
(
codaluno int identity(1,1) PRIMARY KEY,
nome varchar(40) NOT NULL,
endereco varchar(50) NOT NULL,
telefone varchar(16) NOT NULL,
nasc date NOT NULL,
pai varchar(40) NOT NULL,
mae varchar(40) NOT NULL,
responsavel varchar(60) NOT NULL,
);

INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('bruno aparecido', 'Rua André Mateus Viu (87)', '(11)91 3555-780', '2006-11-15', 'wellington Linhares Rodrigues', 'Margarete Vivencio Rodrigues', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('igor nogueira', 'Rua doutor barros pimentel', '(11)51 3759-049', '2006-04-22', 'Leonardo pessoa', 'Tamirez Nogueira', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('endrigo gustavo', 'rua joaquim barbosa', '(11)98 7913-386', '2006-04-06', 'pablo muzi', 'Táina gomes', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('Danilo soares', 'rua são pedro', '(11)76 2966-694', '2005-05-01', 'João soares', 'Teresa', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('Andrei nunes', 'Rua San petesburgo', '(11)66 5546-008', '2006-10-17', 'Vladimir Putin', 'Erika naoki', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('André paim', 'Rua barreto costa', '(11)01 1233-676', '2007-02-23', 'Andre oliveira', 'Marcia paim', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('giovanna aparecida', 'Rua André Mateus Viu (87)', '(11)76 9876-543', '2006-11-15', 'wellington Linhares Rodrigues', 'Margarete Vivencio Rodrigues', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('murillo machado', 'Rua da macedonia', '(11)43 9476-754', '2007-03-23', 'Ronaldo machado', 'Mérica Rodrigues', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('gabriel luz', 'Rua Da escuridão', '(11)86 7497-780', '2006-07-21', 'Mateus gomes', 'Maria luiza', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('Gabriel castro', 'Rua Da luz', '(11)09 1238-974', '2006-05-18', 'Matheus Marques', 'Ana luiza', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('sabrina akemi', 'chinatown', '(11)98 7469-245', '2006-10-16', 'Kenshi Akemi', 'Hirata Moria', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('raphael costa', 'Rua santo gomes', '(11)75 7496-778', '2006-09-14', 'edimundo Tavares', 'Isadora Costa', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('joão victor', 'Avenida imperador', '(11)46 8674-766', '2006-04-10', 'Gabriel santana', 'Ivonete henrica', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('felipe vivencio', 'Rua André Mateus Viu (87)', '(11)93 3535-836', '2008-01-22', 'wellington Linhares Rodrigues', 'Margarete Vivencio Rodrigues', 'pai/mãe');
INSERT INTO tblalunos(nome, endereco, telefone, nasc, pai, mae, responsavel)
VALUES ('Marlon', 'Rua no fim do mundo', '(11)86 3675-888', '2006-02-04', 'oswaldo Rodrigues', 'Matilda ferreira', 'pai/mãe');


select * from tblalunos;
------------------ criação tabela professor ---------------------

CREATE TABLE tblprofessor
(
codprofessor int identity(1,1) PRIMARY KEY,
nome_prof varchar(40) NOT NULL,
endereco_prof varchar(50) NOT NULL,
);

INSERT INTO tblprofessor(nome_prof, endereco_prof) 
VALUES ('Esmeralda Cheng', 'Vila Medeiros Rua da Ponte preta');
INSERT INTO tblprofessor(nome_prof, endereco_prof) 
VALUES ('Sérgio', 'Osasco Rua Duque de Caxias');
INSERT INTO tblprofessor(nome_prof, endereco_prof) 
VALUES ('Edna Rodrigues', 'Vila mariana Rua São João');
INSERT INTO tblprofessor(nome_prof, endereco_prof) 
VALUES ('Marlon Marques', 'Céus');
INSERT INTO tblprofessor(nome_prof, endereco_prof) 
VALUES ('Cícero', 'Rua japaraiaquara');
INSERT INTO tblprofessor(nome_prof, endereco_prof) 
VALUES ('janilson', 'Rua do rock');

select * from tblprofessor;

------------------ criação tabela cursos ---------------------

CREATE TABLE tblcursos
(
codcurso int identity(1,1) PRIMARY KEY,
nomecurso varchar (60) NOT NULL,
codprofessor int NOT NULL,

foreign key (codprofessor) references tblprofessor,
);

INSERT INTO tblcursos(nomecurso, codprofessor) 
VALUES ('Matematica 2',1);
INSERT INTO tblcursos(nomecurso, codprofessor) 
VALUES ('BD 2',3);
INSERT INTO tblcursos(nomecurso, codprofessor) 
VALUES ('Matematica 2',2);
INSERT INTO tblcursos(nomecurso, codprofessor) 
VALUES ('História',4);
INSERT INTO tblcursos(nomecurso, codprofessor) 
VALUES ('Geografia',6);
INSERT INTO tblcursos(nomecurso, codprofessor) 
VALUES ('História',5);

select * from tblcursos;

------------------ criação tabela notas ---------------------

CREATE TABLE tblnotas
(
codaluno int NOT NULL,
codcurso int NOT NULL,
nota float NOT NULL,
ano int NOT NULL,
bimestre int NOT NULL,
observacao varchar(100) NOT NULL,

foreign key (codaluno) references tblalunos,
foreign key (codcurso) references tblcursos,
);

INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (1,1,'10',2024, 4, 'um gênio');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (2,3,'8',2024, 4, 'bom');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (3,3,'6',2024, 4, 'decente');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (4,1,'3',2024, 4, 'terrivel');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (5,1,'4',2024, 4, 'precisa melhorar');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (6,4,'5',2024, 4, 'medio');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (7,4,'8',2024, 4, 'bom');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (8,1,'7',2024, 4, 'decente');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (9,3,'2',2024, 4, 'trágico');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (10,2,'7',2024, 4, 'decente');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (11,1,'10',2024, 4, 'um gênio');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (12,2,'3',2024, 4, 'terrivel');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (13,3,'9',2024, 4, 'muito bom');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (14,4,'10',2024, 4, 'um gênio');
INSERT INTO tblnotas(codaluno, codcurso, nota, ano, bimestre, observacao)
VALUES (15,3,'8',2024, 4, 'bom');


select * from tblnotas;
