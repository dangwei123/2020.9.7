import Dao.StudentDao;
import model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:TestMybatis
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2020/7/29 8:13
 * @Author:DangWei
 */
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session=factory.openSession();

        StudentDao studentDao=session.getMapper(StudentDao.class);

        List<Student> students=studentDao.selectStudentTeacher();
        for(Student student:students){
            System.out.println(student);
        }

        /*List<Student> students=studentDao.selectStudent();
        for(Student student:students){
            System.out.println(student);
        }

        System.out.println("==========================我是分割线==========================");

        ClassesDao classesDao=session.getMapper(ClassesDao.class);
        List<Classes> classesList=classesDao.selectClasses();
        for(Classes item:classesList){
            System.out.println(item);
        }*/
        /*Student student=new Student();
        student.setId(1);
        student.setName("草上飞");
        student.setSex("男");

        //studentDao.update(student);

        List<Integer> list=new ArrayList<Integer>();
        list.add(9);
        list.add(11);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("ids",list);

        UserDao userDao=session.getMapper(UserDao.class);
        userDao.deleteByMap(map);*/


        //session.commit();

    }
}
