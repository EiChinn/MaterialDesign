package com.otamegane.chinnei.materialdesign;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by chinnei on 2015/12/26.
 */
public class ListAdapter extends BaseAdapter {
    private static final int COUNT = 50;
    private String[] items;
    private Context context;

    public ListAdapter(Context context) {
        this.context = context;
        items = new String[COUNT];
        for (int i = 0; i < COUNT; i++) {
            items[i] = i + "";
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public String getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(context);
        tv.setText(getItem(position));
        return tv;
    }
}
