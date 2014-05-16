package com.example.aufgabe_5;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aufgabe_5.R;

public class CustomListAdapter extends BaseAdapter {

	private ArrayList<NewsItem> listData;

	private LayoutInflater layoutInflater;

	public CustomListAdapter(Context context, 
			ArrayList<NewsItem> listData) {
		this.listData = listData;
		layoutInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = layoutInflater
					.inflate(R.layout.list_row_layout, null);
			holder = new ViewHolder();
			holder.nameView = (TextView) convertView
					.findViewById(R.id.name_view);
			holder.ratingView = (TextView) convertView
					.findViewById(R.id.rating_view);
			holder.locationView = (TextView) convertView
					.findViewById(R.id.location_view);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.nameView.setText(listData.get(position).getName());
		holder.ratingView.setText(listData.get(position).getRating());
		holder.locationView.setText(listData.get(position).getLocation());

		return convertView;
	}

	static class ViewHolder {
		TextView nameView;
		TextView ratingView;
		TextView locationView;
	}

}
