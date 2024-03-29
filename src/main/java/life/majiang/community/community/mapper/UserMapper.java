package life.majiang.community.community.mapper;


import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,portrait,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{portrait},#{gmtCreate},#{gmtModified})")
    void  insert(User user);
    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
