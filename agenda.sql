-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: agendavirtual2023
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `idcontacto` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `fechanac` date DEFAULT NULL,
  `celular` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `fecharegistro` datetime DEFAULT NULL,
  PRIMARY KEY (`idcontacto`),
  UNIQUE KEY `idcontacto_UNIQUE` (`idcontacto`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'Luciano Coronel','1995-02-09',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:28:00'),(2,'Melany Avalos','1997-12-19',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:28:00'),(3,'Carlos Coronel','1962-10-09',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:29:00'),(4,'Gladys Lopez Noemi','1964-07-24',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:29:00'),(5,'Carlos Avalos','1964-09-13',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:30:00'),(6,'Maria Rosa Palavecino','1964-08-04',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:30:00'),(7,'Gary Avalos Coronel','1995-02-09',1137601819,'lucianocoronel48@gmail.com','2023-07-18 12:30:00'),(9,'hola','2022-01-14',1137601819,'Lucianocoronel48@gmail.com','2023-07-18 18:53:27');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'agendavirtual2023'
--

--
-- Dumping routines for database 'agendavirtual2023'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-20 15:18:14
