package com.aaa.project.dao.impl;

import com.aaa.project.dao.BaseDao;
import com.aaa.project.dao.api.GoodsDao;
import com.aaa.project.entity.Goods;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:22 2022/08/22 23:07
 * @description: Exercise
 * @Version 1.0.0
 */
public class GoodsDaoImpl extends BaseDao<Goods> implements GoodsDao {
    @Override
    public List<Goods> selectAllGoods() {

        String sql="select goods_id goodId," +
                "goods_name goodName," +
                "goods_price goodPrice," +
                "goods_slogan goodSlogan from project_goods;";
        System.out.println(getBeanList(sql, Goods.class));
        return null;

    }
}
