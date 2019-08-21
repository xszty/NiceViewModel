package com.saxiao.niceviewmodel.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.saxiao.niceviewmodel.model.UserBean;
import com.saxiao.niceviewmodel.repositoty.LoginRepository;
import io.reactivex.Flowable;
import javax.inject.Inject;

/**
 * Created by yanghui on 2019/8/1.
 *
 * @author yanghui
 */

public class LoginViewModel extends ViewModel{
	private MutableLiveData profileData = null;
	private UserBean bean = null;

	@Override protected void onCleared() {
		super.onCleared();
		bean = null;
	}

	public MutableLiveData<UserBean> newInstance(){
		if(profileData == null){
			profileData = new MutableLiveData();
		}
		setData();
		return profileData;
	}

	public void setData(){
		profileData.setValue(bean);
	}

	private LoginRepository loginRepository;

	@Inject
	public LoginViewModel(LoginRepository loginRepository){
		this.loginRepository = loginRepository;
	}

	public Flowable<UserBean> login(String name,String pwd,String equipment){
		return loginRepository.login(name,pwd,equipment);
	}

}
