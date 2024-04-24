package com.traffic.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.traffic.entity.VehicleLocation;

public interface VehicleLocationService extends IService<VehicleLocation> {
    void InsertVehicleLocation();
}
