package com.example.woc.mapper;

import com.example.woc.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 01:22
 **/
@Mapper
@Repository
public interface UserMapper {
    //示例

    List<Account> queryUserList();//查询用户
    //Account queryUserById(Integer id);//用id查
    //int addUser (Integer id, String username, String password, String email);//增
    //int updateUser(Account account);//改
    int deleteUser (Integer id);//删
    int queryUserByUsername(String username);
    String queryUserByUname(String username);//注册时防止重名,查看用户是否存在
    Integer findId(Integer id);
    String pword (String username);//查看用户名对应的密码是否正确
//    Account userlogin(@Param("username") String username, @Param("password") String password);
    int addUser(@Param("id") Integer id,@Param("username") String username, @Param("password") String password,@Param("email") String email);
}
