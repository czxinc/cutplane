#日志表

CREATE TABLE `logger` (
  `ip` varchar(50) NOT NULL COMMENT 'ip地址',
  `operator` varchar(50) DEFAULT NULL COMMENT '操作人',
  `remark` varchar(50) DEFAULT NULL COMMENT '操作动作',
  `role` varchar(30) DEFAULT NULL COMMENT '角色',
  `createTime` timestamp NULL DEFAULT NULL COMMENT '操作时间',
  `description` varchar(30) DEFAULT NULL COMMENT '操作动作'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



#测试表（只能用于测试）

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentID` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;