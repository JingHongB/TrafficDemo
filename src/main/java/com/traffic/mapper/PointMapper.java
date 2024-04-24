package com.traffic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.traffic.entity.GasStation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PointMapper extends BaseMapper<GasStation> {
}
