create database BD_CD;

use BD_CD;

-------------tabela cds--------------------
create table Cds(
cod_cd int identity(1,1) PRIMARY KEY,
Nome_cd varchar(50) NOT NULL,
DataCompra date NOT NULL,
ValorPago float NOT NULL,
LocalCompra varchar(50) NOT NULL,
Album varchar(3) NOT NULL,
);

-- Inserção de dados na tabela Cds
INSERT INTO Cds (Nome_cd, DataCompra, ValorPago, LocalCompra, Album) VALUES
('Thriller', '2023-10-15', '25.00', 'Amazon', 'Sim'),
('Back in Black', '2023-11-02', '20.00', 'Best Buy', 'Sim'),
('Abbey Road', '2024-01-05', '30.00', 'Tower Records', 'Sim'),
('The Dark Side of the Moon', '2024-02-20', '22.50', 'HMV', 'Sim'),
('Rumours', '2024-03-10', '28.00', 'Target', 'Sim');

--------------tabela musicas--------------------
create table Musicas(
cod_cd int NOT NULL,
Numero_musica int NOT NULL,
Nome_musica varchar(50) NOT NULL,
Artista varchar(50) NOT NULL,
Tempo time NOT NULL,foreign key (cod_cd) references Cds,
);

-- Inserção de dados na tabela Musica
INSERT INTO Musicas (cod_cd,Numero_musica, Nome_musica, Artista, Tempo) VALUES
(1, 1, 'Thriller', 'Michael Jackson', '00:05:57'),
(1, 2, 'Billie Jean', 'Michael Jackson', '00:04:54'),
(1, 3, 'Beat It', 'Michael Jackson', '00:04:18'),
(2, 1, 'Back in Black', 'AC/DC', '00:04:15'),
(2, 2, 'You Shook Me All Night Long', 'AC/DC', '00:03:30'),
(3, 1, 'Come Together', 'The Beatles', '00:04:20'),
(3, 2, 'Here Comes the Sun', 'The Beatles', '00:03:05'),
(3, 3, 'Something', 'The Beatles', '00:03:03'),
(4, 1, 'Money', 'Pink Floyd', '00:06:23'),
(4, 2, 'Time', 'Pink Floyd', '00:06:53'),
(5, 1, 'Go Your Own Way', 'Fleetwood Mac', '00:03:38'),
(5, 2, 'Dreams', 'Fleetwood Mac', '00:04:14'),
(5, 3, 'The Chain', 'Fleetwood Mac', '00:04:28'),
(5, 4, 'Gold Dust Woman', 'Fleetwood Mac', '00:05:03'),
(5, 5, 'Don''t Stop', 'Fleetwood Mac', '00:03:13');

-- Selects
--1
select * from Cds;
select * from Musicas;
--2
select Nome_cd, DataCompra from Cds ORDER BY Nome_cd;
--3
select Nome_cd, DataCompra from Cds ORDER BY DataCompra desc;
--4
select Nome_cd, DataCompra, ValorPago from Cds ORDER BY ValorPago desc;
--5
select SUM (ValorPago) as TotalGasto from Cds;
--6
select * from Musicas where cod_cd = 1;
--7
select Nome_musica, Artista from Musicas;
--8
select Numero_musica, Nome_musica, Tempo from Musicas where cod_cd = 5 ORDER BY Numero_musica;
--9
select COUNT(*) AS TotalMusicas from Musicas;
--10 ---foi colocado os beatles, substituindo o José Pedro
select Nome_musica from Musicas where Artista = 'The Beatles';
--11 ---foi colocado a amazon, substituindo o submarino
select Nome_cd from Cds where LocalCompra = 'Amazon';
--12
select * from Musicas ORDER BY Nome_musica;
--13
select Nome_cd from Cds where Album = 'Sim';
--14
select AVG(ValorPago) as MediaPrecos from Cds;