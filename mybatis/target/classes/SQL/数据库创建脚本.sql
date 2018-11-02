-- 删除数据库
drop database if exists mybatistestdb ;

--创建数据库
create database mybatistestdb character set UTF-8 ;

-- 使用数据库
use mybatistestdb ;

--创建数据库表
create table member(
    mid varchar (50),
    name varchar (50),
    age int ,
    birthday data ,
    salary double ,
    constraint pk_mid primary KEY(mid)

);