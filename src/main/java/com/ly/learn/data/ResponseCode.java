package com.ly.learn.data;

/**
 * 响应码枚举对象。
 *
 * @author dragon
 */
public enum ResponseCode {

    OK(2000, "成功"),

    // 1000-1999 参数错误code
    PARAM_INVALID(1000, "缺失参数或无效");

    private final int value;
    private final String description;

    ResponseCode(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public static ResponseCode valueOf(int code) {
        for (ResponseCode responseCode : values()) {
            if (responseCode.value == code) {
                return responseCode;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + code + "]");
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

}
