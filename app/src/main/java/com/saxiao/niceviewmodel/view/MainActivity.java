package com.saxiao.niceviewmodel.view;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Chronometer;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.saxiao.niceviewmodel.R;
import com.saxiao.niceviewmodel.di.Injectable;
import com.saxiao.niceviewmodel.viewmodel.ChronometerViewModel;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Injectable {

	@BindView(R.id.chronometer)
	Chronometer chronometer;

	private ChronometerViewModel chronometerViewModel;

	private double l;
	private String name,thisName;
	private double total = 0d;
	private double cost = 0d;
	private double avg;

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
		//long startTime = SystemClock.elapsedRealtime();
		////每次onCreate，都会重新走setBase
		//chronometer.setBase(startTime);
		//chronometer.start();
		Log.e("xxxx","l->"+l);

		test2();

	}

	private void test1(){
		chronometerViewModel = ViewModelProviders.of(this).get(ChronometerViewModel.class);
		if(chronometerViewModel.getmStartTime() == null){
			//如果为null，说明没设置过开始时间
			long startTime = SystemClock.elapsedRealtime();
			chronometer.setBase(startTime);
			chronometerViewModel.setmStartTime(startTime);
		}else{
			//不为null，直接赋值
			chronometer.setBase(chronometerViewModel.getmStartTime());
		}
		chronometer.start();
	}

	private void test2(){
		//name = "yh";
		//thisName = "yh";
		//if(Objects.equals(name,thisName)){
		//	Log.e("xxxxx","相等");
		//}
		if(!Objects.equals(cost,0)){

		}

		//
		if(cost == 0){
			Log.e("xxxx","走这儿了1");
		}
		just(cost,0);

		//if(!((cost == 0)||just(cost,0))){
		//
		//}

	}

	private void just(Object a,Object b){
		if(a != null && a.equals(b)){
			Log.e("xxxx","走这儿了2");
		}
	}

}
