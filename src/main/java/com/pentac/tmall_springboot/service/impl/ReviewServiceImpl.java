package com.pentac.tmall_springboot.service.impl;

import com.pentac.tmall_springboot.entity.Review;
import com.pentac.tmall_springboot.mapper.ReviewMapper;
import com.pentac.tmall_springboot.service.REVIEWervice;
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
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review> implements REVIEWervice {

}
