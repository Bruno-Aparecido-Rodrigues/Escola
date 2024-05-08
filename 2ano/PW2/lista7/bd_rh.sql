-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Abr-2023 às 21:34
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_rh`
--

-- --------------------------------------------------------
CREATE DATABASE `bd_rh`;
 use `bd_rh`;
--
-- Estrutura da tabela `cargos`
--

CREATE TABLE `cargos` (
  `codCargo` varchar(15) NOT NULL,
  `Descricao` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cargos`
--

INSERT INTO `cargos` (`codCargo`, `Descricao`) VALUES
('01-Gerente', 'responsável pelo planejamento e controle da execução dos trabalhos de seus subordinados no dia-a-dia de uma determinada empresa'),
('02-Supervisor', 'coordenar projetos e equipes para que atinjam as metas definidas pela direção e pela gerência'),
('03-CEO', 'gerencia toda a companhia, e isso inclui definir os próximos passos dela, definir a estrutura organizacional, a rentabilidade, comunicar-se com a diretoria, entre outras atribuições de grande impacto'),
('04-Analista', 'analisa informações, dados, faz pesquisas e relatórios que identificam oportunidades de melhoria e que impactam a tomada de decisão dos níveis tático e estratégico'),
('05-Assistente', 'colaborar com analistas e coordenadores providenciado materiais, fazendo ligações ou outras atividades que facilitem o trabalho deles'),
('06-Auxiliar', ' trabalham com tarefas consideradas operacionais, como a organização de documentos e arquivos, o preenchimento de formulários, atendimento, digitação de comunicados, entre outros'),
('07-Diretor', 'lida com a operação do dia a dia de suas áreas de responsabilidade e define metas para que elas contribuam com o atingimento dos objetivos definidos pelos CEOs'),
('08-Atendente', 'atendimento - pessoal ou telefônico - garantindo o suporte necessário ao cliente'),
('09-Aprendiz', 'Auxilia nas rotinas do departamento, envolvendo o atendimento ao cliente, acompanhamento de relatórios, elaboração de planilhas e controle de arquivos'),
('10-Presidente', 'defini políticas e estratégias que direcionam a empresa a curto e longo prazo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `departamento`
--

CREATE TABLE `departamento` (
  `CodDepto` varchar(15) NOT NULL,
  `Descricao` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `departamento`
--

INSERT INTO `departamento` (`CodDepto`, `Descricao`) VALUES
('01-ADM', 'elaborar as estratégias da empresa, gerenciar as tarefas, fiscalizar as atividades dos demais departamentos e tomar decisões importantes'),
('02-Financeiro', 'administrar todos os recursos de uma empresa'),
('03-Compras', 'responsável para adquirir todos os insumos necessários para o bom funcionamento da empresa'),
('04-TI', 'Responsável pela manutenção dos hardwares'),
('05-Marketing', 'Realiza a divulgação para os clientes e para os próprios funcionários, para alavancar vendas e os serviços prestados'),
('06-produção', 'desenvolvimento dos produtos, ou dos serviços oferecidos, gestão de estoques, a logística e a manutenção de máquinas e equipamentos.'),
('07-LOG', 'prover recursos e informações para a execução de todas as atividades de uma organização'),
('08-jurídico', 'ajuda na elaboração de contratos e na representação da empresa em ações.'),
('09-RH', 'organização dos funcionários, como as contratações, as demissões e todas as demandas dos colaboradores, conforme as leis trabalhistas.'),
('10-APP', 'responsável pela análise  projetos solicitados pelos clientes');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dependentes`
--

CREATE TABLE `dependentes` (
  `Matricula` int(11) NOT NULL,
  `NomeDependente` varchar(50) NOT NULL,
  `DtNasc` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `dependentes`
--

INSERT INTO `dependentes` (`Matricula`, `NomeDependente`, `DtNasc`) VALUES
(1012, 'Giovana Sebastiana Ferreira', '2006-09-04'),
(1007, 'Telaska Avara Kimimame', '2008-12-09'),
(1004, 'Cirila Silveira', '2009-07-21'),
(1008, 'Isadora Viana', '2010-11-11'),
(1000, 'Luiz Guimarães', '2006-11-16'),
(1003, 'Leon Scott Kenedy', '2010-08-23'),
(1011, 'André Oliveira Paim', '2007-03-02'),
(1013, 'Alan Ferreira Pereira', '2008-12-09'),
(1014, 'Andrewson Freitas', '2010-05-04'),
(1010, 'João Victor', '2009-07-23');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `Matricula` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `DataNasc` date NOT NULL,
  `Nacionalidade` varchar(35) NOT NULL,
  `Sexo` varchar(11) NOT NULL,
  `EstadoCivil` varchar(25) NOT NULL,
  `Rg` varchar(12) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `DataAdmissao` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`Matricula`, `Nome`, `DataNasc`, `Nacionalidade`, `Sexo`, `EstadoCivil`, `Rg`, `CPF`, `Endereco`, `Telefone`, `DataAdmissao`) VALUES
(1000, 'Luiza Guimarães', '1999-12-25', 'Brasileiro', 'Masculino', 'Casado', '35.294.488-2', '884.666.588-07', 'Travessa 4, 746', '(85) 3581-2732', '2002-08-25'),
(1001, 'Cecília Tatiane Andrea Souza', '1950-02-12', 'Espanhol', 'Feminino', 'Solteira', '50.565.405-2', '600.459.867-46', 'Rua 25 de Dezembro, 607', '(68) 2779-6506', '1987-12-02'),
(1002, 'Débora Rosa da Cruz', '1952-01-12', 'Grega', 'Feminino', 'Viúva', '37.647.430-0', '052.010.788-85', 'Rua Gil Peres Caldas, 409', '(21) 2624-6257', '1987-10-02'),
(1003, 'Ezio Auditore Da Firenze', '1459-11-30', 'Italiano', 'Masculino', 'Casado', '38.988.514-9', '514.634.058-71', 'Rua 8-A, 230', '(63) 2528-6438', '1524-11-30'),
(1004, 'Nicolas Silveira', '1961-01-13', 'Alemão', 'Masculino', 'Solteiro', '19.323.681-3', '811.954.815-94', 'Rua Nova Floresta, 741', '(84) 2881-0677', '1991-09-23'),
(1005, 'Heloisa Heloise Marlene Assis', '1964-02-08', 'Cubana', 'Feminino', 'Casada', '12.582.347-2', '114.809.412-12', 'Rua Professora Maria de Lima, 222', '(63) 2711-1838', '1985-07-23'),
(1006, 'Gael Martin Thales Lima', '1979-02-07', 'Russo', 'Masculino', 'Casado', '49.424.036-2', '529.467.241-31', 'Rua João Ouro, 802', '(79) 2871-2972', '1999-02-07'),
(1007, 'Sujiro Kimimame', '1945-08-06', 'Japonês', 'Masculino', 'Casado', '15.830.182-1', '703.761.504-83', 'QS 1 Rua 210 Lote 40,  393', '(61) 3887-5938', '1970-03-12'),
(1008, 'Isabella Natália Viana', '1994-03-15', 'Inglesa', 'Feminino', 'Casada', '20.209.488-1', '234.188.802-07', 'Rua Cruzeiro do Sul, 101', '(62) 3518-4135', '2011-01-01'),
(1009, 'Severino Geraldo Alexandre das Neves', '1950-01-27', 'Americano', 'Masculino', 'Viúvo', '34.142.919-3', '760.683.901-87', 'Travessa A, 975', '(91) 3962-7460', '1970-02-25'),
(1010, 'Lavínia Catarina Caldeira', '2004-02-12', 'Boliviano', 'Feminino', 'Solteira', '41.818.116-0', '073.435.264-64', 'Rua Joaquim José da Silva Xavier, 440', '(81) 2502-7992', '2023-04-24'),
(1011, 'Silvana Caroline Bárbara Porto', '1987-03-13', 'Argentina', 'Feminino', 'Viúva', '20.726.981-6', '945.571.642-93', 'Vila Fernandes, 963', '(84) 2724-1737', '2003-02-15'),
(1012, 'Camila Sebastiana Moura', '1990-01-11', 'Brasileiro', 'Feminino', 'Casada', '43.826.638-9', '036.082.887-67', 'Rua Manoel Xavier Paes Barreto, 802', '(27) 2915-1742', '2010-02-06'),
(1013, 'Maitê Eliane Fernanda Drumond', '1970-03-16', 'Francesa', 'Feminino', 'Solteira', '11.499.556-4', '917.860.919-41', 'Rua Itapegipe, 407', '(27) 2764-9987', '1990-09-09'),
(1014, 'Sophia Sandra Sara Freitas', '1955-02-10', 'Turca', 'Feminino', 'Casada', '30.161.386-2', '640.509.057-44', 'Rua Isidoro Tressi, 523', '(51) 3543-9207', '1987-03-08');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lotacao`
--

CREATE TABLE `lotacao` (
  `Matricula` int(11) NOT NULL,
  `CodDepto` varchar(15) NOT NULL,
  `DtInicio` int(11) NOT NULL,
  `Dtfim` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ocupacao`
--

CREATE TABLE `ocupacao` (
  `Matricula` int(11) NOT NULL,
  `CodigoCargo` varchar(15) NOT NULL,
  `DtInicio` date NOT NULL,
  `Dtfim` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`codCargo`);

--
-- Índices para tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`CodDepto`);

--
-- Índices para tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`Matricula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
