package com.hyj.service;

import com.hyj.mapper.GoodsMapper;
import com.hyj.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    public List<Goods> selectAlls(){
        return goodsMapper.selectAlls();
    }
    public int deleteByIds(int id){
        return goodsMapper.deleteByIds(id);
    }
}
