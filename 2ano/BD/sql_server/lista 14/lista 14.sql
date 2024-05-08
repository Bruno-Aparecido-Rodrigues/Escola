create database Cinema;
use Cinema;


create table Salas(
Cod_Sala int identity NOT NULL,
Quant_Cad int Not Null,
Tipo_Sala varchar(20) Not Null,

primary key (Cod_Sala),
)


create table Filmes(
Cod_Filme int, 
Nome_Filme varchar(80) Not Null,
Genero varchar(80) Not Null,
Duracao varchar(8) Not Null,

primary key (Cod_Filme),
)


create table Sessao(
	Cod_Sala int,
	Cod_Filme int,
	DataSessao date Not Null,
	Tipo_Sessao varchar(30),
	Preco float,

	foreign key (Cod_Sala) references Salas,
	foreign key (Cod_Filme) references Filmes

)

---------------------------------------------condominio------------------------------
create database condominio;
use condominio;


create table Condominio(
Cod_condo int identity NOT NULL,
nome_condo varchar(50) Not Null,
CEP_condo varchar(20) NOT NULL

primary key (Cod_condo),
)


create table Proprietario(
Cod_pro int identity, 
CPF_pro varchar(15) Unique Not Null,
dtn_pro date Not Null,
nome_pro varchar(80) Not Null,

primary key (Cod_pro)
)


create table Locatario(
Cod_loca  int identity, 
CPF_loca varchar(15) Unique Not Null,
nome_loca varchar(15) Unique Not Null,
dtn_loca date Not Null,

primary key (Cod_loca)
)


create table Propriedade(
num_propri int Identity,
Cod_condo int,
Cod_loca  int, 
quant_resident int Not Null,
quant_comodo int NOT NULL,
metragem_quadra float,

primary key (num_propri),
foreign key (Cod_condo) references Condominio,
foreign key (Cod_loca) references Locatario
	
)


create table  Possui(
num_pro int,
cod_pro int,
escritura varchar (30) UNIQUE NOT NULL,

foreign key (num_pro) references Propriedade,
foreign key (Cod_pro) references Proprietario
)