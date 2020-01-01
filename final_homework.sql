/*
Navicat MySQL Data Transfer

Source Server         : connector
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : final_homework

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-01-01 08:51:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `admin_name` varchar(20) NOT NULL COMMENT '管理员姓名',
  `password` varchar(20) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '123456');
INSERT INTO `admin` VALUES ('12', '是打发打发啊', '123456');
INSERT INTO `admin` VALUES ('13', 'admin阿斯蒂芬', '123456');
INSERT INTO `admin` VALUES ('14', 'admin阿斯蒂阿斯蒂芬芬', '123456');
INSERT INTO `admin` VALUES ('15', 'admin阿斯', '123456');
INSERT INTO `admin` VALUES ('16', '东方故事admin阿斯', '123456');
INSERT INTO `admin` VALUES ('17', '东方故事说过话admin阿斯', '123456');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `class_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '比赛类别id',
  `category` varchar(64) DEFAULT NULL COMMENT '类别(ABC类)',
  `grade` varchar(64) DEFAULT NULL COMMENT '等级(一、二、三等)',
  `base` decimal(64,2) DEFAULT NULL COMMENT '基数',
  `factor` decimal(64,2) DEFAULT NULL COMMENT '系数',
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('4', 'A类', '一等奖', '66.00', '6.60');
INSERT INTO `class` VALUES ('5', 'B类', '二等奖', '6.60', '3.30');

-- ----------------------------
-- Table structure for comp
-- ----------------------------
DROP TABLE IF EXISTS `comp`;
CREATE TABLE `comp` (
  `comp_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '比赛id',
  `comp_name` varchar(64) DEFAULT NULL COMMENT '比赛名',
  `class_id` bigint(20) DEFAULT NULL COMMENT '比赛类别id',
  PRIMARY KEY (`comp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comp
-- ----------------------------
INSERT INTO `comp` VALUES ('37', 'a类北信科英语大赛', '4');
INSERT INTO `comp` VALUES ('38', '北信科舞蹈大赛', '4');
INSERT INTO `comp` VALUES ('39', '北信科ACM', '4');
INSERT INTO `comp` VALUES ('40', '北信科优秀宿舍评比', '5');
INSERT INTO `comp` VALUES ('41', '北信科优秀实验室评比', '5');

-- ----------------------------
-- Table structure for comp_info
-- ----------------------------
DROP TABLE IF EXISTS `comp_info`;
CREATE TABLE `comp_info` (
  `info_id` bigint(20) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '比赛信息id',
  `teacher_id` bigint(20) NOT NULL COMMENT '教师id',
  `comp_id` bigint(20) NOT NULL COMMENT '比赛id',
  `comp_photo` varchar(64) DEFAULT NULL COMMENT '比赛照片',
  `comp_cert` varchar(64) DEFAULT NULL COMMENT '比赛证书',
  `guide_cert` varchar(64) DEFAULT NULL COMMENT '指导证书',
  `checked` int(11) NOT NULL DEFAULT '0' COMMENT '是否提交,1提交,0仅保存.',
  `create_time` datetime NOT NULL COMMENT '比赛信息创建时间.',
  `update_time` datetime DEFAULT NULL COMMENT '比赛信息修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comp_info
-- ----------------------------
INSERT INTO `comp_info` VALUES ('00000000000000000055', '33', '37', '微信图片_20191225093819.jpg', 'mmexport1502854120156.jpg', '微信图片_20191225093756.jpg', '1', '2019-12-30 19:54:20', null);
INSERT INTO `comp_info` VALUES ('00000000000000000058', '35', '39', '微信图片_20191225093819.jpg', 'beauty_20190801223611.jpg', '-642d0b3e682f1b19.jpg', '1', '2019-12-30 20:49:56', null);
INSERT INTO `comp_info` VALUES ('00000000000000000059', '35', '37', 'mmexport1514646798605.jpg', '3afbb8212e35603f.jpg', 'IMG_20181020_213236.jpg', '1', '2019-12-30 20:53:36', null);
INSERT INTO `comp_info` VALUES ('00000000000000000060', '35', '38', '-bfe9728ea356cd8.jpg', '70f3dde866bea2e5.jpg', '-bfe9728ea356cd8.jpg', '1', '2019-12-31 13:47:36', null);

-- ----------------------------
-- Table structure for comp_info_stu
-- ----------------------------
DROP TABLE IF EXISTS `comp_info_stu`;
CREATE TABLE `comp_info_stu` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '学生和比赛的映射id',
  `stu_id` bigint(20) NOT NULL COMMENT '学生id',
  `info_id` bigint(20) NOT NULL COMMENT '比赛信息id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comp_info_stu
-- ----------------------------
INSERT INTO `comp_info_stu` VALUES ('2', '2', '5');
INSERT INTO `comp_info_stu` VALUES ('6', '1365', '5');
INSERT INTO `comp_info_stu` VALUES ('7', '1366', '5');
INSERT INTO `comp_info_stu` VALUES ('9', '1368', '5');
INSERT INTO `comp_info_stu` VALUES ('10', '1369', '6');
INSERT INTO `comp_info_stu` VALUES ('11', '1370', '6');
INSERT INTO `comp_info_stu` VALUES ('12', '1371', '11');
INSERT INTO `comp_info_stu` VALUES ('13', '1372', '10');
INSERT INTO `comp_info_stu` VALUES ('15', '1374', '12');
INSERT INTO `comp_info_stu` VALUES ('16', '1375', '20');
INSERT INTO `comp_info_stu` VALUES ('18', '1377', '19');
INSERT INTO `comp_info_stu` VALUES ('19', '1378', '20');
INSERT INTO `comp_info_stu` VALUES ('20', '1379', '7');
INSERT INTO `comp_info_stu` VALUES ('21', '1380', '23');
INSERT INTO `comp_info_stu` VALUES ('22', '1381', '23');
INSERT INTO `comp_info_stu` VALUES ('23', '1382', '43');
INSERT INTO `comp_info_stu` VALUES ('24', '1383', '55');
INSERT INTO `comp_info_stu` VALUES ('25', '1384', '55');
INSERT INTO `comp_info_stu` VALUES ('26', '1385', '55');
INSERT INTO `comp_info_stu` VALUES ('27', '1386', '59');
INSERT INTO `comp_info_stu` VALUES ('28', '1387', '60');
INSERT INTO `comp_info_stu` VALUES ('29', '1388', '60');

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `stu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `stu_name` varchar(64) DEFAULT NULL COMMENT '学生姓名',
  `stu_age` int(20) DEFAULT NULL COMMENT '学生年龄',
  `stu_class` varchar(64) DEFAULT NULL COMMENT '学生班级',
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1389 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('1383', '阿萨德放假了', '13', '123123');
INSERT INTO `stu` VALUES ('1384', '夏明', '123', '123123');
INSERT INTO `stu` VALUES ('1385', '王红艳', '123', '1905');
INSERT INTO `stu` VALUES ('1386', '123123', '13', '123123');
INSERT INTO `stu` VALUES ('1387', '123123', '13', '1905');
INSERT INTO `stu` VALUES ('1388', '阿萨德放假了', '13', '123123');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '教师id',
  `teacher_name` varchar(64) NOT NULL COMMENT '教师姓名',
  `password` varchar(64) NOT NULL COMMENT '教师密码',
  `checked` int(11) NOT NULL DEFAULT '0' COMMENT '是否经管理员确认 0否,1是',
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('28', '奥特曼', '77777777777777777777', '0');
INSERT INTO `teacher` VALUES ('32', '555', '7777777777777777', '1');
INSERT INTO `teacher` VALUES ('33', '张三', '55555555555', '1');
INSERT INTO `teacher` VALUES ('35', 'admin', '123456', '1');
