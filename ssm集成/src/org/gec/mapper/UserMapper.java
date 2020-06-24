package org.gec.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.gec.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public User userLogin(@Param("username")String username ,@Param("password")String password);
//    @Select("select * from users where username=#{username} and password=#{password}")
//    User userLogin(@Param("username") String username, @Param("password")String password);
}