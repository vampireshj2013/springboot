package hello.domain.user;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    @Results(id = "userResult",value = {@Result(property = "usernameA",column = "user_name",javaType = String.class)})
    List<User> queryAll();


    @Select("select * from users where id = #{id}")
    @ResultMap("userResult")
    User queryUserById(@Param("id") long id);
}
