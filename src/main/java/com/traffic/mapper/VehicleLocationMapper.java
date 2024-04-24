package com.traffic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.traffic.entity.VehicleLocation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface VehicleLocationMapper extends BaseMapper<VehicleLocation> {
    @Insert("INSERT INTO vehiclelocation (longitude, latitude) VALUES (#{longitude}, #{latitude})")
    void insertVehicleLocation(@Param("longitude") double longitude, @Param("latitude") double latitude);


    @Update("truncate table vehiclelocation")
    void deleteVehicleLocation();
}
