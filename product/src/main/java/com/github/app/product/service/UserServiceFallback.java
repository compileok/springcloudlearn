package com.github.app.product.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService {

    @Override
    public String userInfo() {
        return " 服务调用失败：返回预设值。";
    }
}
