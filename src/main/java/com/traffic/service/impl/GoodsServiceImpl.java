package com.traffic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traffic.entity.Goods;
import com.traffic.mapper.GoodsMapper;
import com.traffic.service.GoodsService;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
