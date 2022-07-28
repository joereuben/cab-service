-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 16, 2021 at 02:19 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `greenwichcabs`
--

-- --------------------------------------------------------

--
-- Table structure for table `dispatcher`
--

DROP TABLE IF EXISTS `dispatcher`;
CREATE TABLE IF NOT EXISTS `dispatcher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(250) NOT NULL,
  `name` varchar(50) NOT NULL,
  `creator` varchar(50) NOT NULL COMMENT 'dispatcher who created this dispatcher',
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQUE` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `dispatcher`
--

INSERT INTO `dispatcher` (`id`, `username`, `password`, `name`, `creator`, `date`) VALUES
(1, 'jojo', '7510d498f23f5815d3376ea7bad64e29', 'Kojo Mbeah Mensah', '', '2021-12-15 15:17:33'),
(2, 'Michnuel', 'd8578edf8458ce06fbc5bb76a58c5ca4', 'Michael Manuel', 'jojo', '2021-12-15 19:59:48'),
(3, 'dapaah', '44940fbe7a886b50a1d84ba446a3cd6e', 'Emmanuel Dapaah', 'jojo', '2021-12-15 20:02:33');

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
CREATE TABLE IF NOT EXISTS `driver` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `dispatchid` varchar(50) NOT NULL COMMENT 'dispatch (username) who created this driver',
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`id`, `name`, `dispatchid`, `date`) VALUES
(1, 'Samuel Oduro', 'jojo', '2021-12-15 19:28:28'),
(2, 'Isaac Donkor', 'jojo', '2021-12-16 09:57:20'),
(3, 'Daniel Apoh', 'jojo', '2021-12-16 09:57:29');

-- --------------------------------------------------------

--
-- Table structure for table `journey`
--

DROP TABLE IF EXISTS `journey`;
CREATE TABLE IF NOT EXISTS `journey` (
  `id` int NOT NULL AUTO_INCREMENT,
  `starttime` varchar(5) NOT NULL,
  `pickuppoint` varchar(50) NOT NULL,
  `destination` varchar(50) NOT NULL,
  `driverid` int NOT NULL,
  `passengername` varchar(50) NOT NULL,
  `accountname` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `fare` decimal(10,2) NOT NULL,
  `tip` decimal(10,2) NOT NULL,
  `dispatchid` varchar(50) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `journey`
--

INSERT INTO `journey` (`id`, `starttime`, `pickuppoint`, `destination`, `driverid`, `passengername`, `accountname`, `phone`, `fare`, `tip`, `dispatchid`, `date`) VALUES
(2, '4:31', 'accra', 'kumasi', 3, '', '', '', '14.00', '0.00', 'jojo', '2021-12-15 14:24:02'),
(3, '5:32', 'taifa', 'labone', 1, '', '', '', '5.00', '0.00', 'jojo', '2021-12-15 14:26:44'),
(4, '2:44', 'teshie', 'kasoa', 2, '', '', '', '12.00', '0.00', 'jojo', '2021-12-15 14:30:17'),
(5, '3:45', 'Tamale', 'Tema', 3, '', '', '', '9.40', '0.00', 'jojo', '2021-12-16 09:58:47'),
(6, '4:32', 'Takwa', 'kpong', 2, '', '', '', '6.20', '0.00', 'jojo', '2021-12-16 10:03:16'),
(7, '4:32', 'HO', 'KA', 2, '', 'ProperName', '', '20.30', '0.00', 'jojo', '2021-12-16 10:05:39');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
