package com.example.aufgabe_5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button ButtonBar;
	Button ButtonRes;
	Button ButtonImageAsync;
	Button ButtonImageHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ButtonBar = (Button) findViewById(R.id.barBTN);
		ButtonRes = (Button) findViewById(R.id.resBTN);
		ButtonImageAsync =(Button) findViewById(R.id.asyncBTN);
		ButtonImageHandler =(Button) findViewById(R.id.handlerBTN);
		

		ButtonBar.setOnClickListener (new OnClickListener() {
			public void onClick(View v) {
				Intent barIntent = new Intent(MainActivity.this, BarListActivity.class);
				startActivity(barIntent);
				
			}
		});

		
		
		ButtonRes.setOnClickListener (new OnClickListener() {
			public void onClick(View v) {
				Intent resIntent = new Intent(MainActivity.this, TestMainActivity.class);
				startActivity(resIntent);
				
			}
		});
		
		
		ButtonImageAsync.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent asyncIntent = new Intent(MainActivity.this, ImageLoadMainAsync.class);
				startActivity(asyncIntent);
			}
		});
		
		ButtonImageHandler.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent handlerIntent = new Intent(MainActivity.this, ImageLoadHandler.class);
				startActivity(handlerIntent);
			}
		});

	}

}
