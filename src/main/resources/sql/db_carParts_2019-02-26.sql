# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.22)
# Database: db_carParts
# Generation Time: 2019-02-26 14:37:52 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table tb_admin
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_admin`;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_admin` WRITE;
/*!40000 ALTER TABLE `tb_admin` DISABLE KEYS */;

INSERT INTO `tb_admin` (`id`, `admin_name`, `admin_password`, `admin_realname`, `admin_sex`, `admin_age`, `admin_rank`, `admin_phone`, `admin_date`)
VALUES
	(1,'821453366','123456','普通用户','男','22','2','15684523145','2017-10-14'),
	(2,'admin','admin','管理员','男','21','1','15423323563','2017-03-12'),
	(3,'4564456','123456','小明','女','22','1','15684523145','2017-10-14'),
	(4,'45456787','123456','小花','男','22','1','15684523145','2017-10-14'),
	(5,'7898779','123456','小李','女','22','2','15684523145','2017-10-14'),
	(6,'45645646','123456','张飞','男','22','2','15684523145','2017-10-14'),
	(7,'79854512','123456','杨东','男','22','2','15684523145','2017-10-14'),
	(8,'45612536','123456','马虎','女','22','2','15684523145','2017-10-14'),
	(9,'78945123','123456','山水','男','22','1','15684523145','2017-10-14'),
	(10,'156789421','123456','扇贝','男','22','1','15684523145','2017-10-14'),
	(11,'486451245','123456','小明','男','23','2','13954213536','2017-10-14'),
	(12,'456456','456456','123456','男','23','1','15093049485','2017-10-25 ');

/*!40000 ALTER TABLE `tb_admin` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tb_customer
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_customer`;

CREATE TABLE `tb_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(20) DEFAULT NULL,
  `customer_sex` varchar(20) DEFAULT NULL,
  `customer_age` varchar(20) DEFAULT NULL,
  `customer_email` varchar(20) DEFAULT NULL,
  `customer_phone` varchar(20) DEFAULT NULL,
  `customer_company` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_customer` WRITE;
/*!40000 ALTER TABLE `tb_customer` DISABLE KEYS */;

INSERT INTO `tb_customer` (`id`, `customer_name`, `customer_sex`, `customer_age`, `customer_email`, `customer_phone`, `customer_company`)
VALUES
	(1,'田齐越','男','36','1234223242@qq.com','15382749483','博世汽车配件店'),
	(3,'李明','男','44','1343232424@qq.com','15094837633','ABM汽车配件店'),
	(4,'张卫东','男','55','564534565@qq.com','15093647284','易行汽车配件');

/*!40000 ALTER TABLE `tb_customer` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tb_parts
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_parts`;

CREATE TABLE `tb_parts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parts_version` varchar(20) DEFAULT NULL COMMENT '型号',
  `parts_name` varchar(20) DEFAULT NULL COMMENT '名称',
  `parts_price` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_parts` WRITE;
/*!40000 ALTER TABLE `tb_parts` DISABLE KEYS */;

INSERT INTO `tb_parts` (`id`, `parts_version`, `parts_name`, `parts_price`)
VALUES
	(1,'BF001','汽车底盘',122),
	(6,'GY002','汽车尾灯',97),
	(8,'JX013','汽车轮胎',100);

/*!40000 ALTER TABLE `tb_parts` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tb_purchase
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_purchase`;

CREATE TABLE `tb_purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `purchase_year` int(11) DEFAULT NULL,
  `purchase_month` int(11) DEFAULT NULL,
  `purchase_day` int(11) DEFAULT NULL,
  `purchase_code` varchar(20) DEFAULT NULL COMMENT '代码',
  `purchase_parts_id` varchar(20) DEFAULT '' COMMENT '名称',
  `purchase_capacity` varchar(20) DEFAULT '' COMMENT '大小',
  `purchase_pirce` varchar(20) DEFAULT NULL COMMENT '价格',
  `purchase_storage_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_purchase` WRITE;
/*!40000 ALTER TABLE `tb_purchase` DISABLE KEYS */;

INSERT INTO `tb_purchase` (`id`, `purchase_year`, `purchase_month`, `purchase_day`, `purchase_code`, `purchase_parts_id`, `purchase_capacity`, `purchase_pirce`, `purchase_storage_id`)
VALUES
	(18,2018,1,11,'HS111','GY002','222','222','KF001'),
	(19,2018,1,12,'HS112','GY002','111','100','KF001'),
	(21,2017,1,8,'HS108','BF001','420','110','KF002'),
	(23,2017,1,30,'HS130','BF001','300','95','KF002'),
	(25,2018,2,1,'HS201','GY002','100','100','KF003'),
	(26,2017,2,3,'HS203','BF001','200','100','KF003'),
	(27,2017,3,26,'HS326','JX013','500','120','KF004'),
	(28,2018,5,22,'HS522','JX013','300','90','KF002'),
	(29,2017,4,12,'412','GY002','300','80','KF002'),
	(30,2017,5,15,'HS515','BF001','500','120','KF002'),
	(31,2018,6,19,'H619','GY002','200','100','KF004'),
	(32,2017,3,15,'HS315','JX013','1000','100','KF003'),
	(33,2017,7,16,'HS716','JX013','500','90','KF005'),
	(34,2019,1,12,'HS16112','GY002','100','100','KF001'),
	(35,2019,2,22,'HS16222','GY002','200','90','KF002'),
	(36,2017,6,22,'HS17622','JX013','300','100','KF003'),
	(37,2017,6,23,'HS17623','GY002','100','90','KF005'),
	(38,2017,5,23,'HS17523','JX013','400','100','KF004'),
	(39,2017,5,14,'HS17514','JX013','600','100','KF001');

/*!40000 ALTER TABLE `tb_purchase` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tb_sale
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_sale`;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_sale` WRITE;
/*!40000 ALTER TABLE `tb_sale` DISABLE KEYS */;

INSERT INTO `tb_sale` (`id`, `sale_year`, `sale_month`, `sale_day`, `sale_code`, `sale_steel_id`, `sale_capacity`, `sale_pirce`, `sale_customer_id`, `sale_storage_id`)
VALUES
	(7,2019,1,23,'XS123',NULL,'100','200','1','KF002'),
	(8,2018,1,5,'XS105',NULL,'100','200','1','KF001'),
	(9,2018,3,15,'XS315',NULL,'100','300','3','KF004'),
	(10,2017,3,18,'XS318',NULL,'200','150','3','KF002'),
	(11,2018,5,29,'XS529',NULL,'100','200','1','KF003'),
	(12,2018,6,1,'XS601',NULL,'100','200','4','KF003'),
	(13,2017,3,3,'XS303',NULL,'200','150','4','KF003'),
	(14,2017,4,16,'XS416',NULL,'100','200','3','KF002'),
	(15,2017,6,14,'XS614',NULL,'100','200','1','KF002'),
	(16,2018,7,27,'XS727',NULL,'130','150','3','KF003'),
	(17,2018,7,25,'XS725',NULL,'100','250','1','KF002'),
	(19,2017,7,30,'XS713',NULL,'300','200','1','KF002'),
	(20,2018,8,12,'XS812',NULL,'500','150','1','KF002'),
	(21,2017,8,30,'XS830',NULL,'300','100','3','KF004');

/*!40000 ALTER TABLE `tb_sale` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tb_stock
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_stock`;

CREATE TABLE `tb_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_year` varchar(20) DEFAULT NULL,
  `stock_month` varchar(20) DEFAULT NULL,
  `stock_code` varchar(20) DEFAULT NULL COMMENT '代码',
  `stock_capacity` varchar(20) DEFAULT '' COMMENT '大小',
  `stock_steel_id` varchar(20) DEFAULT NULL COMMENT '汽车配件类型',
  `stock_storage_id` varchar(20) DEFAULT NULL COMMENT '库房编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_stock` WRITE;
/*!40000 ALTER TABLE `tb_stock` DISABLE KEYS */;

INSERT INTO `tb_stock` (`id`, `stock_year`, `stock_month`, `stock_code`, `stock_capacity`, `stock_steel_id`, `stock_storage_id`)
VALUES
	(8,NULL,NULL,'KF003','1070',NULL,'KF003'),
	(13,NULL,NULL,'KF002','620',NULL,'KF002'),
	(14,NULL,NULL,'KF001','933',NULL,'KF001'),
	(15,NULL,NULL,'KF004','700',NULL,'KF004'),
	(16,NULL,NULL,'KF005','600',NULL,'KF005');

/*!40000 ALTER TABLE `tb_stock` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tb_storage
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_storage`;

CREATE TABLE `tb_storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `storage_code` varchar(20) DEFAULT NULL,
  `storage_name` varchar(20) DEFAULT NULL,
  `storage_capacity` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tb_storage` WRITE;
/*!40000 ALTER TABLE `tb_storage` DISABLE KEYS */;

INSERT INTO `tb_storage` (`id`, `storage_code`, `storage_name`, `storage_capacity`)
VALUES
	(13,'KF003','三号库房','50000'),
	(18,'KF002','二号库房','80000'),
	(19,'KF001','一号库房','70000'),
	(20,'KF004','四号库房','80000'),
	(21,'KF005','五号库房','80000');

/*!40000 ALTER TABLE `tb_storage` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
