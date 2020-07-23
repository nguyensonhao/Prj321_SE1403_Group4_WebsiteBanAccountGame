-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 23, 2020 at 03:20 PM
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
  `bId` int(20) NOT NULL COMMENT 'Bill id',
  `uId` int(20) NOT NULL COMMENT 'User id',
  `pName` varchar(50) NOT NULL COMMENT 'Name of product',
  `bQuantity` int(20) NOT NULL COMMENT 'Quantity of bill',
  `pImage` varchar(200) NOT NULL COMMENT 'image of acount',
  `pDescription` varchar(200) NOT NULL COMMENT 'Description ',
  `pId` int(20) NOT NULL COMMENT 'id of product',
  `pPrice` int(50) NOT NULL COMMENT 'price of product',
  `bTotalPrice` int(50) NOT NULL COMMENT 'total price of bill',
  `bDateBuy` date NOT NULL COMMENT 'date buy product',
  `uEmail` varchar(50) DEFAULT NULL COMMENT 'email of user',
  `bNote` varchar(100) DEFAULT NULL COMMENT 'note of bill'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table bill';

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bId`, `uId`, `pName`, `bQuantity`, `pImage`, `pDescription`, `pId`, `pPrice`, `bTotalPrice`, `bDateBuy`, `uEmail`, `bNote`) VALUES
(85, 0, 'Account lien minh vip', 1, 'https://hinhanhdephd.com/wp-content/uploads/2016/01/8hinh-nen-game-lien-minh-huyen-thoai-LOL-dep-2.jpg', 'Acount', 0, 100000, 0, '2020-07-23', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `billdetail`
--

CREATE TABLE `billdetail` (
  `bdId` int(20) NOT NULL COMMENT 'id of bill',
  `pId` int(20) NOT NULL COMMENT 'id of produce',
  `bdQuantity` int(20) NOT NULL COMMENT 'quantity of bill',
  `bdTotalPrice` int(50) NOT NULL COMMENT 'total price of bill'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `descriptiondetail`
--

CREATE TABLE `descriptiondetail` (
  `dId` int(11) NOT NULL,
  `dDetail` text NOT NULL,
  `dInfo` text NOT NULL,
  `dImage` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pId` int(20) NOT NULL COMMENT 'id product',
  `pName` varchar(50) NOT NULL COMMENT 'name product',
  `pPrice` int(11) NOT NULL COMMENT 'price product',
  `quantity` int(20) NOT NULL COMMENT 'Quantity of product',
  `pType` varchar(50) NOT NULL COMMENT 'type product',
  `pDescription` varchar(500) NOT NULL COMMENT 'description product',
  `codeProduce` varchar(100) NOT NULL COMMENT 'username password of account buy',
  `PpriceSale` int(50) NOT NULL COMMENT 'price after sale',
  `pImage` varchar(150) NOT NULL COMMENT 'image of produce',
  `dId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table product';

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pId`, `pName`, `pPrice`, `quantity`, `pType`, `pDescription`, `codeProduce`, `PpriceSale`, `pImage`, `dId`) VALUES
(1, 'Account lien minh vip', 100000, 1, 'lienminh', 'Acount', 'Uer:sonhao123, pass: 123456', 15000, 'https://hinhanhdephd.com/wp-content/uploads/2016/01/8hinh-nen-game-lien-minh-huyen-thoai-LOL-dep-2.jpg', 0),
(2, 'Lien quan', 6000, 1, 'lienquan', 'Account lien quan vip', 'user: haonguye24\r\npass:123456', 0, 'https://bloggame.net/upload-file/hinh-nen-lien-quan-cho-mobile-arthur-min5d303a3f1b55b.jpg', 0),
(3, 'Fifa online 4 vip', 1800000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 123 Tỷ GTDH Với Dàn Team Việt Nam +6 Cực Chất Lượng', 'user: quanghien11\r\npass: 123456', 0, 'https://shopaccfo4.com/uploads/43da11c5ce2f1cc37f1631100a0b442fbandicam%202020-07-04%2023-39-54-364.jpg', 0),
(4, 'Fifa online 4 ', 350000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 8 Tỷ GTDH Với Dàn Team +5 Với Ibrahimovic Ronaldo TC cùng dàn team khủng', 'user: taolatao123\r\npass: 1234567', 0, 'https://shopaccfo4.com/uploads/fb7c6429c598172a2ba90d50b71e188ebandicam%202020-07-10%2001-51-49-626.jpg', 0),
(5, 'Liên Minh giá rẻ', 30000, 1, 'lienminh', 'Acc LMHT giá rẻ\r\nRank: Đồng - Khung: Đồng\r\n', 'user: thachqui12345\r\npass: 123456', 15000, 'https://i.postimg.cc/jdvdsNkw/19603-1.jpg', 0),
(6, 'Fifa online 4 ', 500000, 1, 'bestseller', 'Mua Bán Acc Fifa Online 4 | 1,6 Tỷ BP Trắng Với Thông Tin Trắng Đi Xây Dựng Đội Hình Trong Mơ', 'User: balabala12345\r\nPass: 123456789', 0, 'https://shopaccfo4.com/uploads/f0a9ec4f1d7788599c045af4b1b286e4bandicam%202020-07-13%2022-30-31-526.jpg', 0),
(7, 'Fifa online 4 ', 3000000, 1, 'bestseller', 'Giá trị đội hình: 40 TỶ - Dư BP: 78 TR', 'User: vipvip123456\r\npass: 123456789', 0, 'https://muanickfo4.com/tep-tin/204512A.JPG', 0),
(11, 'Lien quan vip ', 500000, 1, 'lienquan', 'Accc Vip co nhieu skin', 'user: aaaaaaaaa\r\npass:bbbbbbbb', 0, 'https://nicklienquan247.com/uploads/acc/65b9eea6e1cc6bb9f0cd2a47751a186f-345383bandicam-2019-09-17-03-55-05-031.jpg', 0),
(12, 'Fifa online 4 vip', 100000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 7,3 Tỷ GTDH Với Dàn Team VN Quang Hải Quế Ngọc Hải Công Phượng Xuân Trường', 'User: hahaha\r\npass:123456789', 0, 'https://shopaccfo4.com/uploads/ed9126b10da313b41ff00cac7c68b5e0bandicam%202020-07-22%2017-47-12-198.jpg', 0),
(14, 'Fifa online 4 vip', 1000000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 16 Tỷ GTDH Kèm 2,8 Tỷ Bp Trắng Với Dàn Team HOT +5 J. Cruyff Puyol Vidal Busquests cùng Messi 20TY', 'User: prowapro123\r\nPass:123456789', 0, 'https://shopaccfo4.com/uploads/2f6bf2adc0c58b3c919906a5d96d3c92bandicam%202020-07-23%2002-04-29-089.jpg', 0),
(15, 'Fifa online 4 vip', 600000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 7,0 Tỷ BP Trắng Với Thông Tin Trắng Đi Xây Dựng Đội Hình Trong Mơ', 'User: nguyenvan\r\npass: 123456789', 0, 'https://shopaccfo4.com/uploads/ad53131a465cfe32fb5e175be59495d0bandicam%202020-07-20%2014-57-44-903.jpg', 0),
(16, 'Fifa online 4 vip', 500000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 4,0 Tỷ BP Trắng Với Thông Tin Trắng Đi Xây Dựng Đội Hình Trong Mơ', 'User: nguyennguyen\r\npass: 123456789', 0, 'https://shopaccfo4.com/uploads/35f438d10a0bb18da461646bc6766f5abandicam%202020-07-21%2002-43-57-115.jpg', 0),
(17, 'Fifa online 4 vip', 3400000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 46 Tỷ GTDH Kèm 15,8 Tỷ BP Trắng Với Petit ICON Varane 20TOTY +5 Kèm Dàn 19TS cực Chất Lượng', 'User: thanhhaha\r\npass: 123456789', 0, 'https://shopaccfo4.com/uploads/4c71900488071baef5e70cc7c54abf5bbandicam%202020-07-13%2022-48-07-915.jpg', 0),
(18, 'Fifa online 4', 180000, 1, 'fifa4', 'Mua Bán Acc Fifa Online 4 | 2 Tỷ GTDH Kèm 850 Tr Bp Trắng Với Dàn Team TT +5', 'User: tintin\r\npass: 123456789', 0, 'https://shopaccfo4.com/uploads/6aa044033470b75dee092f66592d93b0bandicam%202020-07-23%2003-27-19-487.jpg', 0),
(19, 'Acc Liên Minh vip', 2000000, 1, 'lienminh', 'Acc Liên Minh  - Rank: Vàng - Khung: Vàng full tướng 566 trang phục', 'User: adjadj123\r\nPass: khang123', 0, 'https://shopaccgiare.vn/public/files/info/39199-2.jpg', 0),
(20, '', 0, 0, '', '', '', 0, '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `rId` int(20) NOT NULL COMMENT 'id role',
  `NameRole` varchar(50) NOT NULL COMMENT 'Name of role '
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`rId`, `NameRole`) VALUES
(1, 'User'),
(2, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uId` int(10) NOT NULL COMMENT 'id user',
  `uFullName` varchar(50) NOT NULL COMMENT 'full name user',
  `userName` varchar(50) NOT NULL COMMENT 'username user',
  `uPassWord` varchar(50) NOT NULL COMMENT 'password user',
  `rid` int(20) NOT NULL COMMENT 'rid =1 user',
  `uAge` int(10) NOT NULL COMMENT 'age user',
  `uPhone` varchar(20) NOT NULL COMMENT 'phone user',
  `uEmail` varchar(50) NOT NULL COMMENT 'email user',
  `uAddress` varchar(50) NOT NULL COMMENT 'address user',
  `uBirthday` date NOT NULL COMMENT 'birthday user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='thable user';

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uId`, `uFullName`, `userName`, `uPassWord`, `rid`, `uAge`, `uPhone`, `uEmail`, `uAddress`, `uBirthday`) VALUES
(1, 'Nguyen Son Hao', 'haonguyen', '9d8cc04d36560d8bb56054f8f9354138', 2, 19, '0337470726', 'hao@gmail.com', 'ben tre', '2000-01-24');

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
-- Indexes for table `billdetail`
--
ALTER TABLE `billdetail`
  ADD PRIMARY KEY (`bdId`),
  ADD UNIQUE KEY `pId` (`pId`);

--
-- Indexes for table `descriptiondetail`
--
ALTER TABLE `descriptiondetail`
  ADD PRIMARY KEY (`dId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pId`);

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
  MODIFY `bId` int(20) NOT NULL AUTO_INCREMENT COMMENT 'Bill id', AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT for table `billdetail`
--
ALTER TABLE `billdetail`
  MODIFY `bdId` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id of bill';

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `pId` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id product', AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `uId` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id user', AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
