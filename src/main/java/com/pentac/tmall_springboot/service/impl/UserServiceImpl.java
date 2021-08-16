package com.pentac.tmall_springboot.service.impl;

import com.pentac.tmall_springboot.entity.User;
import com.pentac.tmall_springboot.mapper.UserMapper;
import com.pentac.tmall_springboot.service.USERervice;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements USERervice {

}
