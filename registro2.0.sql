-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2025 a las 10:22:47
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
CREATE DEFINER=`root`@`localhost` FUNCTION `obtener_total_productos` () RETURNS INT(11) DETERMINISTIC BEGIN
    DECLARE total INT DEFAULT 0;
    
    SELECT total_productos INTO total FROM contador_productos LIMIT 1;
    
    RETURN COALESCE(total, 0);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carta`
--

CREATE TABLE `carta` (
  `producto` varchar(30) NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contador_productos`
--

CREATE TABLE `contador_productos` (
  `id` int(11) NOT NULL,
  `total_productos` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contador_productos`
--

INSERT INTO `contador_productos` (`id`, `total_productos`) VALUES
(1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seleccion_producto`
--

CREATE TABLE `seleccion_producto` (
  `Identificador` int(30) NOT NULL,
  `Producto` varchar(30) NOT NULL,
  `Precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Disparadores `seleccion_producto`
--
DELIMITER $$
CREATE TRIGGER `actualizar_contador` AFTER INSERT ON `seleccion_producto` FOR EACH ROW BEGIN 
    UPDATE contador_productos 
    SET total_productos = total_productos + 1;
END
$$
DELIMITER ;

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
('manolo', '1234', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carta`
--
ALTER TABLE `carta`
  ADD PRIMARY KEY (`producto`);

--
-- Indices de la tabla `contador_productos`
--
ALTER TABLE `contador_productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `seleccion_producto`
--
ALTER TABLE `seleccion_producto`
  ADD PRIMARY KEY (`Producto`),
  ADD KEY `fk_identificador` (`Identificador`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contador_productos`
--
ALTER TABLE `contador_productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `seleccion_producto`
--
ALTER TABLE `seleccion_producto`
  ADD CONSTRAINT `fk_identificador` FOREIGN KEY (`Identificador`) REFERENCES `contador_productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `seleccion_producto_ibfk_1` FOREIGN KEY (`Producto`) REFERENCES `carta` (`producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
