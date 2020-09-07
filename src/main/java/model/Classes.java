package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * ClassName:Class
 * Package:model
 * Description:
 *
 * @Date:2020/7/30 9:06
 * @Author:DangWei
 */
@Getter
@Setter
@ToString
public class Classes {

    private Integer id;

    private String name;

    private Timestamp greadeYear;

    //private List<Student> students;

}
