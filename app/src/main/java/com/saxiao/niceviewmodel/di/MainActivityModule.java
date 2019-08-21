package com.saxiao.niceviewmodel.di;

import com.saxiao.niceviewmodel.view.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by yanghui on 2019/8/1.
 *
 * @author yanghui
 */
@Module
public abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
