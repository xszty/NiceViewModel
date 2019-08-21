package com.saxiao.niceviewmodel.viewmodel;

import android.arch.lifecycle.ViewModel;
import javax.inject.Inject;

public class ChronometerViewModel extends ViewModel {

	private Long mStartTime;

	@Inject
	public ChronometerViewModel(){}

	public Long getmStartTime() {
		return mStartTime;
	}

	public void setmStartTime(Long mStartTime) {
		this.mStartTime = mStartTime;
	}

	/**
	 *
	 */
}
