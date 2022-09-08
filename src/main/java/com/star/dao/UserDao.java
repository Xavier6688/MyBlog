package com.star.dao;

import com.star.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description: 用户持久层接口
 * @Date: Created in 0:06 2021/5/27
 * @Author: XAVIER
 * @QQ群: 暂无
 * @URL: https://onestar.newstar.net.cn/
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * @Description:
     * @Auther: XAVIER
     * @Date: 10:24 2021/5/27
     * @Param: username:用户名；password:密码
     * @Return: 返回用户对象
     */
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}