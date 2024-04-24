package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.VehicleLocation;
import com.traffic.mapper.VehicleLocationMapper;
import com.traffic.service.VehicleLocationService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class VehicleLocationServiceImpl extends ServiceImpl<VehicleLocationMapper, VehicleLocation>
        implements VehicleLocationService {
    @Resource
    VehicleLocationMapper mapper;

    @Override
    public void InsertVehicleLocation() {
        mapper.deleteVehicleLocation();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mapper.insertVehicleLocation(104.03+0.1*random.nextDouble(0,1),30.60+0.16*random.nextDouble(0,1));
        }
    }
}
