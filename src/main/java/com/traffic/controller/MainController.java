package com.traffic.controller;

import com.traffic.service.GoodsService;
import com.traffic.service.RouteService;
import com.traffic.service.VehicleLocationService;
import com.traffic.service.WineryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Resource
    WineryService wineryService;
    @Resource
    RouteService routeService;
    @Resource
    GoodsService goodsService;
    @Resource
    VehicleLocationService vehicleLocationService;

    @GetMapping("/")
    public String index(Model model) {
        vehicleLocationService.InsertVehicleLocation();
        model.addAttribute("VehicleList",vehicleLocationService.list());
        model.addAttribute("WineryList", wineryService.list());

        return "index";
    }
}
