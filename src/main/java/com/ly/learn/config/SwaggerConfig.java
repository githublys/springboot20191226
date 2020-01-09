package com.ly.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description
 * @Author v_braveliu
 * @Date 2020/1/8
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 通过 createRestApi函数来构建一个DocketBean
     * 函数名,可以随意命名,喜欢什么命名就什么命名
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("apply").enable(true)
                .genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false)
                .forCodeGeneration(false).pathMapping("/").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.ly.learn.controller")).build();
    }
    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot Swagger2 构建RESTful API")
                //条款地址
                .termsOfServiceUrl("")
                .contact("zwd")
                .version("1.0")
                //描述
                .description("平台接口文档")
                .build();
    }
}
