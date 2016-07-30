package com.bulbulhossen.banglahealthtips.Adapter_Activity_Gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bulbulhossen.banglahealthtips.R;


public class CustomAdapter_ListView extends ArrayAdapter<String> {
	String[] str;
	Context mContext;
	LayoutInflater inflater;

	public CustomAdapter_ListView(Context context, int textViewResourceId, String[] objects) {
		super(context, textViewResourceId, objects);
		str = objects;
		mContext = context;
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View row = inflater.inflate(R.layout.listview_itemname_bangla, parent, false);

		TextView textView = (TextView) row.findViewById(R.id.textView);
		textView.setText(str[position]);

		textView.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.listview_anim));

		return row;
	}
}
