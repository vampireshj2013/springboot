package com.domain.user.service.impl;

import com.domain.user.entity.User;
import com.domain.user.mapper.UserMapper;
import com.domain.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vincent
 * @since 2018-11-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
