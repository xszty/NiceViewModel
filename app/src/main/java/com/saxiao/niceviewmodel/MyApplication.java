package com.saxiao.niceviewmodel;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.saxiao.niceviewmodel.di.AppInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import javax.inject.Inject;

/**
 * Created by yanghui on 2019/8/1.
 *
 * @author yanghui
 */

public class MyApplication extends Application implements HasActivityInjector {
	@Inject DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
	private static Context context;
	@Override protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		MultiDex.install(this);
	}

	@Override public void onCreate() {
		super.onCreate();
		context = getApplicationContext();
		AppInjector.init(this);
	}

	/**
	 * 全局上下文
	 * */
	public static Context getAppContext() {
		return context;
	}

	@Override
	public AndroidInjector<Activity> activityInjector() {
		return dispatchingAndroidInjector;
	}
	public DispatchingAndroidInjector<Activity> getDispatchingAndroidInjector() {
		return dispatchingAndroidInjector;
	}
	public void setDispatchingAndroidInjector(DispatchingAndroidInjector<Activity> dispatchingAndroidInjector) {
		this.dispatchingAndroidInjector = dispatchingAndroidInjector;
	}

}
