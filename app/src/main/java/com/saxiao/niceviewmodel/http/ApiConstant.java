package com.saxiao.niceviewmodel.http;

/**
 * Created by Administrator on 2019/7/29.
 */

public class ApiConstant {
	private String baseUrl;

	public String getBaseUrl() {
		return baseUrl;
	}

	private ApiConstant(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public static ApiConstant newInstance(){
		ApiConstant apiConstant = new ApiConstant("http://222.173.38.98:9090/psms/api/");
		return apiConstant;
	}
}
