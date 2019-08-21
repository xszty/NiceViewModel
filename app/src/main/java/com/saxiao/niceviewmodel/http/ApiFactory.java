package com.saxiao.niceviewmodel.http;

import com.saxiao.library.dialog.http.HttpClient;

/**
 * Api工厂类
 *
 * @author Ruins
 */
public class ApiFactory {
	private static Api api;

	public static Api getApi() {
		if (api == null) {
			api = HttpClient.getInstance(ApiConstant.newInstance().getBaseUrl(),true,null).createService(Api.class);
		}
		return api;
	}
}
