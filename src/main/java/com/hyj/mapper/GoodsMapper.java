package com.hyj.mapper;

import com.hyj.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    List<Goods> selectAlls();
    int deleteByIds(int id);
}
