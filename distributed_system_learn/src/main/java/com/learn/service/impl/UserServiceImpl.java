package com.learn.service.impl;

import com.learn.entity.UserEntity;
import com.learn.dao.UserDao;
import com.learn.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dhy
 * @since 2020-10-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

}
