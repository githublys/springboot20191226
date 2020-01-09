package com.ly.learn.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ly.learn.data.ResponseCode;
import com.ly.learn.exception.InternalApiException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author v_weboyang
 * @version 1.0
 * @className ResponseVO
 * @description 响应实体
 * @date 2019/3/13 18:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("响应实体")
public class ResponseVO<T> implements Serializable {


    @ApiModelProperty("编码 2000:成功,其他异常")
    private int code;

    @ApiModelProperty("消息")
    private String msg;

    @ApiModelProperty("数据结果集")
    private T data;

    @ApiModelProperty("服务器时间戳")
    private Long timestamp;

    public ResponseVO(ResponseCode responseCode) {
        this.code = responseCode.value();
        this.msg = responseCode.getDescription();
        this.timestamp = System.currentTimeMillis();
    }

    public ResponseVO(ResponseCode responseCode, T data) {
        this.code = responseCode.value();
        this.msg = responseCode.getDescription();
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public ResponseVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.timestamp = System.currentTimeMillis();
    }

    public ResponseVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public ResponseVO(InternalApiException serviceException) {
        this.code = serviceException.getCode();
        this.msg = serviceException.getMessage();
        this.timestamp = System.currentTimeMillis();
    }

}
