package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.WineShop;
import com.traffic.mapper.WineShopMapper;
import com.traffic.service.WineShopService;
import org.springframework.stereotype.Service;

@Service
public class WineShopServiceImpl extends ServiceImpl<WineShopMapper, WineShop>
        implements WineShopService {
}
