package com.itheima.mynews35.menu;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.itheima.mynews35.base.BasePager;

/**
 * 专题页面
 * 
 * @author Administrator
 * 
 */
public class TopicPager extends BasePager {

	public TopicPager(Context context) {
		super(context);
	}

	@Override
	public View initView() {
		TextView tv = new TextView(context);
		tv.setText("专题");

		return tv;
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub

	}

}