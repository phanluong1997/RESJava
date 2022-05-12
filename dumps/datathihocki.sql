-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: datathihocki_db
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `giay`
--

DROP TABLE IF EXISTS `giay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giay` (
  `idgiay` int(11) NOT NULL AUTO_INCREMENT,
  `tengiay` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hinhanh` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gia` int(11) DEFAULT NULL,
  `idloaigiay` int(11) NOT NULL,
  PRIMARY KEY (`idgiay`),
  KEY `fk_khoa_idx` (`idloaigiay`),
  CONSTRAINT `fk_khoa` FOREIGN KEY (`idloaigiay`) REFERENCES `loaigiay` (`idloaigiay`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giay`
--

LOCK TABLES `giay` WRITE;
/*!40000 ALTER TABLE `giay` DISABLE KEYS */;
INSERT INTO `giay` VALUES (1,'adisad','img1.jpg',457455,4),(2,'Adidas SWIFT RUN BARRIER SHOES','img2.jpg',60000,2),(3,'Adidas NMD_R1 PRIMEKNIT SHOES','img3.jpg',457,8),(5,'Adidas CRAZY BYW SHOES','img5.jpg',900,5),(6,'Adidas PROPHERE SHOES','img6.jpg',700,6),(7,'BOOTS','boots5.jpg',799,7);
/*!40000 ALTER TABLE `giay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaigiay`
--

DROP TABLE IF EXISTS `loaigiay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaigiay` (
  `idloaigiay` int(11) NOT NULL AUTO_INCREMENT,
  `tenloai` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idloaigiay`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaigiay`
--

LOCK TABLES `loaigiay` WRITE;
/*!40000 ALTER TABLE `loaigiay` DISABLE KEYS */;
INSERT INTO `loaigiay` VALUES (2,'Adidas ARKYN PRIMEKNIT SHOES'),(3,'adidas phero'),(4,'Adidas NMD_R1 PRIMEKNIT SHOES'),(5,'Adidas CRAZY BYW SHOES'),(6,'Adidas PROPHERE SHOES'),(7,'Adidas ULTRABOOST X ALL TERRAIN SHOES'),(8,'Adidas SWIFT RUN BARRIER SHOES'),(9,'phapmypvv');
/*!40000 ALTER TABLE `loaigiay` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-19 11:08:23
