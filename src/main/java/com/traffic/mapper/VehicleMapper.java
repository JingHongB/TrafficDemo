package com.traffic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.traffic.entity.Vehicle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VehicleMapper extends BaseMapper<Vehicle> {
}
