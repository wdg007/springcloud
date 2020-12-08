package com.ly.springcloud.service;

import com.ly.springcloud.dto.Result;
import com.ly.springcloud.service.impl.ProductFalllbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "product-provider-8100", fallback = ProductFalllbackServiceImpl.class)
public interface ProductService {

    @GetMapping("product/provider/get/info")
    public Result getServiceInfo();

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/provider/get/{id}")
    public Result selectById(@PathVariable("id") Long id);
}
