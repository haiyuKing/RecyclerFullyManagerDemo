package com.why.project.recyclerfullymanagerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();
		initDatas();
		initEvents();
	}

	private void initViews() {
	}

	private void initDatas() {
	}

	private void initEvents() {

		findViewById(R.id.btn_LinearLayoutManager).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this,LinearLayoutManagerActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});

		findViewById(R.id.btn_GridLayoutManager).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this,GridLayoutManagerActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
		findViewById(R.id.btn_FullyLinearLayoutManager).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this,FullyLinearLayoutManagerActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});

		findViewById(R.id.btn_FullyGridLayoutManager).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this,FullyGridLayoutManagerActivity.class);
				MainActivity.this.startActivity(intent);
			}
		});
	}
}
