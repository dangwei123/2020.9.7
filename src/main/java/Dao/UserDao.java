package Dao;

import model.User;

import java.util.List;
import java.util.Map;

/**
 * ClassName:UserDao
 * Package:Dao
 * Description:
 *
 * @Date:2020/7/30 21:21
 * @Author:DangWei
 */
public interface UserDao {

    List<User> select(User user);

    void insert(User user);

    void update(User user);

    void deleteByArray(int[] arr);

    void deleteByList(List<Integer> list);

    void deleteByMap(Map<String,Object> map);
}
