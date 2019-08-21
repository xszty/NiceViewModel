package com.saxiao.niceviewmodel.repositoty;

import com.saxiao.niceviewmodel.http.ApiFactory;
import com.saxiao.niceviewmodel.model.UserBean;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.reactivestreams.Publisher;

/**
 * Created by yanghui on 2019/7/29.
 */

public class LoginRepository {
	@Inject
	public LoginRepository(){}

	public Flowable<UserBean> login(String userName,String password,String equipment) {
		Map<String,String> map=new HashMap<>();
		map.put("user.userName",userName);
		map.put("user.password",password);
		map.put("equipment",equipment);
		return ApiFactory.getApi().login(map)
			.flatMap(new Function<UserBean, Publisher<? extends UserBean>>() {
				@Override public Publisher<? extends UserBean> apply(UserBean item) throws Exception {
					return Flowable.just(item);
				}
			});
	}
}
