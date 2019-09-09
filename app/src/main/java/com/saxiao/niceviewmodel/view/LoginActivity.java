package com.saxiao.niceviewmodel.view;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.saxiao.niceviewmodel.R;
import com.saxiao.niceviewmodel.di.Injectable;
import com.saxiao.niceviewmodel.viewmodel.LoginViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;

/**
 *  登录页面
 */

public class LoginActivity extends AppCompatActivity implements Injectable {

    @BindView(R.id.bt_login) Button btLogin;
    @BindView(R.id.et_user) EditText etUser;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.setting_btn)
    TextView tvSet;

    @Inject
	ViewModelProvider.Factory viewModelFactory;
    private LoginViewModel loginViewModel;

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ButterKnife.bind(this);
		loginViewModel = ViewModelProviders.of(this,viewModelFactory).get(LoginViewModel.class);
		btLogin.setOnClickListener(view -> {
			loginViewModel.login(etUser.getText().toString(), etPassword.getText().toString(), "111").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(bean -> {
				if (bean.isSuccess()) {
					Log.e("xxxx", "bean.name" + bean.getFunctions().size() + bean.getFunctions().get(0).getName());
				} else {
					Log.e("xxxx", "bean" + bean.getMsg());
				}
			});

			//loginViewModel.newInstance().observe(LoginActivity.this, new Observer<UserBean>() {
			//	@Override public void onChanged(@Nullable UserBean userBean) {
			//		//更新ui
			//		Log.e("xxxxx","更新ui");
			//	}
			//});

			//startActivity(new Intent(LoginActivity.this,MainActivity.class));
		});
	}


}
