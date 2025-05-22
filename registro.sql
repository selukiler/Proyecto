-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-05-2025 a las 14:29:28
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
-- Base de datos: `registro`
--

DELIMITER $$
--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `total_gastado` (`id_cliente` INT) RETURNS FLOAT DETERMINISTIC BEGIN
    DECLARE total FLOAT;

    SELECT SUM(precio) INTO total
    FROM seleccion_producto
    WHERE Identificador = id_cliente;

    RETURN IFNULL(total, 0);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auditoria_productos`
--

CREATE TABLE `auditoria_productos` (
  `id` int(11) NOT NULL,
  `producto` varchar(30) NOT NULL,
  `accion` varchar(10) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `auditoria_productos`
--

INSERT INTO `auditoria_productos` (`id`, `producto`, `accion`, `fecha`) VALUES
(1, 'huevos', 'INSERT', '2025-05-22 10:41:26'),
(2, 'coca cola', 'INSERT', '2025-05-22 10:43:03'),
(3, 'fanta', 'INSERT', '2025-05-22 10:48:15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carta`
--

CREATE TABLE `carta` (
  `producto` varchar(30) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `carta`
--

INSERT INTO `carta` (`producto`, `precio`, `descripcion`) VALUES
('alioli con chicharrone', 1000, 'sadasd'),
('coca cola', 2, 'ghfhjf'),
('curry', 25, 'as'),
('fanta', 3, 'fasnta'),
('huevos', 8, 'adw'),
('pescao', 1, 'swda'),
('zalza', 2, 'asdads');

--
-- Disparadores `carta`
--
DELIMITER $$
CREATE TRIGGER `after_insert_carta` AFTER INSERT ON `carta` FOR EACH ROW BEGIN
    INSERT INTO auditoria_productos(producto, accion)
    VALUES (NEW.producto, 'INSERT');
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seleccion_producto`
--

CREATE TABLE `seleccion_producto` (
  `Identificador` int(11) NOT NULL,
  `Producto` varchar(30) NOT NULL,
  `Precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seleccion_producto`
--

INSERT INTO `seleccion_producto` (`Identificador`, `Producto`, `Precio`) VALUES
(1, 'alioli con chicharrone', 1000),
(2, 'alioli con chicharrone', 1000),
(5, 'pescao', 1),
(2, 'pescao', 1),
(3, 'huevos', 8),
(11, 'zalza', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `Usuario` varchar(15) NOT NULL,
  `Contraseña` varchar(15) NOT NULL,
  `ID_Usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`Usuario`, `Contraseña`, `ID_Usuario`) VALUES
('alexi', '1234', NULL),
('joseluis', '1234', NULL),
('lolo', '1234', NULL),
('manolito', '1234', NULL),
('manolo', '1234', NULL),
('pep123', '123', NULL),
('swfhrdzasdahfb', '54654564312354', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auditoria_productos`
--
ALTER TABLE `auditoria_productos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `producto` (`producto`);

--
-- Indices de la tabla `carta`
--
ALTER TABLE `carta`
  ADD PRIMARY KEY (`producto`);

--
-- Indices de la tabla `seleccion_producto`
--
ALTER TABLE `seleccion_producto`
  ADD KEY `Identificador` (`Identificador`) USING BTREE,
  ADD KEY `fk_producto_carta` (`Producto`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `auditoria_productos`
--
ALTER TABLE `auditoria_productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `auditoria_productos`
--
ALTER TABLE `auditoria_productos`
  ADD CONSTRAINT `auditoria_productos_ibfk_1` FOREIGN KEY (`producto`) REFERENCES `carta` (`producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `seleccion_producto`
--
ALTER TABLE `seleccion_producto`
  ADD CONSTRAINT `fk_producto_carta` FOREIGN KEY (`Producto`) REFERENCES `carta` (`producto`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
