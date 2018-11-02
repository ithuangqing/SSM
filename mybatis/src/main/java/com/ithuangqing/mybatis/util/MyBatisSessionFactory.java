package com.ithuangqing.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 这个类主要负责SqlSessionFctory和SqlSession接口对象的获取
 * 而且可以负责重新连接和关闭的处理操作
 */
public class MyBatisSessionFactory {
    // 主要的功能定义公共资源文件的名称，方便Resources类的读取操作

    private static final String CONFIG_FILE = "mybatis-config.xml";

    // 定义ThreadLocal类的对象，可以保存的屙屎SqlSession接口对象，主要被不同的层做引用操作。

    private static  ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    //定义SqlSessionFactory接口对象，用于通过它操作二级缓存以及重新获取SqlSession的配置

    private static  SqlSessionFactory factory = null;

    //主要是读取mybatis-config.xml文件

    private static InputStream input = null;
    static {
        rebuildSessionFactory();   //在类加载的时候创建SqlSessionFactory对象
    }

    /**
     * 取得当前链接的SqlSession对象，如果当前没有SqlSession，则需要通过SqlSessionFactory创建新的Session对象
     * 如果当前已经存在有SqlSession对象，则通过ThreadLocal取得返回
     *
     * @return 返回SqlSession对象
     */
    public static SqlSession getSqlSession(){
        //通过threadlocal取得

        SqlSession session = threadLocal.get();

        //如果没有保存对象

        if (session == null){
            // 如果没有工厂接口
            if (factory == null){
                //创建SqlSessionFactory
                rebuildSessionFactory();
            }
            //创建新的session对象
            session = factory.openSession();
            threadLocal.set(session);
        }

        return session;
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return factory;
    }
    //重新建立新的SqlSessionFactory接口对象

    public static void rebuildSessionFactory(){
        try {
            input = Resources.getResourceAsStream(CONFIG_FILE);
            factory = new SqlSessionFactoryBuilder().build(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //关闭当前的Session

    public static void close(){

        SqlSession session = threadLocal.get();
        threadLocal.set(null);
        if (session != null){
            session.close();
            if (input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
