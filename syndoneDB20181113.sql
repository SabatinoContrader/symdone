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
-- Table structure for table `erba`
--

DROP TABLE IF EXISTS `erba`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `erba` (
  `iderba` bigint(20) NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(255) DEFAULT NULL,
  `erba` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`iderba`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erba`
--

LOCK TABLES `erba` WRITE;
/*!40000 ALTER TABLE `erba` DISABLE KEYS */;
INSERT INTO `erba` VALUES (1,NULL,'limone'),(2,NULL,'zenzero'),(3,NULL,'aloe'),(4,NULL,'olio31'),(5,NULL,'soia'),(6,NULL,'finocchio'),(7,NULL,'camomilla'),(8,NULL,'verbena'),(9,NULL,'vagisil crema'),(10,NULL,'cannella');
/*!40000 ALTER TABLE `erba` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `esame`
--

DROP TABLE IF EXISTS `esame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `esame` (
  `idesame` bigint(20) NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(255) DEFAULT NULL,
  `esame` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idesame`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `esame`
--

LOCK TABLES `esame` WRITE;
/*!40000 ALTER TABLE `esame` DISABLE KEYS */;
INSERT INTO `esame` VALUES (1,'','ecografia'),(2,NULL,'radiografia'),(3,NULL,'emocromo'),(4,NULL,'tac');
/*!40000 ALTER TABLE `esame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `medico` (
  `idmedico` bigint(20) NOT NULL AUTO_INCREMENT,
  `cognome` varchar(255) DEFAULT NULL,
  `indirizzo` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `specializzazione` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idmedico`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (2,'Zollo','via Benevento 5','mimmo@ciao.it','Domenico','ortopedia'),(3,'Colomban','via Roma 10','valeria@ciao.it','Valeria','cardiologia'),(4,'Autorino','via Napoli 6','sabatino@ciao.it','Sabatino','oculista'),(5,'Pagano','via Firenze 10','cristian@ciao','Cristian','ginecologia'),(6,'Russo','via dei Marsi 62','alessandra@ciao.it','Alessandra','medicina generale'),(7,'Cardaci ','via Sprito Santo 11','sara@ciao.it','Sara','dermatologia'),(8,'Giacobbe','via Mellusi 7','alessandro@ciao.it','Alessandro','neurologia');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patologia`
--

DROP TABLE IF EXISTS `patologia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `patologia` (
  `idpatologia` bigint(20) NOT NULL AUTO_INCREMENT,
  `descrizione` varchar(255) DEFAULT NULL,
  `patologia` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idpatologia`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patologia`
--

LOCK TABLES `patologia` WRITE;
/*!40000 ALTER TABLE `patologia` DISABLE KEYS */;
INSERT INTO `patologia` VALUES (1,NULL,'gastrointerite'),(2,NULL,'varicella'),(3,NULL,'emicrania con aura'),(4,NULL,'influenza'),(5,NULL,'morbillo'),(6,NULL,'otite'),(7,NULL,'laringite'),(8,NULL,'congiuntivite'),(9,NULL,'ovaie policistiche'),(10,NULL,'dermatite da contatto'),(11,NULL,'artrosi');
/*!40000 ALTER TABLE `patologia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patologiaerba`
--

DROP TABLE IF EXISTS `patologiaerba`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `patologiaerba` (
  `idpatologia` bigint(20) NOT NULL,
  `iderba` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patologiaerba`
--

LOCK TABLES `patologiaerba` WRITE;
/*!40000 ALTER TABLE `patologiaerba` DISABLE KEYS */;
INSERT INTO `patologiaerba` VALUES (1,2),(4,7),(4,10),(5,3),(6,8),(6,6),(7,7),(7,6),(7,10),(9,9),(8,3),(1,1),(3,4),(2,3),(2,9),(11,4),(10,3);
/*!40000 ALTER TABLE `patologiaerba` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patologiaesame`
--

DROP TABLE IF EXISTS `patologiaesame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `patologiaesame` (
  `idpatologia` bigint(20) NOT NULL,
  `idesame` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patologiaesame`
--

LOCK TABLES `patologiaesame` WRITE;
/*!40000 ALTER TABLE `patologiaesame` DISABLE KEYS */;
INSERT INTO `patologiaesame` VALUES (1,1),(2,3),(3,4),(4,3),(5,3),(6,3),(7,1),(9,1),(10,3),(11,2);
/*!40000 ALTER TABLE `patologiaesame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patologiamedici`
--

DROP TABLE IF EXISTS `patologiamedici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `patologiamedici` (
  `idpatologia` bigint(20) NOT NULL,
  `idmedico` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patologiamedici`
--

LOCK TABLES `patologiamedici` WRITE;
/*!40000 ALTER TABLE `patologiamedici` DISABLE KEYS */;
INSERT INTO `patologiamedici` VALUES (1,6),(2,6),(2,7),(3,8),(4,6),(5,6),(5,7),(6,6),(7,6),(8,4),(9,5),(10,7),(11,1),(11,2);
/*!40000 ALTER TABLE `patologiamedici` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sintomo`
--

DROP TABLE IF EXISTS `sintomo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sintomo` (
  `idsintomo` bigint(20) NOT NULL AUTO_INCREMENT,
  `sintomo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idsintomo`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sintomo`
--

LOCK TABLES `sintomo` WRITE;
/*!40000 ALTER TABLE `sintomo` DISABLE KEYS */;
INSERT INTO `sintomo` VALUES (1,'capogiri'),(2,'prurito'),(3,'acne'),(4,'arrossamento'),(5,'diarrea'),(6,'vomito'),(7,'crampi addominali'),(8,'febbre'),(9,'mal di gola'),(10,'nausea'),(11,'tosse'),(12,'dolori articolari'),(13,'tachicardia'),(14,'macchie sulla pelle'),(15,'eruzione cutanea'),(16,'stanchezza'),(17,'naso che cola'),(18,'gonfiore occhi'),(19,'sordità'),(20,'mal di orecchio'),(21,'difficoltà a deglutire'),(22,'raucedine'),(23,'mestruazioni irregolari'),(24,'peluria'),(25,'scarsa lacrimazione'),(26,'mal di testa'),(27,'deformità articolare'),(28,'tumefazione'),(29,'croste'),(30,'desquamazione'),(31,'chiazze rosse'),(32,'brividi');
/*!40000 ALTER TABLE `sintomo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sintomopatologia`
--

DROP TABLE IF EXISTS `sintomopatologia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sintomopatologia` (
  `idsintomo` bigint(20) NOT NULL,
  `idpatologia` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sintomopatologia`
--

LOCK TABLES `sintomopatologia` WRITE;
/*!40000 ALTER TABLE `sintomopatologia` DISABLE KEYS */;
INSERT INTO `sintomopatologia` VALUES (5,1),(6,1),(7,1),(10,1),(8,1),(8,2),(15,2),(2,2),(26,3),(10,3),(6,3),(11,4),(12,4),(13,4),(8,5),(12,5),(14,5),(15,5),(16,5),(17,5),(4,5),(18,5),(11,5),(19,6),(20,6),(32,6),(9,7),(21,7),(22,7),(25,8),(2,8),(18,8),(23,9),(3,9),(24,9),(29,10),(30,10),(31,10),(27,11),(28,11),(12,11);
/*!40000 ALTER TABLE `sintomopatologia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sintomoset`
--

DROP TABLE IF EXISTS `sintomoset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sintomoset` (
  `idsintomoset` bigint(20) NOT NULL AUTO_INCREMENT,
  `idprimosintomo` int(11) NOT NULL,
  `idsecondosintomo` int(11) NOT NULL,
  `idterzosintomo` int(11) NOT NULL,
  PRIMARY KEY (`idsintomoset`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sintomoset`
--

LOCK TABLES `sintomoset` WRITE;
/*!40000 ALTER TABLE `sintomoset` DISABLE KEYS */;
INSERT INTO `sintomoset` VALUES (2,1,1,1);
/*!40000 ALTER TABLE `sintomoset` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-13 15:44:18
