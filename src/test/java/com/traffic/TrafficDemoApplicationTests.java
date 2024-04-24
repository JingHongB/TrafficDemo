package com.traffic;

import com.traffic.entity.Route;
import com.traffic.service.GoodsService;
import com.traffic.service.PointService;
import com.traffic.service.RouteService;
import com.traffic.service.VehicleLocationService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrafficDemoApplicationTests {
    @Resource
    PointService pointService;
    @Resource
    RouteService routeService;
    @Resource
    GoodsService goodsService;
    @Resource
    VehicleLocationService vehicleLocationService;

    @Test
    void contextLoads() {
        for (Route route:
             routeService.list()) {
            System.out.println(route.getStartLatitude());
        }
    }

}
