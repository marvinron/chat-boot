package net.javadot.chat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.javadot.chat.User;
import net.javadot.chat.mapper.UserMapper;
import net.javadot.chat.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author houlei
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description TODO
 * @createTime 2023年05月13日 16:00:00
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
