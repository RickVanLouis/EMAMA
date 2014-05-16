package com.example.aufgabe_5;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.example.aufgabe_5.R;

public class BarListActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_barlist);

		ArrayList<NewsItem> image_details = getListData();
		final ListView lv1 = (ListView) findViewById(R.id.custom_list_view);
		lv1.setAdapter(new CustomListAdapter(this, image_details));
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				Object o = lv1.getItemAtPosition(position);
				NewsItem newsData = (NewsItem) o;
				Toast.makeText(BarListActivity.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
			}

		});

	}

	private ArrayList<NewsItem> getListData() {
		ArrayList<NewsItem> results = new ArrayList<NewsItem>();
		NewsItem newsData = new NewsItem();
		newsData.setName("Färbe");
		newsData.setRating("2");
		newsData.setLocation("Furtwangen");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setName("Engel");
		newsData.setRating("3");
		newsData.setLocation("Furtwangen");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setName("Fallenbengel ");
		newsData.setRating("5");
		newsData.setLocation("Furtwangen");
		results.add(newsData);
		
		newsData = new NewsItem();
		newsData.setName("Cegos Bistro ");
		newsData.setRating("4");
		newsData.setLocation("Furtwangen");
		results.add(newsData);
		
		newsData = new NewsItem();
		newsData.setName("Bar3000 ");
		newsData.setRating("1");
		newsData.setLocation("Furtwangen");
		results.add(newsData);
		
		newsData = new NewsItem();
		newsData.setName("DieBar ");
		newsData.setRating("2");
		newsData.setLocation("Furtwangen");
		results.add(newsData);

		

		return results;
	}
}
