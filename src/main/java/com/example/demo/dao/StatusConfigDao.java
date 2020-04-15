package com.example.demo.dao;


import com.example.demo.model.BaseConfig;
import com.example.demo.model.StatusConfig;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StatusConfigDao {
    String TABLE_NAME = " status_config_tbl ";
    String INSERT_FIELDS = " privacy_status, pir_status, alarm_sound_mode, battry_status, disk_num, cloud_status, user_id ";
    String SELECT_FIELDS = " id," + INSERT_FIELDS;

    @Select({"select * from ", TABLE_NAME, " where user_id = #{userId}"})
    StatusConfig getStatusConfig(int userId);

    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FIELDS, ") values (#{privacyStatus}, #{pirStatus}, #{alarmSoundMode}, #{battryStatus}, #{diskNum}, #{cloudStatus}, #{userId})"})
    int insertStatusConfig(StatusConfig statusConfig);

    @Update({"update ", TABLE_NAME, " set privacy_status=#{privacyStatus}, pir_status=#{pirStatus}, alarm_sound_mode=#{alarmSoundMode}, battry_status=#{battryStatus}, disk_num=#{diskNum}, cloud_status=#{cloudStatus} where user_id=#{userId}"})
    int updateStatusConfigByUserId(StatusConfig statusConfig);
}
