package com.saxiao.niceviewmodel.http;

import com.saxiao.niceviewmodel.model.UserBean;
import io.reactivex.Flowable;
import java.util.Map;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * 所有模块API，请求接口
 */

public interface Api {

	/**
	 * post请求，请求登录
	 */
    @Headers({"isClient:android"})
    @POST(BaseApi.doLogin) Flowable<UserBean> login(@QueryMap Map<String, String> maps);

    ///**
	 //*post请求，请求修改密码
	 //*/
    //@POST(BaseApi.UpdatePassword) Observable<BaseBean> updatePassword(@HeaderMap Map<String, String> headers, @QueryMap Map<String, String> maps);
    //
    ///**
	 //*post请求，请求版本信息
	 //*/
    //@POST(BaseApi.latestVersion) Observable<RequestBean<APK>> latestVersion(@HeaderMap Map<String, String> headers, @QueryMap Map<String, String> maps);


}
