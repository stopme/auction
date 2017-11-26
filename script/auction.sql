
DROP TABLE IF EXISTS `auction_user`;
CREATE TABLE `auction_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(255) NOT NULL DEFAULT '' COMMENT '微信openId',
  `nickname` varchar(255) NOT NULL DEFAULT '' COMMENT '昵称',
  `province` varchar(16) NOT NULL DEFAULT '' COMMENT '昵称' ,
  `status` INT(4) NOT NULL DEFAULT 0 COMMENT '0 表示可用 1表示禁止所有操作',
  `country` varchar(16) NOT NULL DEFAULT '' COMMENT '国家',
  `city` varchar(16) NOT NULL DEFAULT '' COMMENT '城市',
  `sex` varchar(8)  NOT NULL DEFAULT '' COMMENT '性别',
  `remark` INT (4) NOT NULL DEFAULT 0  COMMENT '标记是否是auto用户,0 表示自然用户 1表示僵尸用户,2表示系统用户',
  `total_amount` INT (11) NOT NULL DEFAULT 0 COMMENT '押金',
  `create_time` bigint(20)  NOT NULL DEFAULT 0,
  `update_time` bigint(20)  NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12345136 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `auction_sys_user`;
CREATE TABLE `auction_sys_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `nickname` varchar(255) NOT NULL DEFAULT '' COMMENT '昵称',
  `admin_level` INT (8) NOT NULL DEFAULT 0 COMMENT '0表示可以 1分钱下单 10 ',
  `create_time` bigint(20)  NOT NULL DEFAULT 0,
  `update_time` bigint(20)  NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user`(`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `auction_time_line`;
CREATE TABLE `auction_time_line` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `user_nickname` varchar(255) NOT NULL DEFAULT '' COMMENT '昵称',
  `line_content` varchar(255) NOT NULL DEFAULT '' COMMENT '昵称' ,
  `create_time` bigint(20)  NOT NULL DEFAULT 0,
  `update_time` bigint(20)  NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20321133 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `auction_time_line_pic`;
CREATE TABLE `auction_time_line_pic` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `line_id` INT(11) NOT NULL DEFAULT 0 COMMENT '动态ID',
  `pic_path` varchar(255) NOT NULL DEFAULT '' COMMENT '昵称',
  `create_time` bigint(20)  NOT NULL DEFAULT 0,
  `update_time` bigint(20)  NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `config_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'config ID',
  `config_key` varchar(32)  NOT NULL COMMENT '配置内容的key',
  `config_value` varchar(32)  NOT NULL,
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`config_id`),
  UNIQUE KEY `uk_config_key`(`config_key`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `banner_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'banner',
  `banner_name` varchar(32)  NOT NULL DEFAULT '' COMMENT '首页轮换图片name',
  `banner_url` varchar(128)  NOT NULL DEFAULT '' COMMENT '',
  `banner_desc` varchar(128)  NOT NULL DEFAULT ''COMMENT '',
  `banner_page` tinyint(4)  NOT NULL DEFAULT 1 COMMENT '1 表示首页，2表示竞拍页面，3 表示秒杀页面',
  `banner_order` int(8)  NOT NULL DEFAULT 1 COMMENT '顺序',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

insert into banner(banner_name,banner_url,banner_page)value('美女','http://localhost:8080/images/zhuangguan_dapubu.jpg',1);
insert into banner(banner_name,banner_url,banner_page)value('春光无限好','http://localhost:8080/images/zhuangguan_dapubu-001.jpg',1);
insert into banner(banner_name,banner_url,banner_page)value('大好河山','http://localhost:8080/images/zhuangguan_dapubu-002.jpg',1);

DROP TABLE IF EXISTS `header_tag`;
CREATE TABLE `header_tag` (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页tag id',
  `tag_name` varchar(32)  NOT NULL DEFAULT '' COMMENT '首页轮换图片name',
  `tag_type` varchar(32)  NOT NULL DEFAULT '' COMMENT 'dongtai:仿朋友圈动态,zhishi:文章列表',
  `tag_sort` int(8)  NOT NULL DEFAULT 0  COMMENT 'tab 排序',
  `tag_used` tinyint(4)  NOT NULL DEFAULT 1  COMMENT '是否使用 1 使用，0未使用',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

insert into header_tag(tag_name,tag_type,tag_sort)value('动态','dongtai',1);
insert into header_tag(tag_name,tag_type,tag_sort)value('聊翡翠','zhishi',2);

DROP TABLE IF EXISTS `marketing`;
CREATE TABLE `marketing` (
  `market_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页tag id',
  `market_name` varchar(32)  NOT NULL DEFAULT '' COMMENT '[竞拍]2017年3月11日3点构成',
  `market_type` varchar(16)  NOT NULL DEFAULT '' COMMENT 'jingpai:竞拍商品,miaosha:秒杀商品',
  `start_time` bigint(20) NOT NULL DEFAULT 0 COMMENT '活动正点开始时间',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`market_id`),
  UNIQUE KEY `index_start`(`start_time`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

--所有价格都以分单位
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `good_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页tag id',
  `good_name` varchar(128)  NOT NULL DEFAULT '' COMMENT '',
  `good_code` varchar(32)  NOT NULL DEFAULT '' COMMENT '商品编码',
  `good_tag` varchar(128)  NOT NULL DEFAULT '' COMMENT '商品标签',
  `miaosha_price` int(11) NOT NULL DEFAULT 999999900 COMMENT '秒杀价格 单位:分',
  `good_detail` varchar(256)  NOT NULL DEFAULT '' COMMENT '商品详情描述',
  `good_sort` int(8)  NOT NULL DEFAULT 0  COMMENT 'tab 排序',
  `sale_price` int(11)  NOT NULL DEFAULT 50000 COMMENT '建议售价 单位:分',
  `good_used` tinyint(4)  NOT NULL DEFAULT 0  COMMENT '是否参加过活动 0表示为参加 1表示参加过',
  `good_status` tinyint(4)  NOT NULL DEFAULT 0 COMMENT '竞拍结果 0初始，1标识竞拍成功，2 表示未到达预期值流拍',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`good_id`),
  UNIQUE KEY `uk_good_code`(`good_code`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `marketing_good`;
CREATE TABLE `marketing_good` (
  `mg_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页tag id',
  `market_id` int(11) NOT NULL DEFAULT 0 COMMENT '营销活动ID',
  `good_id` int(11) NOT NULL DEFAULT 0 COMMENT '商品ID',
  `market_name` varchar(32)  NOT NULL DEFAULT '' COMMENT '活动名字冗余方便观察数据',
  `good_code` varchar(32)  NOT NULL DEFAULT '' COMMENT '商品名字冗余方便观察数据',
  `start_jinbgpai_price` int(11) NOT NULL DEFAULT 0 COMMENT '起拍价格 单位分',
  `per_jinbgpai_price` int(11) NOT NULL DEFAULT 50000 COMMENT '每次加价最少和商品售价一样 单位分',
  `miaosha_price` int(11) NOT NULL DEFAULT 10000 COMMENT '秒杀价格 单位分',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`mg_id`),
  UNIQUE KEY `uk_marketing_good`(`market_id`,`good_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `good_image`;
CREATE TABLE `good_image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页tag id',
  `image_url` varchar(128)  NOT NULL DEFAULT '' COMMENT '商品url',
  `image_deleted` tinyint(4)  NOT NULL DEFAULT 0 COMMENT '1表示不会删除,0表示会删除',
  `good_id` int(11)  NOT NULL DEFAULT 0  COMMENT '商品图片ID',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`image_id`),
  KEY `index_good`(`good_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `auction_file`;
CREATE TABLE `auction_file` (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '首页tag id',
  `file_path` varchar(128) NOT NULL  DEFAULT '' COMMENT '首页tag id',
  `image_stay` tinyint(4)  NOT NULL DEFAULT 0 COMMENT '1表示不会删除,0表示会删除',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `good_record`;
CREATE TABLE `good_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录 id',
  `good_id` int(11) NOT NULL DEFAULT 0 COMMENT '商品 id',
  `watch_time` int(8)  NOT NULL DEFAULT 1 COMMENT '围观次数',
  `jingpai_time` int(8)  NOT NULL DEFAULT 0 COMMENT '竞拍次数',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`record_id`),
  UNIQUE KEY `un_good_id`(good_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `jingpai_record`;
CREATE TABLE `jingpai_record` (
  `jingpai_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '竞拍ID',
  `market_id` int(11)  NOT NULL DEFAULT 0 COMMENT '竞拍活动',
  `user_id` int(11)  NOT NULL DEFAULT 1 COMMENT '用户ID',
  `good_id` int(11)  NOT NULL DEFAULT 1 COMMENT '围观次数',
  `user_name` int(11)  NOT NULL DEFAULT 1 COMMENT '用户昵称',
  `jingpai_price` int(11)  NOT NULL DEFAULT 0 COMMENT '竞拍金额 单位分',
  `jingpai_status` tinyint(4)  NOT NULL DEFAULT 0 COMMENT '1,表示竞拍成功,0表示无效',
  `jingpai_time` bigint(20) NOT NULL DEFAULT 0 COMMENT '竞拍的时间是指活动开始的时间',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`jingpai_id`),
  UNIQUE KEY `uk_good_price`(`good_id`,`jingpai_price`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `jingpai_succ`;
CREATE TABLE `jingpai_succ` (
  `jingpai_id` int(11) NOT NULL COMMENT '竞拍ID',
  `market_id` int(11)  NOT NULL DEFAULT 0 COMMENT '竞拍活动',
  `user_id` int(11)  NOT NULL DEFAULT 1 COMMENT '用户ID',
  `good_id` int(11)  NOT NULL DEFAULT 1 COMMENT '围观次数',
  `user_name` int(11)  NOT NULL DEFAULT 1 COMMENT '用户昵称',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`jingpai_id`),
  UNIQUE KEY `uk_user_good`(`user_id`,`good_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `jingpai_fail`;
CREATE TABLE `jingpai_fail` (
  `jingpai_id` int(11) NOT NULL COMMENT '竞拍ID',
  `market_id` int(11)  NOT NULL DEFAULT 0 COMMENT '活动',
  `user_id` int(11)  NOT NULL DEFAULT 1 COMMENT '用户ID',
  `good_id` int(11)  NOT NULL DEFAULT 1 COMMENT '围观次数',
  `user_name` int(11)  NOT NULL DEFAULT 1 COMMENT '用户昵称',
  `create_time` bigint(20) NOT NULL DEFAULT 0,
  `update_time`  bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`jingpai_id`),
  UNIQUE KEY `uk_user_good`(`user_id`,`good_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;