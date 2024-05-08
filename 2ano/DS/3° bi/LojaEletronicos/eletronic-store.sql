-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 31-Ago-2023 às 19:36
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `eletronic-store`
--
create DATABASE `eletronic-store`;
use `eletronic-store`;
-- --------------------------------------------------------

--
-- Estrutura da tabela `cargo`
--

CREATE TABLE `cargo` (
  `cod_cargo` int(11) NOT NULL,
  `nome_cargo` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cargo`
--

INSERT INTO `cargo` (`cod_cargo`, `nome_cargo`) VALUES
(1, 'gerente'),
(2, 'caixa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dadoscliente`
--

CREATE TABLE `dadoscliente` (
  `cod_cli` int(11) NOT NULL,
  `nome_cli` varchar(60) NOT NULL,
  `cpf_cli` int(11) NOT NULL,
  `email_cli` varchar(50) NOT NULL,
  `dtnasc_cli` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `cod_func` int(11) NOT NULL,
  `cod_cargo` int(11) NOT NULL,
  `nome_func` varchar(60) NOT NULL,
  `email_func` varchar(50) NOT NULL,
  `tel_func` varchar(11) NOT NULL,
  `data_adms` date NOT NULL,
  `dtnasc_func` date NOT NULL,
  `login_func` varchar(30) NOT NULL,
  `senha_func` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`cod_func`, `cod_cargo`, `nome_func`, `email_func`, `tel_func`, `data_adms`, `dtnasc_func`, `login_func`, `senha_func`) VALUES
(1, 1, 'André Oliveira Paim', 'angreen2016br@gmail.com', '11988329072', '2023-08-28', '2007-03-02', 'andre', 'A400058dre'),
(2, 2, 'Bruno Aparecido Vivencio Rodrigues', 'aparecidobruno749@gmail.com', '11913555780', '2023-08-28', '2006-11-15', 'Sancho', 'Brunola911'),
(3, 2, 'Igor Nogueira Pessoa', 'igornnpessoa@gmail.com', '11993600432', '2023-08-28', '2006-04-22', 'TheBester', 'senha123@');

-- --------------------------------------------------------

--
-- Estrutura da tabela `itensnfiscal`
--

CREATE TABLE `itensnfiscal` (
  `cod_nota` int(11) NOT NULL,
  `cod_pro` int(11) NOT NULL,
  `qtcompra` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `notafiscal`
--

CREATE TABLE `notafiscal` (
  `cod_nota` int(11) NOT NULL,
  `cod_cli` int(11) NOT NULL,
  `cod_func` int(11) NOT NULL,
  `dtcompra_nota` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `cod_pro` int(11) NOT NULL,
  `preco` double NOT NULL,
  `estoque` int(11) NOT NULL,
  `codbarras` varchar(10) NOT NULL COMMENT 'CÓDIGO 128 (padrão desse código de barras)',
  `nome_pro` varchar(80) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`cod_cargo`);

--
-- Índices para tabela `dadoscliente`
--
ALTER TABLE `dadoscliente`
  ADD PRIMARY KEY (`cod_cli`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cod_func`);

--
-- Índices para tabela `notafiscal`
--
ALTER TABLE `notafiscal`
  ADD PRIMARY KEY (`cod_nota`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`cod_pro`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cargo`
--
ALTER TABLE `cargo`
  MODIFY `cod_cargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `dadoscliente`
--
ALTER TABLE `dadoscliente`
  MODIFY `cod_cli` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `cod_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `notafiscal`
--
ALTER TABLE `notafiscal`
  MODIFY `cod_nota` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `cod_pro` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
