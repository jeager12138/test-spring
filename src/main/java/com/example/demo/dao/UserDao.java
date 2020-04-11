package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Mapper
public interface UserDao {

    String TABLE_NAME = " User ";

    @Select({"select * from ", TABLE_NAME, " where id = #{id_}"})
    User selectJudge(int id_);

    @Update({"update ", TABLE_NAME, " set age=#{age}, name=#{name} where id=#{id}"})
    int updateJudge(User user);


//    其他使用方法：
//    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FILEDS, ") values (#{projectId}, #{expertId}, #{expertName}, 0, #{suggestion}, 1, #{competitionId})"})
//    int insertJudge(Judge judge);
//
//    @Select({"select * from ", TABLE_NAME, " where expertId=#{expertId} and competitionId=#{competitionId}"})
//    List<Judge> getListByExpertId(@Param("expertId") int expertId, @Param("competitionId") int competitionId);
}
