package com.pentac.tmall_springboot.mapper;

import com.pentac.tmall_springboot.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pentaC
 * @since 2021-08-16
 */
// 继承BaseMapper<Category>泛型类 表示这个是针对Category类的Mapper

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
