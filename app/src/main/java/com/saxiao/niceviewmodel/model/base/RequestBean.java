package com.saxiao.niceviewmodel.model.base;
/**
 * 返回数据总类
 */

public class RequestBean <T>{
    private  T info;
    private boolean success;
    private String msg;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
