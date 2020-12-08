package com.ly.springcloud.service.impl;

import com.ly.springcloud.dto.Result;
import com.ly.springcloud.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductFalllbackServiceImpl implements ProductService {
    @Override
    public Result getServiceInfo() {
        return new Result(500, "服务内部错，误导致getServiceInfo接口异常", null);
    }

    @Override
    public Result selectById(Long id) {
        return new Result(500, "服务内部错，误导致selectById接口异常", null);
    }
}
