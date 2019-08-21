package com.saxiao.niceviewmodel.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.saxiao.niceviewmodel.viewmodel.ChronometerViewModel;
import com.saxiao.niceviewmodel.viewmodel.LoginViewModel;
import com.saxiao.niceviewmodel.viewmodel.ViewModelFactory;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by yanghui on 2019/8/1.
 *
 * @author yanghui
 */
@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindLoginViewModel(LoginViewModel loginViewModel);

	@Binds
	@IntoMap
	@ViewModelKey(ChronometerViewModel.class)
	abstract ViewModel bindChronometerViewModel(ChronometerViewModel chronometerViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
