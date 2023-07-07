-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-07-2023 a las 21:50:39
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agendavirtual`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto`
--

CREATE TABLE `contacto` (
  `idcontacto` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechanac` date DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fecharegistro` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `contacto`
--

INSERT INTO `contacto` (`idcontacto`, `nombre`, `fechanac`, `celular`, `email`, `fecharegistro`) VALUES
(1, 'Luciano', '1995-02-09', '1137601819', 'lucianocoronel48@gmail.com', '2023-07-05 00:00:00'),
(2, 'Melany', '1995-02-09', '1137601819', 'lucianocoronel48@gmail.com', '2023-07-05 00:00:00'),
(6, 'gary', NULL, '', 'gary.', '2023-07-07 15:54:05'),
(7, 'Ingles', '2022-10-21', '21346576', 'a@a.com', '2023-07-07 15:54:53'),
(8, 'asd', '2023-07-01', '54745613216584', 'sadasd@asdsad.com', '2023-07-07 18:20:15'),
(9, 'jgukg', '2023-07-29', '1137601819', 'gudiladiva@hotmail.com', '2023-07-07 18:26:31'),
(10, 'roberto', '2023-07-24', '45646541315', 'roberto@gmail.com', '2023-07-07 19:22:11'),
(11, 'nuevo', '2023-06-29', '5666', 'nuevo@nuevo.com', '2023-07-07 19:26:15');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contacto`
--
ALTER TABLE `contacto`
  ADD PRIMARY KEY (`idcontacto`),
  ADD UNIQUE KEY `idcontacto_UNIQUE` (`idcontacto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contacto`
--
ALTER TABLE `contacto`
  MODIFY `idcontacto` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
