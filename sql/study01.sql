/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : study01

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-03-31 01:22:43
*/
-- Mysql中如果表和表之间建立的外键约束，则无法删除表及修改表结构。
-- 解决方法是在Mysql中取消外键约束:  SET FOREIGN_KEY_CHECKS=0;
SET FOREIGN_KEY_CHECKS=0;
create database study01;
use study01;
-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', 'study01');
INSERT INTO `dept` VALUES ('2', 'womende', 'study01');
INSERT INTO `dept` VALUES ('4', '销售部', 'study01');
INSERT INTO `dept` VALUES ('5', '网络部', 'study01');
