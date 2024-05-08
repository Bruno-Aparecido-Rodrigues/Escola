-- criar bd zoologico
CREATE DATABASE zoo_bd;

-- abrir bd eletronic_store
use zoo_bd;

------------------ criação tabela func ---------------------
CREATE TABLE Cargo
(
cod_cargo int identity(1,1) PRIMARY KEY,
descricao_cargo varchar(30) NOT NULL,
);

CREATE TABLE Funcionario
(
cod_func int identity(1,1) PRIMARY KEY,
nome_func varchar(70) NOT NULL,
CPF_func varchar(14) NOT NULL,
RG_func varchar(12) NOT NULL,
dtnac_func date NOT NULL,
endereco_func varchar(50) NOT NULL,
cod_cargo int NOT NULL,

foreign key (cod_cargo) references Cargo,
);


INSERT INTO Funcionario (nome_func, CPF_func, RG_func, dtnac_func, endereco_func) 
VALUES ('Yeager', '240.510.598-55', '64.251.892-0', '2006-03-23', '3 marias.com');


CREATE TABLE Ala
(
cod_ala int identity(1,1) PRIMARY KEY,
nome_ala varchar(30) NOT NULL,
);


CREATE TABLE Container
(
cod_container int identity(1,1) PRIMARY KEY,
tipo_container varchar(20) NOT NULL,
espaco_container float NOT NULL,
cod_ala int NOT NULL,

foreign key (cod_ala) references Ala,
);

CREATE TABLE Classe
(
cod_classe int identity(1,1) PRIMARY KEY,
descricao_classe varchar(30) NOT NULL,
);

CREATE TABLE Animal
(
cod_animal int identity(1,1) PRIMARY KEY,
nome_animal varchar(70) NOT NULL,
cor_animal varchar(30) NOT NULL,
altura_animal varchar(5) NOT NULL,
cod_container int NOT NULL,
cod_classe int NOT NULL,
especie_animal varchar(50) NOT NULL,

foreign key (cod_container) references Container,
foreign key (cod_classe) references Classe,
);

CREATE TABLE Veterinario
(
cod_vete int identity(1,1) PRIMARY KEY,
CRMV varchar(13) NOT NULL,
cod_func int NOT NULL,

foreign key (cod_func) references Funcionario,
);

CREATE TABLE agendar_consulta
(
dt_consulta date NOT NULL,
hora_consulta time NOT NULL,
cod_animal int NOT NULL,
cod_vete int NOT NULL,

foreign key (cod_animal) references Animal,
foreign key (cod_vete) references Veterinario,
);


CREATE TABLE agendar_limpeza
(
dt_limpeza date NOT NULL,
hora_limpeza time NOT NULL,
cod_func int NOT NULL,
cod_container int NOT NULL,

foreign key (cod_func) references Funcionario,
foreign key (cod_container) references Container,
);