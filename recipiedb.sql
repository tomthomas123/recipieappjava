-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2022 at 12:21 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `recipiedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `reciepie`
--

CREATE TABLE `reciepie` (
  `id` int(11) NOT NULL,
  `reciepie_name` varchar(20) NOT NULL,
  `reciepie_description` varchar(50) NOT NULL,
  `reciepie_incredient` varchar(50) NOT NULL,
  `recipie_author` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reciepie`
--

INSERT INTO `reciepie` (`id`, `reciepie_name`, `reciepie_description`, `reciepie_incredient`, `recipie_author`) VALUES
(1, 'biriyani', 'chiken biriyani', 'chiken ,rice,ghee,ch', 'leo'),
(2, 'egg puffs', 'puffs', 'egg masala', 'jhony'),
(4, 'ullivada', 'delicious', 'savala,oil', 'sabu'),
(5, 'parippvada', 'sweet spicy', 'paripp,oil,chilly', 'joby'),
(6, 'boli', 'made up of banana', 'banana oil salt powder', 'simon'),
(7, 'porotta', 'delicious soft ', 'maida oil', 'sabu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reciepie`
--
ALTER TABLE `reciepie`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reciepie`
--
ALTER TABLE `reciepie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
