package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hoshea
 * @email jianghc1996@163.com
 * @date 2020-04-12 22:52:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
