package com.ly.learn.controller;


import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author braveliu
 * @since 2020-01-06
 */
@RestController
@Slf4j
@Api(value = "test")
public class TbAdminUserController {

    public String get() {
        return "1";
    }
}
