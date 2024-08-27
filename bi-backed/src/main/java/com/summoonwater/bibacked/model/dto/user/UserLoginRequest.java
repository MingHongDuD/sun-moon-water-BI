package com.summoonwater.bibacked.model.dto.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登陆请求
 *
 * @author sunmoonwater
 */
@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 5513583276319285595L;

    private String userAccount;

    private String userPassword;
}
