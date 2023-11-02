-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: bao
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `universal`
--

DROP TABLE IF EXISTS `universal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `universal` (
  `nome` varchar(50) NOT NULL,
  `titulo_alternativo` varchar(50) NOT NULL,
  `capitulo` varchar(5) NOT NULL,
  `status` enum('completo','andamento','incompleto','desistiu') NOT NULL,
  `sinopse` varchar(2500) NOT NULL,
  `id_tipo` enum('Anime','Mangá','Novel') NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `link` varchar(150) NOT NULL,
  `escritor` int NOT NULL,
  `estudioEditora` int NOT NULL,
  PRIMARY KEY (`id`,`id_tipo`,`escritor`,`estudioEditora`),
  KEY `escritor` (`escritor`),
  KEY `estudioEditora` (`estudioEditora`),
  CONSTRAINT `universal_ibfk_1` FOREIGN KEY (`escritor`) REFERENCES `escritor` (`id_esc`),
  CONSTRAINT `universal_ibfk_2` FOREIGN KEY (`estudioEditora`) REFERENCES `estudio_editora` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `universal`
--

LOCK TABLES `universal` WRITE;
/*!40000 ALTER TABLE `universal` DISABLE KEYS */;
INSERT INTO `universal` VALUES ('One piece','One piece','1031','andamento','One Piece Todos os Episodios Online, Assistir One Piece Anime Completo, Assistir One Piece Online.\nHouve um homem que conquistou tudo aquilo que o mundo tinha a oferecer, o lendário Rei dos Piratas, Gold Roger. Capturado e condenado à execução pelo Governo Mundial, suas últimas palavras lançaram legiões aos mares. “Meu tesouro? Se quiserem, podem pegá-lo. Procurem-no! Ele contém tudo que este mundo pode oferecer!”. Foi a revelação do maior tesouro, o One Piece, cobiçado por homens de todo o mundo, sonhando com fama e riqueza imensuráveis… Assim começou a Grande Era dos Piratas!','Anime',1,'https://animesonline.cc/anime/one-piece/',1,1),('Demon slayer','Kimetsu no Yaiba','37','completo','Kimetsu no Yaiba Todos os Episodios Online, Assistir Kimetsu no Yaiba Anime Completo, Assistir Kimetsu no Yaiba Online.\nJapão, era Taisho. Tanjiro, um bondoso jovem que ganha a vida vendendo carvão, descobre que sua família foi massacrada por um demônio. E pra piorar, Nezuko, sua irmã mais nova e única sobrevivente, também foi transformada num demônio. Arrasado com esta sombria realidade, Tanjiro decide se tornar um matador de demônios para fazer sua irmã voltar a ser humana, e para matar o demônio que matou sua família. Um triste conto sobre dois irmãos, onde os destinos dos humanos e dos demônios se entrelaçam, começa agora.','Anime',2,'https://animesonline.cc/anime/kimetsu-no-yaiba/',1,2),('Naruto','Naruto','400','completo','Naruto Clássico Dublado Todos os Episodios Online, Assistir Naruto Clássico Dublado Anime Completo, Naruto Clássico Online.\nDoze anos antes do início da série, um monstro conhecido como Raposa de Nove Caudas (Kyuubi) atacou a aldeia de Konoha, destruindo grande parte da aldeia e tirando muitas vidas. O líder da aldeia, o quarto Hokage, sacrificou a sua vida para selá-la em um recém-nascido, Naruto Uzumaki. Órfão por causa do ataque, Naruto sempre é evitado pelos moradores, que por medo e raiva, veem-no como o próprio Nove Caudas. Com sua sede por reconhecimento, Naruto jura que um dia se tornará o maior Hokage da aldeia.','Anime',2,'https://animesonline.cc/anime/naruto/',3,2);
/*!40000 ALTER TABLE `universal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-02 18:42:51
