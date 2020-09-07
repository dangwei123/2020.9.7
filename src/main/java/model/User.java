package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName:User
 * Package:model
 * Description:
 *
 * @Date:2020/7/30 21:20
 * @Author:DangWei
 */
@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
