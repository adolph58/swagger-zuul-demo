package com.example.pay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "订单系统接口", description = "订单系统模块相关接口")
public class OrderServerController {
    @PostMapping("/orderSomething")
    @ApiOperation(value = "下单")
    public String pay() {
        return "订单接口demo";
    }
}
