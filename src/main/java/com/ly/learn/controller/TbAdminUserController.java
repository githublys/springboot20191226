package com.ly.learn.controller;


import com.ly.learn.entity.TbAdminUserEntity;
import com.ly.learn.service.ITbAdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Autowired
    ITbAdminUserService iTbAdminUserService;

    @ApiOperation(value = "测试接口1", httpMethod = "GET")
    @GetMapping(value = "v1/getById")
    public String getById() {
        TbAdminUserEntity byId = iTbAdminUserService.get(1);
        return "1";
    }
}
