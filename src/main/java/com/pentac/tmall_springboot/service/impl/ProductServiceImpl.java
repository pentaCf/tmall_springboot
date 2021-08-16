package com.pentac.tmall_springboot.service.impl;

import com.pentac.tmall_springboot.entity.Product;
import com.pentac.tmall_springboot.mapper.ProductMapper;
import com.pentac.tmall_springboot.service.PRODUCTervice;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements PRODUCTervice {

}
