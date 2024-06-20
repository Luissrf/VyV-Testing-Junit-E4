USE galyscake;
-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2023 a las 01:17:22
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `galyscake`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre_cliente` varchar(50) NOT NULL,
  `fecha_entrega` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `descripcion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre_cliente`, `fecha_entrega`, `direccion`, `descripcion`) VALUES
(21, 'Luis Gerardo Rosales Flores', '12 de Marzo del 2023', 'Calle 20 de febrero', 'Oblea de Spiderman arriba'),
(22, 'Javier', '1 Julio del 2023', 'Jalpa de Mendez, villa Jalupa', 'Oblea de IronMan'),
(23, 'Angel Javier', '1 de Julio 2023', 'Jalpa de mendez en el centro', 'Tematica Spiderman');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `id_inventario` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`id_inventario`, `cantidad`) VALUES
(8, 2),
(9, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pastel`
--

CREATE TABLE `pastel` (
  `id_pastel` int(11) NOT NULL,
  `nombre_pastel` varchar(45) NOT NULL,
  `peso` varchar(20) NOT NULL,
  `relleno` varchar(45) NOT NULL,
  `sabor` varchar(45) NOT NULL,
  `precio_venta` float NOT NULL,
  `id_inventario` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pastel`
--

INSERT INTO `pastel` (`id_pastel`, `nombre_pastel`, `peso`, `relleno`, `sabor`, `precio_venta`, `id_inventario`, `id_cliente`) VALUES
(16, 'IronMan Javi', '1 Kg', 'Chocolate', 'Vainilla', 3000, 8, 22),
(17, 'Spiderman', '1 Kg', 'Chocolate', 'Fresa', 3000, 9, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre_usuario`, `contraseña`) VALUES
(1, 'Luis', '12345'),
(2, 'Javi', '2105');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_hijo`
--

CREATE TABLE `venta_hijo` (
  `id_venta_hijo` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `id_pastel` int(11) NOT NULL,
  `id_venta_padre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta_hijo`
--

INSERT INTO `venta_hijo` (`id_venta_hijo`, `cantidad`, `id_pastel`, `id_venta_padre`) VALUES
(11, 2, 16, 11),
(12, 2, 17, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_padre`
--

CREATE TABLE `venta_padre` (
  `id_venta_padre` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta_padre`
--

INSERT INTO `venta_padre` (`id_venta_padre`, `fecha`, `total`) VALUES
(11, '2023-05-25 14:58:53', 3000),
(12, '2023-05-26 17:47:17', 3000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`id_inventario`);

--
-- Indices de la tabla `pastel`
--
ALTER TABLE `pastel`
  ADD PRIMARY KEY (`id_pastel`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_inventario` (`id_inventario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `venta_hijo`
--
ALTER TABLE `venta_hijo`
  ADD PRIMARY KEY (`id_venta_hijo`),
  ADD KEY `id_pastel` (`id_pastel`),
  ADD KEY `id_venta_padre` (`id_venta_padre`);

--
-- Indices de la tabla `venta_padre`
--
ALTER TABLE `venta_padre`
  ADD PRIMARY KEY (`id_venta_padre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `id_inventario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `pastel`
--
ALTER TABLE `pastel`
  MODIFY `id_pastel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `venta_hijo`
--
ALTER TABLE `venta_hijo`
  MODIFY `id_venta_hijo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `venta_padre`
--
ALTER TABLE `venta_padre`
  MODIFY `id_venta_padre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pastel`
--
ALTER TABLE `pastel`
  ADD CONSTRAINT `pastel_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `pastel_ibfk_2` FOREIGN KEY (`id_inventario`) REFERENCES `inventario` (`id_inventario`);

--
-- Filtros para la tabla `venta_hijo`
--
ALTER TABLE `venta_hijo`
  ADD CONSTRAINT `venta_hijo_ibfk_1` FOREIGN KEY (`id_pastel`) REFERENCES `pastel` (`id_pastel`),
  ADD CONSTRAINT `venta_hijo_ibfk_2` FOREIGN KEY (`id_venta_padre`) REFERENCES `venta_padre` (`id_venta_padre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
