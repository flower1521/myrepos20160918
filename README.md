# shardingsphere-jdbc
1、创建数据库ds0，ds1

2、分别在两个库创建表
create table t_order_0
(
  id       int auto_increment primary key,
  user_id  int null,
  order_id int null
);

create table t_order_1
(
  id       int auto_increment primary key,
  user_id  int null,
  order_id int null
);
