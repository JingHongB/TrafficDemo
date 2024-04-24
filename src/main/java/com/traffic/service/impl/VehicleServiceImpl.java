package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.Vehicle;
import com.traffic.mapper.VehicleMapper;
import com.traffic.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements VehicleService {
}
