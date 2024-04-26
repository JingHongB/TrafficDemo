package com.traffic;

import com.traffic.service.GoodsService;
import com.traffic.service.RouteService;
import com.traffic.service.VehicleLocationService;
import com.traffic.service.WineryService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrafficDemoApplicationTests {
    @Resource
    WineryService wineryService;
    @Resource
    RouteService routeService;
    @Resource
    GoodsService goodsService;
    @Resource
    VehicleLocationService vehicleLocationService;

    @Test
    void contextLoads() {
        System.out.println(wineryService.list());
    }

}
