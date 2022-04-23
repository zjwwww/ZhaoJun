package com.zhaojun.nov.springbootzhaojun.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * @date 2022/4/23 12:22
 */
public class Result {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private Map<String, Object> data = new HashMap<String, Object>();

    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(200);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(500);
        return result;
    }

    public  Result data(Object data) {
        this.data.put("data",data);
        return this;
    }

    public  Result data(String key,Object data) {
        this.data.put(key, data);
        return this;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
