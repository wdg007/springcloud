package com.ly.springcloud.service;

import com.ly.springcloud.entity.Product;

public interface ProductService {

    /**
     * 查询
     * @param id
     * @return
     */
    public Product selectById(Long id) throws Exception;


    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteById(Long id);

    /**
     * 修改
     * @param id
     * @param name
     * @return
     */
    public int updateById(Long id, String name);

    /**
     * 新增
     * @param product
     * @return
     */
    public int insertOne(Product product);
}
