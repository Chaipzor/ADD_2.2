-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: p22
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telefono` int(15) NOT NULL,
  `pass` varchar(300) NOT NULL,
  `rol_admin` tinyint(1) NOT NULL,
  `idioma` varchar(5) NOT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Angel','Sanchez','Chaip@gmail.com',1,'lXTLjdo2FFQ/1g0UbtVOfHaRMcXmSeedQ+74KKJkgsaMpvHMgKPQjcZOW6K63hCH',1,'es','Barcelona'),(6,'angel','angel','a@angel.com',1234,'cuwYN4AqSKFBb4+Htqfbl0Vj6XnyI0VCg97ZpGoanpAP3a0xpdIcDQ+fZ+/97Lak',0,'es','Girona'),(7,'Vanesa','Ner','Va@gmail.com',1234,'EzjCrKzid9a6v0ejghUqjaxt2vk01vObstqbJscdZVoWCeKOhKXwpMzFckIwTTTU',1,'es','Sevilla'),(8,'Pablo','Gómez','pablo@gmail.com',1234,'vMX2QKmvyO3zz1dAA3Ut3E1FI5q6rrTKDwcWzArjhkJCYkssU1Ak8advVt+V7ym7',0,'es','Balears, Illes'),(9,'clara','jimenez','cj@gmail.com',1234,'XNSuj+tUzhmMv5JuTTVhkzsWGC8rUKdyvyDvGT0YsXxoS1hBR0KZp6QPz85e+KU+',0,'es','Asturias'),(11,'Ignacio','Nacho','in@gmail.com',555444333,'X/Dr9Y9E3QNVhCD0N+VLr8T74QbG8W0ARvXvfK8gGpwuBY9gZjAnFsu87+JWo4H9',0,'es','CÃ³rdoba'),(13,'MÃ³nica','Benitez','mb@gmail.com',111222333,'IVfLzyBHz8Dv5hmOriskTKAbMnADwsk/sMlhb/wqLs516gxAws5RubWGZdaPn3am',0,'es','JaÃ©n'),(14,'Daniel','Rodriguez','dr@gmail.com',999222333,'x9ZAhGQU/t2qbQNtwOoxeNsszOgWCcNDglX1EIrHFOolqackzQBF9d0V0qS3v3ZC',0,'es','Cantabria'),(15,'Nerea','Lopez','nl@gmail.com',12343221,'hb10pHfx/wwd8JTmykVjDGf+g/W+k7GjgCL1kgv7ATPBG007O5rENqC3r8Ox0WBF',0,'es','Barcelona');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-02  8:52:48
