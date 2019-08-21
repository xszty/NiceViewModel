package com.saxiao.niceviewmodel.di;

import android.app.Application;
import com.saxiao.niceviewmodel.MyApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

/**
 * Created by yanghui on 2019/8/1.
 *
 * @author yanghui
 */
@Singleton @Component(modules = {
	AndroidInjectionModule.class,
	AndroidSupportInjectionModule.class,
	AppModule.class,
	LoginActivityModule.class,
	MainActivityModule.class
})

public interface AppComponent {
	@Component.Builder
	interface Builder {
		@BindsInstance
		Builder application(Application application);

		AppComponent build();
	}

	void inject(MyApplication app);
}
