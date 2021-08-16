package com.pentac.tmall_springboot.service.impl;

import com.pentac.tmall_springboot.entity.Orderitem;
import com.pentac.tmall_springboot.mapper.OrderitemMapper;
import com.pentac.tmall_springboot.service.ORDERITEMervice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pentaC
 * @since 2021-08-16
 */
@Service
public class OrderitemServiceImpl extends ServiceImpl<OrderitemMapper, Orderitem> implements ORDERITEMervice {

}
