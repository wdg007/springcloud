package com.ly.springcloud.controller;

import com.ly.springcloud.dto.Result;
import com.ly.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ProductConsumerController {

    @Resource
    RestTemplate restTemplate;

    @Resource
    ProductService productService;

    //public static String url = "http://localhost:8100";
    public static String url = "http://product-provider-8100/";


    @GetMapping("product/consumer/get/info")
    public Result getServiceIfo() {
        return productService.getServiceInfo();
//        return new Result(200, "查询成功", restTemplate.getForObject(url + "product/provider/get/info", Result.class));

    }

    /**
     * 查询
     * @param id
     * @return
     */
//    @HystrixCommand(fallbackMethod = "getErrorInfo")
    @GetMapping("product/consumer/get/{id}")
    public Result selectById(@PathVariable("id") Long id){
        return productService.selectById(id);
//        return new Result(200, "查询成功",
//                restTemplate.getForObject(url+"product/provider/get/"+id, Result.class));
    }

//    public Result getErrorInfo(Long id) {
//        return new Result(500, "服务器内部出现错误",null);
//    }
}
