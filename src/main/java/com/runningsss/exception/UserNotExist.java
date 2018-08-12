package com.runningsss.exception;

/**
 * @author liqings
 * @date 2018-08-12
 */
public class UserNotExist extends RuntimeException {

    public UserNotExist(){
        super("用户不存在！");
    }
}
