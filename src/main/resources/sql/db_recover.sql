-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: db_recover
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.17.10.1

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
-- Table structure for table `tb_admin`
--

DROP TABLE IF EXISTS `tb_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) DEFAULT NULL,
  `admin_password` varchar(20) DEFAULT NULL,
  `admin_realname` varchar(20) DEFAULT NULL,
  `admin_sex` varchar(20) DEFAULT NULL,
  `admin_age` varchar(20) DEFAULT NULL,
  `admin_rank` varchar(20) DEFAULT NULL,
  `admin_phone` varchar(20) DEFAULT NULL,
  `admin_date` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_admin`
--

LOCK TABLES `tb_admin` WRITE;
/*!40000 ALTER TABLE `tb_admin` DISABLE KEYS */;
INSERT INTO `tb_admin` VALUES (1,'821453366','123456','普通用户','男','22','2','15684523145','2017-10-14'),(2,'admin','admin','管理员','男','21','1','15423323563','2017-03-12'),(3,'4564456','123456','小明','女','22','1','15684523145','2017-10-14'),(4,'45456787','123456','小花','男','22','1','15684523145','2017-10-14'),(5,'7898779','123456','小李','女','22','2','15684523145','2017-10-14'),(6,'45645646','123456','张飞','男','22','2','15684523145','2017-10-14'),(7,'79854512','123456','杨东','男','22','2','15684523145','2017-10-14'),(8,'45612536','123456','马虎','女','22','2','15684523145','2017-10-14'),(9,'78945123','123456','山水','男','22','1','15684523145','2017-10-14'),(10,'156789421','123456','扇贝','男','22','1','15684523145','2017-10-14'),(11,'486451245','123456','小明','男','23','2','13954213536','2017-10-14'),(12,'456456','456456','123456','男',NULL,'2',NULL,'2017-10-25 ');
/*!40000 ALTER TABLE `tb_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_customer`
--

DROP TABLE IF EXISTS `tb_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(20) DEFAULT NULL,
  `customer_sex` varchar(20) DEFAULT NULL,
  `customer_age` varchar(20) DEFAULT NULL,
  `customer_email` varchar(20) DEFAULT NULL,
  `customer_phone` varchar(20) DEFAULT NULL,
  `customer_company` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_customer`
--

LOCK TABLES `tb_customer` WRITE;
/*!40000 ALTER TABLE `tb_customer` DISABLE KEYS */;
INSERT INTO `tb_customer` VALUES (1,'张经理','男','30','1532135345@qq.com','15426453625','西安中铁一局'),(3,'黄山','男','22','821457744@qq.com','1564236512','西安二手车交易'),(4,'李东','男','36','965412632@qq.com','15632453625','西安宏润钢材有限公司');
/*!40000 ALTER TABLE `tb_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_recovery`
--

DROP TABLE IF EXISTS `tb_recovery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_recovery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recovery_year` int(11) DEFAULT NULL,
  `recovery_month` int(11) DEFAULT NULL,
  `recovery_day` int(11) DEFAULT NULL,
  `recovery_code` varchar(20) DEFAULT NULL COMMENT '代码',
  `recovery_steel_id` varchar(20) DEFAULT '' COMMENT '名称',
  `recovery_capacity` varchar(20) DEFAULT '' COMMENT '大小',
  `recovery_pirce` varchar(20) DEFAULT NULL COMMENT '价格',
  `recovery_storage_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_recovery`
--

LOCK TABLES `tb_recovery` WRITE;
/*!40000 ALTER TABLE `tb_recovery` DISABLE KEYS */;
INSERT INTO `tb_recovery` VALUES (18,2017,1,11,'HS111','GY002','222','222','KF001'),(19,2017,1,12,'HS112','GY002','111','100','KF001'),(21,2017,1,8,'HS108','BF001','420','110','KF002'),(23,2017,1,30,'HS130','BF001','300','95','KF002'),(25,2017,2,1,'HS201','GY002','100','100','KF003'),(26,2017,2,3,'HS203','BF001','200','100','KF003'),(27,2017,3,26,'HS326','JX013','500','120','KF004'),(28,2017,5,22,'HS522','JX013','300','90','KF002'),(29,2017,4,12,'412','GY002','300','80','KF002'),(30,2017,5,15,'HS515','BF001','500','120','KF002'),(31,2017,6,19,'H619','GY002','200','100','KF004'),(32,2017,3,15,'HS315','JX013','1000','100','KF003'),(33,2017,7,16,'HS716','JX013','500','90','KF005'),(34,2016,1,12,'HS16112','GY002','100','100','KF001'),(35,2016,2,22,'HS16222','GY002','200','90','KF002'),(36,2017,6,22,'HS17622','JX013','300','100','KF003'),(37,2017,6,23,'HS17623','GY002','100','90','KF005'),(38,2017,5,23,'HS17523','JX013','400','100','KF004'),(39,2017,5,14,'HS17514','JX013','600','100','KF001');
/*!40000 ALTER TABLE `tb_recovery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sale`
--

DROP TABLE IF EXISTS `tb_sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_sale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sale_year` int(11) DEFAULT NULL COMMENT '时间',
  `sale_month` int(11) DEFAULT NULL,
  `sale_day` int(11) DEFAULT NULL,
  `sale_code` varchar(20) DEFAULT NULL,
  `sale_steel_id` varchar(20) DEFAULT NULL,
  `sale_capacity` varchar(20) DEFAULT NULL,
  `sale_pirce` varchar(20) DEFAULT NULL,
  `sale_customer_id` varchar(20) DEFAULT NULL COMMENT '客户id',
  `sale_storage_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sale`
--

LOCK TABLES `tb_sale` WRITE;
/*!40000 ALTER TABLE `tb_sale` DISABLE KEYS */;
INSERT INTO `tb_sale` VALUES (7,2017,1,23,'XS123',NULL,'100','200','1','KF002'),(8,2017,1,5,'XS105',NULL,'100','200','1','KF001'),(9,2017,3,15,'XS315',NULL,'100','300','3','KF004'),(10,2017,3,18,'XS318',NULL,'200','150','3','KF002'),(11,2017,5,29,'XS529',NULL,'100','200','1','KF003'),(12,2017,6,1,'XS601',NULL,'100','200','4','KF003'),(13,2017,3,3,'XS303',NULL,'200','150','4','KF003'),(14,2017,4,16,'XS416',NULL,'100','200','3','KF002'),(15,2017,6,14,'XS614',NULL,'100','200','1','KF002'),(16,2017,7,27,'XS727',NULL,'130','150','3','KF003'),(17,2017,7,25,'XS725',NULL,'100','250','1','KF002'),(19,2017,7,30,'XS713',NULL,'300','200','1','KF002'),(20,2017,8,12,'XS812',NULL,'500','150','1','KF002'),(21,2017,8,30,'XS830',NULL,'300','100','3','KF004');
/*!40000 ALTER TABLE `tb_sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_steel`
--

DROP TABLE IF EXISTS `tb_steel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_steel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `steel_version` varchar(20) DEFAULT NULL COMMENT '型号',
  `steel_name` varchar(20) DEFAULT NULL COMMENT '名称',
  `steel_price` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_steel`
--

LOCK TABLES `tb_steel` WRITE;
/*!40000 ALTER TABLE `tb_steel` DISABLE KEYS */;
INSERT INTO `tb_steel` VALUES (1,'BF001','报废汽车',122),(6,'GY002','工业绣钢',97),(8,'JX013','机械拆卸部件',100);
/*!40000 ALTER TABLE `tb_steel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_stock`
--

DROP TABLE IF EXISTS `tb_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_year` varchar(20) DEFAULT NULL,
  `stock_month` varchar(20) DEFAULT NULL,
  `stock_code` varchar(20) DEFAULT NULL COMMENT '代码',
  `stock_capacity` varchar(20) DEFAULT '' COMMENT '大小',
  `stock_steel_id` varchar(20) DEFAULT NULL COMMENT '钢铁类型',
  `stock_storage_id` varchar(20) DEFAULT NULL COMMENT '仓库编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_stock`
--

LOCK TABLES `tb_stock` WRITE;
/*!40000 ALTER TABLE `tb_stock` DISABLE KEYS */;
INSERT INTO `tb_stock` VALUES (8,NULL,NULL,'KF003','1070',NULL,'KF003'),(13,NULL,NULL,'KF002','620',NULL,'KF002'),(14,NULL,NULL,'KF001','933',NULL,'KF001'),(15,NULL,NULL,'KF004','700',NULL,'KF004'),(16,NULL,NULL,'KF005','600',NULL,'KF005');
/*!40000 ALTER TABLE `tb_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_storage`
--

DROP TABLE IF EXISTS `tb_storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `storage_code` varchar(20) DEFAULT NULL,
  `storage_name` varchar(20) DEFAULT NULL,
  `storage_capacity` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_storage`
--

LOCK TABLES `tb_storage` WRITE;
/*!40000 ALTER TABLE `tb_storage` DISABLE KEYS */;
INSERT INTO `tb_storage` VALUES (13,'KF003','三号仓库','50000'),(18,'KF002','二号仓库','80000'),(19,'KF001','一号仓库','70000'),(20,'KF004','四号仓库','80000'),(21,'KF005','五号仓库','80000');
/*!40000 ALTER TABLE `tb_storage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-26 11:11:11
