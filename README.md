# ssm

#### 项目介绍
小白的SSM框架整合（极简主义）---拿来即用！帮助小白的你快速入门SSM整合开发！修炼属于自己的独门秘籍！

#### 使用方法

你可以将项目克隆或者下载下来，然后修改包名。

如果你想测试一下，首先创建一个student数据库，然后创建表student，以下是建表语句

```
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentname` varchar(20) NOT NULL,
  `studentid` int(10) NOT NULL,
  `studentclass` varchar(20) NOT NULL,
  PRIMARY KEY (`studentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `student` VALUES ('庆哥小白', '101', '公众号');

```

然后修改jdbc.properties文件


```
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf8
jdbc.username=
jdbc.password=
```

写上你的数据库账户和密码，然后执行测试代码StudentDaoTest即可得到

![image](http://i68.tinypic.com/rwuqz9.png)

如果你想要一个全新的SSM框架，你可以这样做

1. 克隆或者下载本项目
2. 修改成自己的包名
3. 看图

![image](http://i65.tinypic.com/10huoo2.png)

删除这些文件，就是一个清爽原始的ssm整合后的项目了，你就可以进行自己的项目开发了！

#### 学习如何整合，请查阅

[知识预热](doc/知识预热.md)

[开始整合搭建](doc/开始整合搭建.md)

#### 关注微信公众号，学习更多java技能！更有5000G视频教程等你来拿！

![](http://i64.tinypic.com/25u15qc.jpg)

#### 一张有趣的图片

![](http://i67.tinypic.com/1euul3.png)

