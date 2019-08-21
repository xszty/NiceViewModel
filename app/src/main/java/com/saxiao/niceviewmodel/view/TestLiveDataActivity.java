package com.saxiao.niceviewmodel.view;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.Transformations;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.saxiao.niceviewmodel.R;
import com.saxiao.niceviewmodel.model.StaffBean;

public class TestLiveDataActivity extends AppCompatActivity {

	private Button btn;
	private TextView tv;
	private MutableLiveData<Integer> mutableLiveData;
	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_live_data);
		btn = findViewById(R.id.start);
		tv = findViewById(R.id.tv);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View view) {
				new Thread(){
					@Override public void run() {
						super.run();
						int num = 0;
						while (num<20){
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							num++;
							//4,发射数据
							mutableLiveData.postValue(num);
						}
					}
				}.start();
			}
		});
		//1，创建livedata实例，持有某个数据类型的引用
		mutableLiveData = new MutableLiveData<>();

		//2,创建Observer对象，并实现其onChanged方法，数据发生改变时，调用。
		Observer observer = (Observer<Integer>) integer -> {
			//当livedata数据改变时调用
			tv.setText(""+integer);
			Log.e("xxxx","integer:"+integer);
		};

		//3，通过livedata的observe方法，把observer对象放进去
		mutableLiveData.observe(this,observer);

		//上述2,3步可以改为如下，转换一下数据类型，就像rxjava的map
		Transformations.map(mutableLiveData, new Function<Integer, String>() {
			@Override public String apply(Integer input) {
				return ""+input;
			}
		}).observe(this, new Observer<String>() {
			@Override public void onChanged(@Nullable String s) {
				tv.setText(s);
			}
		});

		/**
		 * 不只是数据类型转换那么简单，还有更复杂的转换，比如我们需要一个存储userId的LiveData，
		 * 另一方面又需要维护一个存储User的Livedata。而后者的User是根据userId从数据库中查找的，
		 * 这时就可以使用Transformations类的switchmap操作符。
		 */
		MutableLiveData<String> userIdLivedata = new MutableLiveData<>();
		LiveData<StaffBean> userLiveData = Transformations.switchMap(userIdLivedata, new Function<String, LiveData<StaffBean>>() {
			@Override public LiveData<StaffBean> apply(String userId) {
				return getUser(userId);
			}
		});

	}

	public LiveData<StaffBean> getUser(String userId){
		//根据id获取User,最好用配套的数据库组件Room，因为它能直接返回一个LiveData对象。
		return new MutableLiveData<>();
	}
}
