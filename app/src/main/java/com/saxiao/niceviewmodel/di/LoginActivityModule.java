package com.saxiao.niceviewmodel.di;

import com.saxiao.niceviewmodel.view.LoginActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by yanghui on 2019/8/1.
 *
 * @author yanghui
 */
@Module
public abstract class LoginActivityModule {
    @ContributesAndroidInjector
    abstract LoginActivity contributeLoginActivity();
}
