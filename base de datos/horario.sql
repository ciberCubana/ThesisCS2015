-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 15-06-2015 a las 17:47:09
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `horario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem1`
--

CREATE TABLE IF NOT EXISTS `afectsem1` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(2) NOT NULL,
  `L2` int(2) NOT NULL,
  `L3` int(2) NOT NULL,
  `L4` int(2) NOT NULL,
  `L5` int(2) NOT NULL,
  `L6` int(2) NOT NULL,
  `M1` int(2) NOT NULL,
  `M2` int(2) NOT NULL,
  `M3` int(2) NOT NULL,
  `M4` int(2) NOT NULL,
  `M5` int(2) NOT NULL,
  `M6` int(2) NOT NULL,
  `MI1` int(2) NOT NULL,
  `MI2` int(2) NOT NULL,
  `MI3` int(2) NOT NULL,
  `MI4` int(2) NOT NULL,
  `MI5` int(2) NOT NULL,
  `MI6` int(2) NOT NULL,
  `J1` int(2) NOT NULL,
  `J2` int(2) NOT NULL,
  `J3` int(2) NOT NULL,
  `J4` int(2) NOT NULL,
  `J5` int(2) NOT NULL,
  `J6` int(2) NOT NULL,
  `V1` int(2) NOT NULL,
  `V2` int(2) NOT NULL,
  `V3` int(2) NOT NULL,
  `V4` int(2) NOT NULL,
  `V5` int(2) NOT NULL,
  `V6` int(2) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem1`
--

INSERT INTO `afectsem1` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem2`
--

CREATE TABLE IF NOT EXISTS `afectsem2` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem2`
--

INSERT INTO `afectsem2` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem3`
--

CREATE TABLE IF NOT EXISTS `afectsem3` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem3`
--

INSERT INTO `afectsem3` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem4`
--

CREATE TABLE IF NOT EXISTS `afectsem4` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem4`
--

INSERT INTO `afectsem4` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem5`
--

CREATE TABLE IF NOT EXISTS `afectsem5` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem5`
--

INSERT INTO `afectsem5` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem6`
--

CREATE TABLE IF NOT EXISTS `afectsem6` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem6`
--

INSERT INTO `afectsem6` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem7`
--

CREATE TABLE IF NOT EXISTS `afectsem7` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem7`
--

INSERT INTO `afectsem7` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem8`
--

CREATE TABLE IF NOT EXISTS `afectsem8` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem8`
--

INSERT INTO `afectsem8` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem9`
--

CREATE TABLE IF NOT EXISTS `afectsem9` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem9`
--

INSERT INTO `afectsem9` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem10`
--

CREATE TABLE IF NOT EXISTS `afectsem10` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem10`
--

INSERT INTO `afectsem10` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem11`
--

CREATE TABLE IF NOT EXISTS `afectsem11` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem11`
--

INSERT INTO `afectsem11` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem12`
--

CREATE TABLE IF NOT EXISTS `afectsem12` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem12`
--

INSERT INTO `afectsem12` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem13`
--

CREATE TABLE IF NOT EXISTS `afectsem13` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem13`
--

INSERT INTO `afectsem13` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem14`
--

CREATE TABLE IF NOT EXISTS `afectsem14` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem14`
--

INSERT INTO `afectsem14` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem15`
--

CREATE TABLE IF NOT EXISTS `afectsem15` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem15`
--

INSERT INTO `afectsem15` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem16`
--

CREATE TABLE IF NOT EXISTS `afectsem16` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem16`
--

INSERT INTO `afectsem16` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base_de_Datos_II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes_de_Computadoras', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem17`
--

CREATE TABLE IF NOT EXISTS `afectsem17` (
  `nombreProf` varchar(50) NOT NULL,
  `nombreAsig` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreProf`,`nombreAsig`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `afectsem17`
--

INSERT INTO `afectsem17` (`nombreProf`, `nombreAsig`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Adis Perla', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ana Julia Pino', 'Economia Politica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Andres Telleria', 'Programacion_Web', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Betancourt', 'Ingles', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Lopez Porrero', 'Base de Datos II', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Beatriz Maria Mendez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Carmen LuisA Gonzalez', 'Ingles', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Daniel Galvez', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('David Hernandez', 'Defensa Nacional', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ernesto M. Rodriguez', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Gonzalo Napoles', 'Matematica Numerica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Guillermo Sosa', 'Analisis_Matematico', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Isel Moreno Montes de Oca', 'Logica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Jorge Polo', 'Complementos_de_Compilacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Arquitectura_de_Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Carlos Ortega', 'Redes de Computadoras', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Juan Manuel Navarro', 'Probabilidades', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leidys Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Leticia Arco', 'Matematica_Discreta_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Lizet Denova', 'Compiladores', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Marilyn Bello', 'Algebra_I', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Mateo Lezcano', 'Sistemas Operativos', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rafael Chaviano', 'Matematica Numerica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramiro Perez Vazquez', 'Programacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ramon Ortega', 'Geometria', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Reinier Oves', 'Programacion C/C++', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Rosendo Moreno', 'Ingenieria de Sofware', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yailen Martinez', 'Modelo_de_Optimizacion', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yanet Monteagudo', 'Filosofia', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Yisliany Placencia', 'Teoria_Sociopolitica', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Zoila Zenaida Garcia', 'Programacion_Declarativa', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE IF NOT EXISTS `asignatura` (
  `nombre` varchar(50) NOT NULL,
  `carrera` varchar(50) NOT NULL,
  `ano` int(1) NOT NULL,
  `abrev` varchar(5) NOT NULL,
  `cantHC` int(3) NOT NULL,
  `s11` varchar(2) DEFAULT NULL,
  `s21` varchar(2) DEFAULT NULL,
  `s31` varchar(2) DEFAULT NULL,
  `s41` varchar(2) DEFAULT NULL,
  `s51` varchar(2) DEFAULT NULL,
  `s61` varchar(2) DEFAULT NULL,
  `s71` varchar(2) DEFAULT NULL,
  `s81` varchar(2) DEFAULT NULL,
  `s91` varchar(2) DEFAULT NULL,
  `s101` varchar(2) DEFAULT NULL,
  `s111` varchar(2) DEFAULT NULL,
  `s121` varchar(2) DEFAULT NULL,
  `s131` varchar(2) DEFAULT NULL,
  `s141` varchar(2) DEFAULT NULL,
  `s151` varchar(2) DEFAULT NULL,
  `s161` varchar(2) DEFAULT NULL,
  `s171` varchar(2) DEFAULT NULL,
  `s12` varchar(2) DEFAULT NULL,
  `s22` varchar(2) DEFAULT NULL,
  `s32` varchar(2) DEFAULT NULL,
  `s42` varchar(2) DEFAULT NULL,
  `s52` varchar(2) DEFAULT NULL,
  `s62` varchar(2) DEFAULT NULL,
  `s72` varchar(2) DEFAULT NULL,
  `s82` varchar(2) DEFAULT NULL,
  `s92` varchar(2) DEFAULT NULL,
  `s102` varchar(2) DEFAULT NULL,
  `s112` varchar(2) DEFAULT NULL,
  `s122` varchar(2) DEFAULT NULL,
  `s132` varchar(2) DEFAULT NULL,
  `s142` varchar(2) DEFAULT NULL,
  `s152` varchar(2) DEFAULT NULL,
  `s162` varchar(2) DEFAULT NULL,
  `s172` varchar(2) DEFAULT NULL,
  `s13` varchar(2) DEFAULT NULL,
  `s23` varchar(2) DEFAULT NULL,
  `s33` varchar(2) DEFAULT NULL,
  `s43` varchar(2) DEFAULT NULL,
  `s53` varchar(2) DEFAULT NULL,
  `s63` varchar(2) DEFAULT NULL,
  `s73` varchar(2) DEFAULT NULL,
  `s83` varchar(2) DEFAULT NULL,
  `s93` varchar(2) DEFAULT NULL,
  `s103` varchar(2) DEFAULT NULL,
  `s113` varchar(2) DEFAULT NULL,
  `s123` varchar(2) DEFAULT NULL,
  `s133` varchar(2) DEFAULT NULL,
  `s143` varchar(2) DEFAULT NULL,
  `s153` varchar(2) DEFAULT NULL,
  `s163` varchar(2) DEFAULT NULL,
  `s173` varchar(2) DEFAULT NULL,
  `s14` varchar(2) DEFAULT NULL,
  `s24` varchar(2) DEFAULT NULL,
  `s34` varchar(2) DEFAULT NULL,
  `s44` varchar(2) DEFAULT NULL,
  `s54` varchar(2) DEFAULT NULL,
  `s64` varchar(2) DEFAULT NULL,
  `s74` varchar(2) DEFAULT NULL,
  `s84` varchar(2) DEFAULT NULL,
  `s94` varchar(2) DEFAULT NULL,
  `s104` varchar(2) DEFAULT NULL,
  `s114` varchar(2) DEFAULT NULL,
  `s124` varchar(2) DEFAULT NULL,
  `s134` varchar(2) DEFAULT NULL,
  `s144` varchar(2) DEFAULT NULL,
  `s154` varchar(2) DEFAULT NULL,
  `s164` varchar(2) DEFAULT NULL,
  `s174` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`nombre`,`carrera`,`ano`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`nombre`, `carrera`, `ano`, `abrev`, `cantHC`, `s11`, `s21`, `s31`, `s41`, `s51`, `s61`, `s71`, `s81`, `s91`, `s101`, `s111`, `s121`, `s131`, `s141`, `s151`, `s161`, `s171`, `s12`, `s22`, `s32`, `s42`, `s52`, `s62`, `s72`, `s82`, `s92`, `s102`, `s112`, `s122`, `s132`, `s142`, `s152`, `s162`, `s172`, `s13`, `s23`, `s33`, `s43`, `s53`, `s63`, `s73`, `s83`, `s93`, `s103`, `s113`, `s123`, `s133`, `s143`, `s153`, `s163`, `s173`, `s14`, `s24`, `s34`, `s44`, `s54`, `s64`, `s74`, `s84`, `s94`, `s104`, `s114`, `s124`, `s134`, `s144`, `s154`, `s164`, `s174`) VALUES
('Algebra_I', 'CC', 1, 'Alg', 80, 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', '', 'C', 'P', 'P', 'P', 'P', 'P', 'P', 'C', 'P', 'C', '', 'P', 'C', 'P', 'P', 'P', '', 'P', 'P', '', '', '', 'E', '', 'P', '', 'P', '', 'E', 'P', '', '', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Analisis_Matematico', 'CC', 2, 'AM', 96, 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', '', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'E', 'P', 'P', 'P', 'P', 'P', 'P', 'P', '', 'C', 'P', 'C', 'E', 'C', 'P', 'C', 'P', 'C', 'P', 'C', 'P', 'C', 'E', 'C', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Arquitectura_de_Computadoras', 'CC', 2, 'AC', 48, 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', '', 'P', '', 'C', '', 'P', '', 'P', '', 'E', '', 'P', '', '', '', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Base de Datos II', 'CC', 3, 'BDII', 32, '', 'C', 'C', 'C', 'C', '', '', 'C', '', '', '', 'C', '', 'C', '', 'C', '', '', '', '', '', '', '', '', '', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Compiladores', 'CC', 3, 'C', 64, 'C', 'C', 'P', 'C', 'P', 'C', 'E', 'C', 'C', 'C', 'P', 'C', 'C', 'C', 'C', '', '', '', 'P', 'C', '', '', 'C', 'P', 'P', 'P', '', 'C', 'P', 'P', 'E', 'P', '', '', '', '', 'P', '', '', 'P', '', '', '', '', 'P', '', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Complementos_de_Compilacion', 'CC', 4, 'CC', 24, 'C', '', '', '', '', '', 'C', '', '', 'C', 'P', '', '', '', '', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Defensa Nacional', 'CC', 3, 'DN', 42, 'C', 'C', '', 'P', 'P', 'C', 'C', 'C', 'P', 'C', 'P', 'C', '', 'C', 'P', 'P', '', '', 'C', '', 'C', '', '', 'P', '', '', '', 'P', '', '', 'C', '', '', '', '', '', '', 'C', '', '', 'E', '', '', '', '', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Economia Politica', 'CC', 2, 'EP', 32, 'C', 'C', 'P', 'C', 'P', '', 'P', 'P', 'E', 'C', 'P', 'C', 'P', 'C', 'P', 'P', '', '', '', '', '', '', '', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Estructuras_de_Datos_y_Algoritmos_I', 'CC', 2, 'EDAI', 64, 'C', 'P', 'P', 'C', 'P', 'P', 'C', 'P', 'C', 'C', 'P', 'C', 'P', 'E', 'P', '', '', 'P', 'C', 'P', 'P', 'C', 'P', 'P', '', 'P', 'P', '', 'P', '', 'C', 'P', '', '', '', '', '', '', '', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Filosofia', 'CC', 1, 'F', 64, 'C', 'C', 'C', 'C', 'P', 'C', 'C', 'C', 'C', 'C', 'P', 'C', 'P', 'C', 'C', 'P', '', 'C', 'P', 'P', 'P', '', 'P', 'P', 'P', 'P', 'P', 'P', 'C', 'P', 'C', 'P', 'P', '', '', '', '', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Geometria', 'CC', 1, 'GA', 64, 'C', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', '', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'P', '', '', '', '', '', '', 'E', '', '', '', '', '', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Ingenieria de Sofware', 'CC', 3, 'ISW', 48, 'C', 'P', 'P', 'P', 'C', 'C', 'P', 'E', 'C', 'C', 'P', 'C', '', 'P', 'E', '', '', 'C', 'C', '', '', 'P', '', 'C', '', '', '', '', 'C', '', 'C', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Ingles', 'CC', 1, 'Ing', 64, 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'E', '', 'P', 'P', 'P', 'P', 'P', 'P', 'E', 'P', 'P', 'P', '', 'P', 'P', 'P', 'P', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Ingles', 'CC', 2, 'Ing', 58, 'P', 'P', 'P', 'P', 'P', 'P', 'E', 'P', 'P', 'P', 'P', 'P', '', 'P', 'P', 'E', '', 'P', 'P', 'P', 'P', 'P', '', 'P', 'P', 'P', 'P', 'P', '', '', 'P', 'P', 'P', '', '', '', 'P', '', '', '', '', 'P', '', '', '', '', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Logica', 'CC', 1, 'Log', 64, 'C', 'C', 'C', 'C', 'E', 'C', 'C', 'C', 'C', 'C', 'E', 'C', 'C', 'C', 'E', 'C', '', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', '', 'P', 'P', 'P', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Matematica Numerica', 'CC', 3, 'MN', 64, 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'P', 'C', 'C', 'C', 'C', 'P', 'E', '', 'C', 'P', 'P', '', 'E', 'P', 'P', 'P', 'P', '', 'E', 'P', 'P', 'P', '', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Matematica_Discreta_I', 'CC', 2, 'MDI', 64, 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'P', 'P', 'P', 'P', 'P', '', 'P', 'P', 'P', 'E', 'P', 'P', '', 'P', 'P', 'P', 'E', 'C', 'C', 'C', 'C', 'E', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Modelo_de_Optimizacion', 'CC', 4, 'MO', 64, 'C', 'P', 'P', 'C', 'C', 'E', 'P', 'C', 'C', 'P', 'P', 'P', 'C', 'P', 'C', 'C', '', 'P', 'C', 'P', 'P', 'P', 'C', 'P', 'P', 'P', 'C', 'C', 'E', 'P', 'C', 'P', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Probabilidades', 'CC', 4, 'Prob', 64, 'C', 'C', 'P', 'P', 'P', 'P', 'C', 'P', 'C', 'P', 'C', 'P', 'C', '', '', '', '', 'P', 'P', 'C', 'E', 'C', 'C', 'P', 'E', 'C', 'C', 'P', '', 'P', '', '', '', '', 'P', '', 'P', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Programacion', 'CC', 1, 'P', 98, 'C', 'P', 'P', 'E', 'P', 'P', 'E', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'C', '', 'P', 'C', 'P', 'P', 'P', 'C', 'P', 'P', 'P', 'C', 'E', 'C', 'P', 'P', 'E', '', '', 'P', '', 'C', 'C', 'C', '', 'C', 'C', 'C', '', 'C', '', 'C', 'C', 'C', '', '', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Programacion C/C++', 'CC', 3, 'C/C++', 48, 'C', 'C', 'C', 'C', 'E', 'C', 'C', 'P', 'P', 'C', 'P', '', 'E', 'C', 'P', 'E', '', 'C', 'P', 'P', 'P', '', '', '', 'C', '', '', '', '', '', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Programacion_Declarativa', 'CC', 4, 'PD', 64, 'C', 'C', 'C', 'C', 'E', 'P', 'P', 'P', 'P', 'C', 'P', '', 'C', 'P', '', '', '', 'C', 'P', 'P', '', 'C', '', 'C', 'C', 'E', 'C', 'C', '', 'E', 'P', '', '', '', 'P', 'C', '', '', '', '', '', '', '', '', '', '', '', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Programacion_Web', 'CC', 4, 'PW', 48, 'C', 'P', 'P', '', 'C', 'C', '', 'C', 'C', 'P', 'C', '', 'E', 'C', '', '', '', 'C', 'C', '', '', 'P', 'P', '', 'P', 'P', '', 'P', '', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Redes_de_Computadoras', 'CC', 3, 'RC', 64, 'C', 'P', 'E', 'P', 'C', 'P', 'P', 'C', 'P', 'E', 'C', 'C', 'P', 'P', '', '', '', 'C', 'P', 'C', 'C', 'C', 'C', 'C', 'P', '', 'C', 'C', '', 'C', 'E', '', '', '', 'C', '', '', 'P', '', 'C', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Sistemas Operativos', 'CC', 3, 'SO', 64, 'C', 'C', 'C', '', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'E', 'P', 'C', '', 'C', '', 'P', '', 'E', 'P', '', 'P', 'P', 'E', '', 'P', 'P', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('Teoria_Sociopolitica', 'CC', 4, 'TS', 32, 'C', 'C', 'C', '', 'P', 'P', '', 'C', 'P', '', 'P', 'P', '', 'P', '', '', '', '', '', '', '', 'C', '', '', 'P', 'C', '', 'P', 'P', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aula`
--

CREATE TABLE IF NOT EXISTS `aula` (
  `numero` int(11) NOT NULL,
  `tipo` int(4) NOT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupos`
--

CREATE TABLE IF NOT EXISTS `grupos` (
  `numero` int(11) NOT NULL,
  `carrera` varchar(20) NOT NULL,
  `ano` int(11) NOT NULL,
  `aulaConf` int(11) NOT NULL,
  `aulaCp` int(11) NOT NULL,
  PRIMARY KEY (`numero`,`carrera`,`ano`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grupos`
--

INSERT INTO `grupos` (`numero`, `carrera`, `ano`, `aulaConf`, `aulaCp`) VALUES
(1, 'CC', 1, 0, 0),
(1, 'CC', 2, 0, 0),
(1, 'CC', 3, 0, 0),
(1, 'CC', 4, 0, 0),
(2, 'CC', 1, 0, 0),
(2, 'CC', 2, 0, 0),
(2, 'CC', 4, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem1`
--

CREATE TABLE IF NOT EXISTS `labsem1` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(11) NOT NULL,
  `carrera` varchar(20) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem1`
--

INSERT INTO `labsem1` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem2`
--

CREATE TABLE IF NOT EXISTS `labsem2` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem2`
--

INSERT INTO `labsem2` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem3`
--

CREATE TABLE IF NOT EXISTS `labsem3` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem3`
--

INSERT INTO `labsem3` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem4`
--

CREATE TABLE IF NOT EXISTS `labsem4` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem4`
--

INSERT INTO `labsem4` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem5`
--

CREATE TABLE IF NOT EXISTS `labsem5` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem5`
--

INSERT INTO `labsem5` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem6`
--

CREATE TABLE IF NOT EXISTS `labsem6` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem6`
--

INSERT INTO `labsem6` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem7`
--

CREATE TABLE IF NOT EXISTS `labsem7` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem7`
--

INSERT INTO `labsem7` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem8`
--

CREATE TABLE IF NOT EXISTS `labsem8` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem8`
--

INSERT INTO `labsem8` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem9`
--

CREATE TABLE IF NOT EXISTS `labsem9` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem9`
--

INSERT INTO `labsem9` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem10`
--

CREATE TABLE IF NOT EXISTS `labsem10` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem10`
--

INSERT INTO `labsem10` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem11`
--

CREATE TABLE IF NOT EXISTS `labsem11` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem11`
--

INSERT INTO `labsem11` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem12`
--

CREATE TABLE IF NOT EXISTS `labsem12` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem12`
--

INSERT INTO `labsem12` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem13`
--

CREATE TABLE IF NOT EXISTS `labsem13` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem13`
--

INSERT INTO `labsem13` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem14`
--

CREATE TABLE IF NOT EXISTS `labsem14` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem14`
--

INSERT INTO `labsem14` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem15`
--

CREATE TABLE IF NOT EXISTS `labsem15` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem15`
--

INSERT INTO `labsem15` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem16`
--

CREATE TABLE IF NOT EXISTS `labsem16` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem16`
--

INSERT INTO `labsem16` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem17`
--

CREATE TABLE IF NOT EXISTS `labsem17` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `ano` int(4) NOT NULL,
  `carrera` varchar(11) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `L5` int(11) NOT NULL,
  `L6` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `M4` int(11) NOT NULL,
  `M5` int(11) NOT NULL,
  `M6` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `MI4` int(11) NOT NULL,
  `MI5` int(11) NOT NULL,
  `MI6` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `J4` int(11) NOT NULL,
  `J5` int(11) NOT NULL,
  `J6` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  `V4` int(11) NOT NULL,
  `V5` int(11) NOT NULL,
  `V6` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`,`ano`,`carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `labsem17`
--

INSERT INTO `labsem17` (`nombreAsignatura`, `ano`, `carrera`, `L1`, `L2`, `L3`, `L4`, `L5`, `L6`, `M1`, `M2`, `M3`, `M4`, `M5`, `M6`, `MI1`, `MI2`, `MI3`, `MI4`, `MI5`, `MI6`, `J1`, `J2`, `J3`, `J4`, `J5`, `J6`, `V1`, `V2`, `V3`, `V4`, `V5`, `V6`) VALUES
('Algebra_I', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Analisis_Matematico', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Arquitectura_de_Computadoras', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Base de Datos II', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Compiladores', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Complementos_de_Compilacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Defensa Nacional', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Economia Politica', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Estructuras_de_Datos_y_Algoritmos_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Filosofia', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Geometria', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingenieria de Sofware', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Ingles', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Logica', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica Numerica', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Matematica_Discreta_I', 2, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Modelo_de_Optimizacion', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Probabilidades', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion', 1, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion C/C++', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Declarativa', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Programacion_Web', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Redes_de_Computadoras', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Sistemas Operativos', 3, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
('Teoria_Sociopolitica', 4, 'CC', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE IF NOT EXISTS `profesor` (
  `Nombre` varchar(20) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Asignatura` varchar(50) NOT NULL,
  `carrera` varchar(4) NOT NULL,
  `ano` int(1) NOT NULL,
  `imparteC` varchar(4) NOT NULL,
  `imparteCp` varchar(4) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  PRIMARY KEY (`Nombre`,`Apellidos`,`Asignatura`,`carrera`,`ano`),
  KEY `Asignatura` (`Asignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`Nombre`, `Apellidos`, `Asignatura`, `carrera`, `ano`, `imparteC`, `imparteCp`, `Correo`) VALUES
('Adis', 'Perla', 'Matematica_Discreta_I', 'CC', 2, 'off', 'on', 'adisp@uclv.edu.cu'),
('Ana Julia', 'Pino', 'Economia Politica', 'CC', 2, 'on', 'on', 'ajpino@uclv.edu.cu'),
('Andres', 'Telleria', 'Programacion_Web', 'CC', 4, 'on', 'on', 'atelleria@uclv.edu.cu'),
('Beatriz', 'Betancourt', 'Ingles', 'CC', 1, 'on', 'on', 'bbetancourt@uclv.edu.cu'),
('Beatriz', 'Lopez Porrero', 'Base de Datos II', 'CC', 3, 'on', 'on', 'blporrero@uclv.edu.cu'),
('Beatriz Maria', 'Mendez', 'Modelo_de_Optimizacion', 'CC', 4, 'off', 'on', 'bmendez@uclv.edu.cu'),
('Carmen LuisA', 'Gonzalez', 'Ingles', 'CC', 2, 'on', 'on', 'clconzalez@uclv.edu.cu'),
('Daniel', 'Galvez', 'Compiladores', 'CC', 3, 'on', 'on', 'dgalvez@uclv.edu.cu'),
('David', 'Hernandez', 'Defensa Nacional', 'CC', 3, 'on', 'on', 'davidh@uclv.edu.cu'),
('Ernesto M.', 'Rodriguez', 'Ingenieria de Sofware', 'CC', 3, 'off', 'on', 'ernestomr@uclv.edu.cu'),
('Gonzalo', 'Napoles', 'Matematica Numerica', 'CC', 3, 'off', 'on', 'gnapoles@uclv.edu.cu'),
('Guillermo', 'Sosa', 'Analisis_Matematico', 'CC', 2, 'on', 'on', 'gsosa@uclv.edu.cu'),
('Isel', 'Moreno Montes de Oca', 'Logica', 'CC', 1, 'on', 'on', 'ismoreno@uclv.edu.cu'),
('Jorge', 'Polo', 'Complementos_de_Compilacion', 'CC', 4, 'on', 'on', 'jpolo@uclv.cu'),
('Juan Carlos', 'Ortega', 'Arquitectura_de_Computadoras', 'CC', 2, 'on', 'on', 'jcortega@uclv.edu.cu'),
('Juan Carlos', 'Ortega', 'Redes_de_Computadoras', 'CC', 3, 'on', 'on', 'jcortega@uclv.edu.cu'),
('Juan Manuel', 'Navarro', 'Probabilidades', 'CC', 4, 'on', 'on', 'jmnavarro@uclv.edu.cu'),
('Leidys', 'Cabrera', 'Estructuras_de_Datos_y_Algoritmos_I', 'CC', 2, 'on', 'on', 'lcabrera@uclv.edu.cu'),
('Leticia', 'Arco', 'Matematica_Discreta_I', 'CC', 2, 'on', 'on', 'larco@uclv.edu.cu'),
('Lizet', 'Denova', 'Compiladores', 'CC', 3, 'off', 'on', 'ldenova@uclv.edu.cu'),
('Marilyn', 'Bello', 'Algebra_I', 'CC', 1, 'on', 'on', 'mbello@uclv.edu.cu'),
('Mateo', 'Lezcano', 'Sistemas Operativos', 'CC', 3, 'on', 'on', 'mlezcano@uclv.edu.cu'),
('Rafael', 'Chaviano', 'Matematica Numerica', 'CC', 3, 'on', 'on', 'rchaviano@uclv.edu.cu'),
('Ramiro', 'Perez Vazquez', 'Programacion', 'CC', 1, 'on', 'on', 'rperez@uclv.edu.cu'),
('Ramon', 'Ortega', 'Geometria', 'CC', 1, 'on', 'on', 'rortega@uclv.edu.cu'),
('Reinier', 'Oves', 'Programacion C/C++', 'CC', 3, 'on', 'on', 'roves@uclv.edu.cu'),
('Rosendo', 'Moreno', 'Ingenieria de Sofware', 'CC', 3, 'on', 'on', 'rmrodriguez'),
('Yailen', 'Martinez', 'Modelo_de_Optimizacion', 'CC', 4, 'on', 'off', 'ymartinez@uclv.du.cu'),
('Yanet', 'Monteagudo', 'Filosofia', 'CC', 1, 'on', 'on', 'ymonteagudo@uclv.edu.cu'),
('Yisliany', 'Placencia', 'Teoria_Sociopolitica', 'CC', 4, 'on', 'on', 'yislianyp@uclv.edu.cu'),
('Zoila Zenaida', 'Garcia', 'Programacion_Declarativa', 'CC', 4, 'on', 'on', 'zzgarcia@uclv.edu.cu');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `user` varchar(20) NOT NULL,
  `password` varchar(20) CHARACTER SET ascii NOT NULL,
  `type` binary(1) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`user`, `password`, `type`) VALUES
('lmcastillo', 'ok', '0'),
('nparada', 'yo', '0');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
