package com.jiyongjun.tao.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/7/2 17:40
 */
@Setter
@Getter
@ToString
public class User {
    private String username;
    private String password;
    private String gender;
}
