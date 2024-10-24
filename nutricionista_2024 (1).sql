-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-10-2024 a las 01:43:06
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionista_2024`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `codComida` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `tipoComida` varchar(50) NOT NULL,
  `caloriasPor100g` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `baja` tinyint(1) NOT NULL,
  `aptoVegetariano` tinyint(1) NOT NULL,
  `libredeTACC` tinyint(1) NOT NULL,
  `lacteo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alimento`
--

INSERT INTO `alimento` (`codComida`, `nombre`, `tipoComida`, `caloriasPor100g`, `detalle`, `baja`, `aptoVegetariano`, `libredeTACC`, `lacteo`) VALUES
(1, 'Arroz a la marinera', 'almuerzo', 130, 'arroz, pescado, caldo, cebolla, ajo.', 0, 0, 1, 0),
(2, 'jugo de manzana', 'desayuno', 50, 'manzanas exprimidas, agua, azucar', 0, 1, 1, 0),
(3, 'snack de manzana', 'merienda', 80, 'rodajas de manzanas, azucar', 0, 1, 1, 0),
(4, 'Pollo a la plancha', 'almuerzo', 165, 'pollo, sal, aceite de oliva', 0, 0, 1, 0),
(5, 'ensalada de frutas', 'cena', 100, 'frutas mixtas, miel', 0, 1, 1, 0),
(6, 'sopa de verduras', 'almuerzo', 40, 'Zanahorias, calabaza, papa y sal', 0, 1, 1, 0),
(7, 'tarta de espinacas ', 'almuerzo', 180, 'Espinacas, harina, queso, huevo', 0, 1, 0, 0),
(8, 'bife de carne', 'cena', 250, 'Carne vacuna, sal, aceite', 0, 0, 1, 0),
(9, 'Cereal con leche', 'desayuno', 150, 'Cereal de maíz, leche', 0, 1, 0, 0),
(10, 'Torta de zanahoria', 'merienda', 300, 'Harina, zanahoria, azúcar, huevo', 0, 1, 0, 0),
(11, 'Pan integral', 'desayuno', 250, 'Harina integral, agua, levadura, sal', 0, 1, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `codDieta` int(11) NOT NULL,
  `nombreD` varchar(100) NOT NULL,
  `fechaIni` date NOT NULL,
  `fechaFin` date NOT NULL,
  `pesoIni` float NOT NULL,
  `pesoFinal` float NOT NULL,
  `estado` int(11) NOT NULL,
  `totalCalorias` float NOT NULL,
  `nroPaciente` int(11) NOT NULL,
  `tipoDieta` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`codDieta`, `nombreD`, `fechaIni`, `fechaFin`, `pesoIni`, `pesoFinal`, `estado`, `totalCalorias`, `nroPaciente`, `tipoDieta`) VALUES
(1, 'Dieta mediterránea', '2024-12-02', '2024-12-08', 85, 80, 1, 8600, 1, ''),
(2, 'Dieta Saludable', '2024-05-02', '2024-05-07', 68, 55, 1, 9000, 4, ''),
(3, 'Dieta Equilibrada', '2024-10-03', '2024-12-09', 70, 62, 1, 9200, 2, ''),
(4, 'Dieta Detox', '2024-02-02', '2024-02-08', 74, 65, 1, 8200, 5, ''),
(5, 'Dieta Sin Gluten', '2024-09-03', '2024-12-08', 97, 85, 1, 9500, 3, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menudiario`
--

CREATE TABLE `menudiario` (
  `codMenu` int(11) NOT NULL,
  `dia` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `caloriasDelMenu` int(1) NOT NULL,
  `codDieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `menudiario`
--

INSERT INTO `menudiario` (`codMenu`, `dia`, `estado`, `caloriasDelMenu`, `codDieta`) VALUES
(1, 1, 1, 2000, 1),
(2, 2, 1, 2200, 2),
(3, 3, 1, 1800, 3),
(4, 1, 1, 1850, 4),
(5, 2, 1, 1900, 5),
(6, 3, 1, 2000, 6),
(7, 1, 1, 1500, 7),
(8, 2, 1, 1700, 8),
(9, 1, 1, 1800, 9),
(10, 2, 1, 1500, 10),
(11, 1, 1, 2000, 11),
(12, 2, 1, 1400, 12),
(13, 3, 1, 1600, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `nroPaciente` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `genero` varchar(20) NOT NULL,
  `altura` float NOT NULL,
  `pesoActual` float NOT NULL,
  `pesoBuscado` float NOT NULL,
  `condicionEspecial` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`nroPaciente`, `nombre`, `edad`, `genero`, `altura`, `pesoActual`, `pesoBuscado`, `condicionEspecial`) VALUES
(1, 'Maria Perez', 30, '', 1.75, 85, 80, ''),
(2, 'Juan Lopez', 23, '', 1.7, 70, 62, ''),
(3, 'Luis Garcia', 42, '', 1.78, 97, 85, ''),
(4, 'Sofia Torres', 28, '', 1.65, 68, 55, ''),
(5, 'Brisa Méndez', 24, '', 1.6, 75, 65, ''),
(6, 'Martin Paez', 34, '', 1.79, 88, 80, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `renglondemenu`
--

CREATE TABLE `renglondemenu` (
  `nroRenglon` int(11) NOT NULL,
  `cantidadGrs` double NOT NULL,
  `subtotalCalorias` int(11) NOT NULL,
  `codMenu` int(11) NOT NULL,
  `codComida` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `renglondemenu`
--

INSERT INTO `renglondemenu` (`nroRenglon`, `cantidadGrs`, `subtotalCalorias`, `codMenu`, `codComida`) VALUES
(1, 200, 260, 1, NULL),
(2, 250, 125, 2, NULL),
(3, 150, 120, 3, NULL),
(4, 180, 300, 4, NULL),
(5, 300, 300, 5, NULL),
(6, 250, 200, 6, NULL),
(7, 220, 250, 7, NULL),
(8, 150, 100, 8, NULL),
(9, 200, 150, 9, NULL),
(10, 180, 300, 10, NULL),
(11, 150, 80, 11, NULL),
(12, 200, 260, 12, NULL),
(13, 250, 125, 13, NULL),
(14, 150, 120, 14, NULL),
(15, 180, 297, 15, NULL),
(16, 300, 300, 16, NULL),
(17, 250, 200, 17, NULL),
(18, 220, 250, 18, NULL),
(19, 150, 100, 19, NULL),
(20, 200, 150, 20, NULL),
(21, 180, 300, 21, NULL),
(22, 150, 80, 22, NULL),
(23, 200, 260, 23, NULL),
(24, 250, 125, 24, NULL),
(25, 150, 120, 25, NULL),
(26, 180, 290, 26, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`codComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`codDieta`),
  ADD UNIQUE KEY `nroPaciente` (`nroPaciente`);

--
-- Indices de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD PRIMARY KEY (`codMenu`),
  ADD UNIQUE KEY `codDieta` (`codDieta`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`nroPaciente`);

--
-- Indices de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD PRIMARY KEY (`nroRenglon`),
  ADD UNIQUE KEY `codMenu` (`codMenu`),
  ADD UNIQUE KEY `codComida` (`codComida`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimento`
--
ALTER TABLE `alimento`
  MODIFY `codComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `codDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `menudiario`
--
ALTER TABLE `menudiario`
  MODIFY `codMenu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `nroPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  MODIFY `nroRenglon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`nroPaciente`) REFERENCES `paciente` (`nroPaciente`),
  ADD CONSTRAINT `dieta_ibfk_2` FOREIGN KEY (`codDieta`) REFERENCES `menudiario` (`codDieta`);

--
-- Filtros para la tabla `menudiario`
--
ALTER TABLE `menudiario`
  ADD CONSTRAINT `menudiario_ibfk_1` FOREIGN KEY (`codMenu`) REFERENCES `renglondemenu` (`codMenu`);

--
-- Filtros para la tabla `renglondemenu`
--
ALTER TABLE `renglondemenu`
  ADD CONSTRAINT `renglondemenu_ibfk_1` FOREIGN KEY (`codComida`) REFERENCES `alimento` (`codComida`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
