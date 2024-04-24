package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.Route;
import com.traffic.mapper.RouteMapper;
import com.traffic.service.RouteService;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl extends ServiceImpl<RouteMapper, Route> implements RouteService {
}
