package com.ly.learn.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MybatisPlusConfig
 * @Description
 * @Author v_braveliu
 * @Date 2020/1/6
 * @Version 1.0
 */
@Configuration
@MapperScan("com.ly.learn.mapper*")
public class MybatisPlusConfig {
    /*
     * 分页插件
     **/
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

}
