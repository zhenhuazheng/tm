
CREATE TABLE `tm_product`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` varchar(20) NOT NULL COMMENT '产品编号',
  `name` varchar(50),
	`desc` VARCHAR(100),
	`status` int,
  PRIMARY KEY (`id`) USING BTREE
) ;