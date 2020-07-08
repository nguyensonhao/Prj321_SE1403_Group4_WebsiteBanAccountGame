-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2020 at 03:58 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopacc`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `aId` int(20) NOT NULL COMMENT 'id admin',
  `aFullName` varchar(50) NOT NULL COMMENT 'name of admin',
  `aUserName` varchar(50) NOT NULL COMMENT 'user name admin',
  `aPassWord` varchar(50) NOT NULL COMMENT 'password admin',
  `uEmail` varchar(50) NOT NULL COMMENT 'Email admin',
  `rId` int(20) NOT NULL COMMENT 'id role admin'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table admin';

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bId` int(20) NOT NULL COMMENT 'id bill',
  `uFullName` varchar(20) NOT NULL COMMENT 'full name user buy ',
  `pId` int(20) NOT NULL COMMENT 'id of product',
  `pPrice` int(50) NOT NULL COMMENT 'price of product',
  `bTotalPrice` int(50) NOT NULL COMMENT 'total price of bill',
  `bDateBuy` date NOT NULL COMMENT 'date buy product',
  `uEmail` varchar(50) NOT NULL COMMENT 'email of user',
  `bNote` varchar(100) NOT NULL COMMENT 'note of bill'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table bill';

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pId` int(20) NOT NULL COMMENT 'id product',
  `pName` varchar(50) NOT NULL COMMENT 'name product',
  `pPrice` int(11) NOT NULL COMMENT 'price product',
  `pType` varchar(50) NOT NULL COMMENT 'type product',
  `pDescription` varchar(100) NOT NULL COMMENT 'description product',
  `codeProduce` varchar(100) NOT NULL COMMENT 'username password of account buy',
  `pImage` varchar(150) NOT NULL COMMENT 'image of produce',
  `PpriceSale` int(50) NOT NULL COMMENT 'price after sale'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table product';

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uId` int(10) NOT NULL COMMENT 'id user',
  `uFullName` varchar(50) NOT NULL COMMENT 'full name user',
  `userName` varchar(50) NOT NULL COMMENT 'username user',
  `uPassWord` varchar(50) NOT NULL COMMENT 'password user',
  `uAge` int(10) NOT NULL COMMENT 'age user',
  `uPhone` varchar(20) NOT NULL COMMENT 'phone user',
  `uEmail` varchar(50) NOT NULL COMMENT 'email user',
  `uAddress` varchar(50) NOT NULL COMMENT 'address user',
  `uBirthday` date NOT NULL COMMENT 'birthday user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='thable user';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aId`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `aId` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id admin';

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
  MODIFY `bId` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id bill';

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `uId` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id user';
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
