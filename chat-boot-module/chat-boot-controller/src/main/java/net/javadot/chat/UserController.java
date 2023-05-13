package net.javadot.chat;

import cn.hutool.core.bean.BeanUtil;
import net.javadot.chat.request.UserRequest;
import net.javadot.chat.response.UserResponse;
import net.javadot.chat.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author houlei
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2023年05月13日 16:09:00
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping
    public UserResponse detail(UserRequest userRequest){
        UserResponse userResponse = new UserResponse();
        User user = userService.getById(userRequest.getId());
        BeanUtil.copyProperties(user, userResponse);
        return userResponse;
    }
}
