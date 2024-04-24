package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.GasStation;
import com.traffic.mapper.PointMapper;
import com.traffic.service.PointService;
import org.springframework.stereotype.Service;

@Service
public class PointServiceImpl extends ServiceImpl<PointMapper, GasStation> implements PointService {
}
