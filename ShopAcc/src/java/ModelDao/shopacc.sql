-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2020 at 03:54 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
-- Table structure for table `acccount`
--

CREATE TABLE `acccount` (
  `acId` int(11) NOT NULL,
  `ifId` int(11) DEFAULT NULL,
  `ifAccName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cgName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `acPrice` double DEFAULT NULL,
  `acAmount` int(11) DEFAULT NULL,
  `acDescription` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tpId` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `acNote` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `igId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `aId` int(11) NOT NULL,
  `rId` int(11) DEFAULT NULL,
  `aFullname` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `aUserName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `aPass` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `aPhone` int(12) DEFAULT NULL,
  `aAddress` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `aEmail` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `aAge` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `acid` int(11) NOT NULL,
  `sbid` int(11) NOT NULL,
  `bdate` date NOT NULL,
  `totalPrice` int(11) NOT NULL,
  `mgfullname` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `uPhone` int(12) NOT NULL,
  `bNote` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `buy`
--

CREATE TABLE `buy` (
  `buyid` int(11) NOT NULL,
  `buyusername` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `buyPass` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `buyPass2` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cgName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cgDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cgNameProducer` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `cmtid` int(11) NOT NULL,
  `userName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `comment` text COLLATE utf8_unicode_ci NOT NULL,
  `cmtDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `image`
--

CREATE TABLE `image` (
  `igid` int(11) NOT NULL,
  `acid` int(11) NOT NULL,
  `iglink` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `infioac`
--

CREATE TABLE `infioac` (
  `ifId` int(11) NOT NULL,
  `ifAccName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ifRank` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ifLevel` int(11) NOT NULL,
  `comment` text COLLATE utf8_unicode_ci NOT NULL,
  `cgName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `igLink` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `manage`
--

CREATE TABLE `manage` (
  `mgid` int(11) NOT NULL,
  `aid` int(11) NOT NULL,
  `mgName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `rid` int(11) NOT NULL,
  `rName` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `pid` int(11) NOT NULL,
  `pName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `pdate` date NOT NULL,
  `buyid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `rid` int(11) NOT NULL,
  `rName` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `statusbill`
--

CREATE TABLE `statusbill` (
  `sbid` int(11) NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `pid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `tpid` int(11) NOT NULL,
  `tpName` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` int(11) NOT NULL,
  `ufull_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uPass` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uAge` int(11) DEFAULT NULL,
  `uPhone` int(11) DEFAULT NULL,
  `uEmail` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uAdrress` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uBirthday` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acccount`
--
ALTER TABLE `acccount`
  ADD PRIMARY KEY (`acId`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aId`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `buy`
--
ALTER TABLE `buy`
  ADD PRIMARY KEY (`buyid`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`cmtid`);

--
-- Indexes for table `image`
--
ALTER TABLE `image`
  ADD PRIMARY KEY (`igid`);

--
-- Indexes for table `infioac`
--
ALTER TABLE `infioac`
  ADD PRIMARY KEY (`ifId`);

--
-- Indexes for table `manage`
--
ALTER TABLE `manage`
  ADD PRIMARY KEY (`mgid`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`rid`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`tpid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acccount`
--
ALTER TABLE `acccount`
  MODIFY `acId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `aId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
  MODIFY `bid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `buy`
--
ALTER TABLE `buy`
  MODIFY `buyid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
  MODIFY `cmtid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `image`
--
ALTER TABLE `image`
  MODIFY `igid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `infioac`
--
ALTER TABLE `infioac`
  MODIFY `ifId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `manage`
--
ALTER TABLE `manage`
  MODIFY `mgid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `rid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `type`
--
ALTER TABLE `type`
  MODIFY `tpid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
