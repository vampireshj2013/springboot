package com.domain.user.mapper;

import com.domain.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author vincent
 * @since 2018-11-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
