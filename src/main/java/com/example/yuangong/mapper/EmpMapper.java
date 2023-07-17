package com.example.yuangong.mapper;

import com.example.yuangong.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 25686
 */
@Mapper
public interface EmpMapper {

    @Delete("delete from emp where id = #{id}")
    public int delete(Integer id);

//    @Insert("insert into tb_user(username, password, gender, addr)" +
//            "value ('李明','1234','男','湖南')")
//    public void inster();

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) "
            + "value (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void inster(Emp emp);

    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}, job = #{job}, " +
            "entrydate = #{entrydate}, dept_id = #{deptId},update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);

    @Select("select * from emp where id = #{id} or name = #{name}" )
    public List<Emp> getById(Integer id, String name);

    public List<Emp> list(Integer id, String name);

    public void update2(Emp emp);

    public void delete2(List<Integer> list);





}
