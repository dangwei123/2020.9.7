package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName:User
 * Package:model
 * Description:
 *
 * @Date:2020/7/29 8:09
 * @Author:DangWei
 */
@Getter
@Setter
@ToString
public class Student {

   private Integer id;

   private String name;

   private String sex;

   private Integer classId;

   private Classes classes;
}
