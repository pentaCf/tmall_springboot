package com.pentac.tmall_springboot.service.impl;

import com.pentac.tmall_springboot.entity.Category;
import com.pentac.tmall_springboot.mapper.CategoryMapper;
import com.pentac.tmall_springboot.service.CATEGORYervice;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CATEGORYervice {

}
