package com.traffic.controller;

import com.traffic.entity.Route;
import com.traffic.service.PointService;
import com.traffic.service.RouteService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Resource
    PointService pointService;

    @Resource
    RouteService routeService;

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("GasStationList", pointService.list());
        model.addAttribute("RouteList", routeService.list());

        return "test3";
    }

    @RequestMapping( "/data")
    @ResponseBody
    public List<Route> data(){
        System.out.println(routeService.list());
        return routeService.list();
    }
}
