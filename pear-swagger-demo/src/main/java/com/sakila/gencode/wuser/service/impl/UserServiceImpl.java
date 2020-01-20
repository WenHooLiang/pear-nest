package com.sakila.gencode.wuser.service.impl;

import com.sakila.gencode.wuser.entity.User;
import com.sakila.gencode.wuser.mapper.UserMapper;
import com.sakila.gencode.wuser.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sakila
 * @since 2020-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
