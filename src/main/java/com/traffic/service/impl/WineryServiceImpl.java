package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.Winery;
import com.traffic.mapper.WineryMapper;
import com.traffic.service.WineryService;
import org.springframework.stereotype.Service;

@Service
public class WineryServiceImpl extends ServiceImpl<WineryMapper, Winery> implements WineryService {
}
