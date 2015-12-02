CREATE DATABASE  IF NOT EXISTS `bazevezbanje`
USE `bazevezbanje`;

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

INSERT INTO `customer` 
VALUES (1,'Igor','Eric'),
(2,'Uros','Eric'),
(3,'Nikola','Sutic'),
(4,'Dusan','Eric'),
(5,'Stojka','Eric'),
(6,'Spomenka','Celebic'),
(7,'Miroslav','Celebic');

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `order_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `order_name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;


INSERT INTO `orders` 
VALUES 
(1,1,'kola'),
(2,1,'tablice'),
(3,1,'sleper'),
(4,2,'stap za pecanje'),
(5,3,'selfi palica'),
(6,6,'samostrel'),
(7,6,'puska'),
(8,5,'oklagija'),
(9,4,'alat'),
(10,4,'kutija za alat'),
(11,7,'lopta'),
(12,7,'pivo');
