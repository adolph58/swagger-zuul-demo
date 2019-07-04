package com.example.pay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "支付系统接口", description = "支付系统模块相关接口")
public class PayServerController {
    @PostMapping("/paySomething")
    @ApiOperation(value = "支付")
    public String pay() {
        return "支付接口demo";
    }
}
