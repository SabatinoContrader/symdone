CREATE DATABASE  IF NOT EXISTS `syndone` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `syndone`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: syndone
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `disease`
--

DROP TABLE IF EXISTS `disease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `disease` (
  `iddisease` int(11) NOT NULL AUTO_INCREMENT,
  `disease_name` varchar(45) DEFAULT NULL,
  `disease_desc` varchar(100) DEFAULT NULL,
  `synthom_id` int(11) DEFAULT NULL,
  `herb_id` int(11) DEFAULT NULL,
  `medicine_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`iddisease`),
  KEY `sympthom_id_idx` (`synthom_id`),
  KEY `herb_id_idx` (`herb_id`),
  CONSTRAINT `herb_id` FOREIGN KEY (`herb_id`) REFERENCES `herbs` (`idherbs`),
  CONSTRAINT `sympthom_id` FOREIGN KEY (`synthom_id`) REFERENCES `sympthom_relation` (`id_relation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disease`
--

LOCK TABLES `disease` WRITE;
/*!40000 ALTER TABLE `disease` DISABLE KEYS */;
/*!40000 ALTER TABLE `disease` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herbs`
--

DROP TABLE IF EXISTS `herbs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `herbs` (
  `idherbs` int(11) NOT NULL AUTO_INCREMENT,
  `herb_name` varchar(45) DEFAULT NULL,
  `herb_desc` varchar(100) DEFAULT NULL,
  `iddisease` int(11) DEFAULT NULL,
  PRIMARY KEY (`idherbs`),
  KEY `iddisease_idx` (`iddisease`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herbs`
--

LOCK TABLES `herbs` WRITE;
/*!40000 ALTER TABLE `herbs` DISABLE KEYS */;
/*!40000 ALTER TABLE `herbs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `roles` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'Administrator');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sympthom_position`
--

DROP TABLE IF EXISTS `sympthom_position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sympthom_position` (
  `position_id` int(11) NOT NULL AUTO_INCREMENT,
  `position_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sympthom_position`
--

LOCK TABLES `sympthom_position` WRITE;
/*!40000 ALTER TABLE `sympthom_position` DISABLE KEYS */;
INSERT INTO `sympthom_position` VALUES (1,'Testa'),(2,'Occhio'),(3,'Orecchio'),(4,'Denti'),(5,'Gola'),(6,'Collo'),(7,'Petto'),(8,'Stomaco'),(9,'Spalle'),(10,'Schiena'),(11,'Braccio'),(12,'Mano'),(13,'Gamba'),(14,'Piede');
/*!40000 ALTER TABLE `sympthom_position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sympthom_relation`
--

DROP TABLE IF EXISTS `sympthom_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sympthom_relation` (
  `id_relation` int(11) NOT NULL AUTO_INCREMENT,
  `idSympthom_type` int(11) DEFAULT NULL,
  `position_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_relation`),
  KEY `position_id_idx` (`position_id`),
  KEY `idsympthom_type_idx` (`idSympthom_type`),
  CONSTRAINT `idsympthom_type` FOREIGN KEY (`idSympthom_type`) REFERENCES `sympthom_type` (`idsympthom_type`),
  CONSTRAINT `position_id` FOREIGN KEY (`position_id`) REFERENCES `sympthom_position` (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sympthom_relation`
--

LOCK TABLES `sympthom_relation` WRITE;
/*!40000 ALTER TABLE `sympthom_relation` DISABLE KEYS */;
/*!40000 ALTER TABLE `sympthom_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sympthom_type`
--

DROP TABLE IF EXISTS `sympthom_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sympthom_type` (
  `idsympthom_type` int(11) NOT NULL AUTO_INCREMENT,
  `sympthom_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idsympthom_type`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sympthom_type`
--

LOCK TABLES `sympthom_type` WRITE;
/*!40000 ALTER TABLE `sympthom_type` DISABLE KEYS */;
INSERT INTO `sympthom_type` VALUES (1,'Dolore'),(2,'Bruciore'),(3,'Prurito'),(4,'Gonfiore'),(5,'Arrossamento'),(6,'Indolenzimento'),(7,'Sanguinamento'),(8,'Ematoma');
/*!40000 ALTER TABLE `sympthom_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`,`password`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `roleid_idx` (`roleid`),
  CONSTRAINT `roleid` FOREIGN KEY (`roleid`) REFERENCES `roles` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'giacobbe18','pippo',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-17 11:14:44
