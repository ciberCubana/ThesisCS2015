-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 14-12-2014 a las 18:44:44
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem2`
--

CREATE TABLE IF NOT EXISTS `afectsem2` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem3`
--

CREATE TABLE IF NOT EXISTS `afectsem3` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem4`
--

CREATE TABLE IF NOT EXISTS `afectsem4` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem5`
--

CREATE TABLE IF NOT EXISTS `afectsem5` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem6`
--

CREATE TABLE IF NOT EXISTS `afectsem6` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem7`
--

CREATE TABLE IF NOT EXISTS `afectsem7` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem8`
--

CREATE TABLE IF NOT EXISTS `afectsem8` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem9`
--

CREATE TABLE IF NOT EXISTS `afectsem9` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem10`
--

CREATE TABLE IF NOT EXISTS `afectsem10` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem11`
--

CREATE TABLE IF NOT EXISTS `afectsem11` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem12`
--

CREATE TABLE IF NOT EXISTS `afectsem12` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem13`
--

CREATE TABLE IF NOT EXISTS `afectsem13` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem14`
--

CREATE TABLE IF NOT EXISTS `afectsem14` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem15`
--

CREATE TABLE IF NOT EXISTS `afectsem15` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem16`
--

CREATE TABLE IF NOT EXISTS `afectsem16` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afectsem17`
--

CREATE TABLE IF NOT EXISTS `afectsem17` (
  `nombreProf` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreProf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE IF NOT EXISTS `asignatura` (
  `nombre` varchar(20) NOT NULL,
  `carrera` varchar(20) NOT NULL,
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem1`
--

CREATE TABLE IF NOT EXISTS `labsem1` (
  `nombreAsignatura` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem2`
--

CREATE TABLE IF NOT EXISTS `labsem2` (
  `nombreAsignatura` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem3`
--

CREATE TABLE IF NOT EXISTS `labsem3` (
  `nombreAsignatura` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem4`
--

CREATE TABLE IF NOT EXISTS `labsem4` (
  `nombreAsignatura` varchar(50) NOT NULL,
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
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem5`
--

CREATE TABLE IF NOT EXISTS `labsem5` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem6`
--

CREATE TABLE IF NOT EXISTS `labsem6` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem7`
--

CREATE TABLE IF NOT EXISTS `labsem7` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem8`
--

CREATE TABLE IF NOT EXISTS `labsem8` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem9`
--

CREATE TABLE IF NOT EXISTS `labsem9` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem10`
--

CREATE TABLE IF NOT EXISTS `labsem10` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem11`
--

CREATE TABLE IF NOT EXISTS `labsem11` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem12`
--

CREATE TABLE IF NOT EXISTS `labsem12` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem13`
--

CREATE TABLE IF NOT EXISTS `labsem13` (
  `nombreAsignatura` int(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L4` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem14`
--

CREATE TABLE IF NOT EXISTS `labsem14` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem15`
--

CREATE TABLE IF NOT EXISTS `labsem15` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem16`
--

CREATE TABLE IF NOT EXISTS `labsem16` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `labsem17`
--

CREATE TABLE IF NOT EXISTS `labsem17` (
  `nombreAsignatura` varchar(50) NOT NULL,
  `L1` int(11) NOT NULL,
  `L2` int(11) NOT NULL,
  `L3` int(11) NOT NULL,
  `M1` int(11) NOT NULL,
  `M2` int(11) NOT NULL,
  `M3` int(11) NOT NULL,
  `MI1` int(11) NOT NULL,
  `MI2` int(11) NOT NULL,
  `MI3` int(11) NOT NULL,
  `J1` int(11) NOT NULL,
  `J2` int(11) NOT NULL,
  `J3` int(11) NOT NULL,
  `V1` int(11) NOT NULL,
  `V2` int(11) NOT NULL,
  `V3` int(11) NOT NULL,
  PRIMARY KEY (`nombreAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE IF NOT EXISTS `profesor` (
  `Nombre` varchar(20) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Asignatura` varchar(20) NOT NULL,
  `imparteC` varchar(4) NOT NULL,
  `imparteCp` varchar(4) NOT NULL,
  `CatDocente` varchar(20) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Telefono` int(14) DEFAULT NULL,
  `Departamento` varchar(20) NOT NULL,
  PRIMARY KEY (`Nombre`,`Apellidos`,`Asignatura`),
  KEY `Asignatura` (`Asignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
