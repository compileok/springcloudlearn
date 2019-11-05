package com.github.app.product.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user",fallback = UserServiceFallback.class)
@Component
public interface UserService {

    @GetMapping(value = "user/info/1")
    String userInfo();

}
