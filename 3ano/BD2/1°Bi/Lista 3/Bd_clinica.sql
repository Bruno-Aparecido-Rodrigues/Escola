create database Clinica;

use Clinica;

create table ambulatorios(
nroa int identity(1,1) PRIMARY KEY,
andar int NOT NULL,
capacidade int,
);

create table medicos(
codm int identity(1,1) PRIMARY KEY,
nome varchar(40) NOT NULL,
nasc date NOT NULL,
especialidade varchar(20),
cpf varchar(14) UNIQUE,
cidade varchar(30),
nroa int,

foreign key (nroa) references ambulatorios,
);

create table pacientes(
codp int identity(1,1) PRIMARY KEY,
nome varchar(40) NOT NULL,
nasc date NOT NULL,
cidade varchar(30),
cpf varchar(14) UNIQUE,
doenca varchar(40) NOT NULL,
);

create table funcionarios(
codf int identity(1,1) PRIMARY KEY,
nome varchar(40) NOT NULL,
nasc date,
cpf varchar(14) UNIQUE,
cidade varchar(30),
salario float,
cargo varchar(20),
nroa int,

foreign key (nroa) references ambulatorios,
);

create table consultas(
codm int,
codp int,
datac date,
hora time,

foreign key (codm) references medicos,
foreign key (codp) references pacientes,
);

insert into ambulatorios(andar, capacidade) values
(1,30), (1, 50), (2, 40), (2, 25), (2, 55);


insert into medicos(nome, nasc, especialidade, cpf, cidade, nroa) values
('Joao', '01-01-1980', 'ortopedia', 10000100000, 'Florianopolis', 1),
('Maria', '02-02-1981', 'traumatologia', 10000110000, 'Blumenau', 2), 
('Pedro', '03-03-1982', 'pediatria', 11000100000, 'São José', 5), 
('Carlos', '04-04-2000', 'ortopedia', 11000110000, 'Joinville', 4), 
('Marcia', '03-05-1999', 'neurologia', 11000111000, 'Biguacu', 3);


insert into pacientes(nome, nasc, cidade, cpf, doenca) values
('Ana', '02-02-1980', 'Florianopolis', 20000200000, 'gripe'), 
('Paulo', '24-01-2000', 'Palhoca', 20000220000, 'fratura'), 
('Lucia', '30-12-2001', 'Biguacu', 22000200000, 'tendinite'),
('Carlos', '28-07-2005', 'Joinville', 11000110000, 'sarampo');


insert into funcionarios(nome, nasc, cidade, salario, cpf, cargo, nroa) values
('Rita', '31-12-2000', 'Sao Jose', 1200, 20000100000, 'Recepcionista', 5), 
('Maria', '29-12-1999', 'Palhoca', 1220, 30000110000, 'Diretor', 2), 
('Caio', '10-10-1980', 'Florianopolis', 1100, 41000100000, 'Enfermeiro', 4),
('Carlos', '09-08-2005', 'Florianopolis', 1200, 51000110000, 'Recepcionista', 3),
('Paula', '08-09-2006', 'Florianopolis', 2500, 61000111000, 'Enfermeiro', 5);


insert into consultas(codm, codp, datac, hora) values
(1,1, '2006-06-12', '14:00'), (1,4, '2006-06-13', '10:00'), 
(2,1, '2006-06-13', '9:00'), (2,2, '2006-06-13', '11:00'), 
(2,3, '2006-06-14', '14:00'), (2,4, '2006-06-14', '17:00'), 
(3,1, '2006-06-19', '18:00'), (3,3, '2006-06-12', '10:00'), 
(3,4, '2006-06-19', '13:00'), (4,4, '2006-06-20', '13:00'), 
(4,4, '2006-06-22', '19:30');

update pacientes set cidade = 'Ilhota' where nome like 'Paulo';
select * from pacientes;

update consultas set hora = '12:00', datac = '2006-06-04' where codm = 1 and codp = 4;
select * from consultas;

update pacientes set doenca = 'gastrite' where nome = 'Ana';
select * from pacientes;

update consultas set hora = '14:30' where codm = 3 and codp = 4;
select * from consultas;

delete funcionarios where codf = 4;
select * from funcionarios;

delete consultas where hora > '19:00';
select * from consultas;


Delete from consultas WHERE codp IN (SELECT codp FROM pacientes WHERE doenca = 'gastrite' OR nasc > '2014-03-08');
delete pacientes where doenca = 'gastrite' or nasc > '2014-03-08';
select * from pacientes;


delete medicos where cidade = 'Biguacu' or cidade = 'Palhoca';
select * from medicos;

select * from consultas;
select * from funcionarios;
select * from pacientes;
select * from medicos;
select * from ambulatorios;