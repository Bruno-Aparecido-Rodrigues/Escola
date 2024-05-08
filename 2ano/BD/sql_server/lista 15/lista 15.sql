---------------------------------------------ficha de paciente------------------------------
create database ficha_paciente;
use ficha_paciente;


create table Paciente(
numero_pac int identity NOT NULL,
nome_pac varchar(50) Not Null,
dtn_pac date NOT NULL,
sexo_pac varchar(9) Not Null,
cod_conve int,
estcivil_pac varchar(8) Not Null,
RG_pac varchar(15) NOT NULL,
tel_pac varchar(12) Not Null,
endereco_pac varchar(40) NOT NULL,


primary key (numero_pac),
foreign key (cod_conve) references Convenio
)

create table Convenio(
cod_conve int identity, 
descricao_conve varchar(30) Not Null,

primary key (cod_conve)
)

create table Medico(
cod_med  int identity, 
cod_esp int Not Null,
nome_med varchar(50) Not Null,

primary key (cod_med),
foreign key (cod_esp) references Especializacao
)

create table Especializacao(
cod_esp int identity, 
descricao_esp varchar(30) Not Null,

primary key (cod_esp)
)

create table Consulta(
numero_pac int,
num_con int IDENTITY,
dt_con  date, 
cod_med int Not Null,
diagnostico_con varchar(50) NOT NULL,

primary key (num_con),
foreign key (numero_pac) references Paciente,
foreign key (cod_med) references Medico
	
)


create table Exame(
num_con int,
exame_ex  varchar(50), 
dt_ex date Not Null,
resultados_ex varchar(50) NOT NULL,

foreign key (num_con) references Consulta,
	
)