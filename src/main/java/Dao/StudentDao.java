package Dao;

import model.Student;

import java.util.List;

/**
 * ClassName:UserDAO
 * Package:Dao
 * Description:
 *
 * @Date:2020/7/29 8:10
 * @Author:DangWei
 */
public interface StudentDao {

    List<Student> selectStudent();

    void insert(Student student);

    void update(Student student);

    void delete(int[] arr);

    List<Student> selectStudentTeacher();

}
