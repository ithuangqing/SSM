import com.ithuangqing.mybatis.dao.StudentDao;
import com.ithuangqing.mybatis.util.MyBatisSessionFactory;
import com.ithuangqing.mybatis.vo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoTest {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();


        /**
         * 根据id查找
         */

        //Student student = sqlSession.selectOne("com.ithuangqing.mybatis.dao.StudentDao.queryById", 1);

        /**
         * 动态代理开发
         */
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student student = mapper.queryById(3);
        System.out.println(student);

        /**
         * 增加一个数据
         */
//        Student student1 = new Student();
//        student1.setStudentname("李四");
//        student1.setStudentid(100);
//        student1.setStudentclass("哪个班");
//
//        sqlSession.insert("com.ithuangqing.mybatis.vo.Student.insert",student1);

        /**
         * 删除一个数据
         */
//        sqlSession.delete("delete",666);


        /**
         * 更新数据，根据id
         */
//        Student student = new Student();
//        student.setStudentname("张三");
//        student.setStudentid(1);
//        student.setStudentclass("班级");
//        sqlSession.update("updatebyid1",student);


        /**
         * 查询所有
         */
//        List<Student> students = sqlSession.selectList("selectall");
//        for (Student student: students){
//            System.out.println(student);
//        }

        /**
         * 根据姓名查找
         */

//        Student student = new Student();
        //student.setStudentname("庆哥小白");
        //student.setStudentid(100);


//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//
//        List<Student> students = sqlSession.selectList("findAllByName3",set.toArray());
//        for (Student student1:students){
//            System.out.println(student1);
//        }



        sqlSession.commit();
        sqlSession.close();




    }
}
