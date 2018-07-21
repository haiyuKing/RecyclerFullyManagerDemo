package com.why.project.recyclerfullymanagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.why.project.recyclerfullymanagerdemo.adapter.NewsAdapter;
import com.why.project.recyclerfullymanagerdemo.bean.NewsBean;

import java.util.ArrayList;

/**
 * Created by HaiyuKing
 * Used
 */

public class LinearLayoutManagerActivity extends AppCompatActivity {

	private RecyclerView mRecyclerView;
	private ArrayList<NewsBean> mNewsBeanArrayList;
	private NewsAdapter mNewsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recyclerview);
		initViews();
		initDatas();
		initEvents();

	}

	private void initViews() {
		mRecyclerView = findViewById(R.id.recycler_view);
	}

	private void initDatas() {
		//初始化集合
		mNewsBeanArrayList = new ArrayList<NewsBean>();
		for(int i=0; i<5;i++){
			NewsBean newsBean = new NewsBean();
			newsBean.setNewsId("123"+i);
			newsBean.setNewsTitle("标题"+i);

			mNewsBeanArrayList.add(newsBean);
		}

		//设置布局管理器
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(linearLayoutManager);

		//设置适配器
		if(mNewsAdapter == null){
			//设置适配器
			mNewsAdapter = new NewsAdapter(this, mNewsBeanArrayList);
			mRecyclerView.setAdapter(mNewsAdapter);
			//添加分割线
			//设置添加删除动画
			//调用ListView的setSelected(!ListView.isSelected())方法，这样就能及时刷新布局
			mRecyclerView.setSelected(true);
		}else{
			mNewsAdapter.notifyDataSetChanged();
		}
	}

	private void initEvents() {
		//列表适配器的点击监听事件
		mNewsAdapter.setOnItemClickLitener(new NewsAdapter.OnItemClickLitener() {
			@Override
			public void onItemClick(View view, int position) {

			}

			@Override
			public void onItemLongClick(View view, int position) {

			}
		});

		//添加一个item
		findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				NewsBean newsBean = new NewsBean();
				newsBean.setNewsId("123"+20);
				newsBean.setNewsTitle("标题"+20);

				mNewsBeanArrayList.add(newsBean);

				mNewsAdapter.notifyDataSetChanged();
			}
		});
	}
}
