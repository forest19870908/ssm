CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET latin1 NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(100) CHARACTER SET latin1 NOT NULL DEFAULT '' COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';
insert  into `t_user`(`id`,`user_name`,`password`) values (1,'forest','123456');
ALTER TABLE `t_user`
ADD COLUMN `number`  int(10) NOT NULL DEFAULT 0 COMMENT '数量' AFTER `password`;