package com.ly.learn.exception;


import com.ly.learn.data.ResponseCode;

/**
 * service服务内部统一接口异常异常、远程接口统一抛出此异常
 * @author dragonlai
 * @date 2017年12月12日 23:09:11
 *  需要在面向内部服务的controller层中将所有的业务异常转化为InternalApiException
 */
public class InternalApiException extends RuntimeException {

	private static final long serialVersionUID = -4179539237744025098L;
    // 异常码
    private int code;

    // 异常信息(和responseVo字段msg名称一致,避免丢失异常信息)
    private String message;

    public InternalApiException(ResponseCode responseCode, Throwable cause) {
        super(responseCode.getDescription(), cause);
        this.code = responseCode.value();
        this.message = responseCode.getDescription();
    }

    public InternalApiException(ResponseCode responseCode) {
        super(responseCode.getDescription());
        this.code = responseCode.value();
        this.message = responseCode.getDescription();
    }

    public InternalApiException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
