package net.javadot.chat;

import lombok.Data;

/**
 * @author houlei
 * @version 1.0.0
 * @ClassName net.javadot.chat.User.java
 * @Description TODO
 * @createTime 2023年05月13日 15:15:00
 */
@Data
public class User {
    private Long id;

    private String username;

    private String idCard;
}
