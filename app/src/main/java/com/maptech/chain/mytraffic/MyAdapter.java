package com.maptech.chain.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CHAIN on 20/12/2558.
 */
public class MyAdapter extends BaseAdapter {

    // Explicit
    private Context objContext;
    private String[] title1String,title2Strings;
    private int[] iconInts;


    public MyAdapter(Context objContext, String[] title1String, String[] title2Strings, int[] iconInts) {
        this.objContext = objContext;
        this.title1String = title1String;
        this.title2Strings = title2Strings;
        this.iconInts = iconInts;
    } // Constructor


    @Override
    public int getCount() {
        return title1String.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Open service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        // For Textview
        TextView title1TextView = (TextView) objView.findViewById(R.id.txtTitle1);
        title1TextView.setText(title1String[position]);
        TextView title2TextView = (TextView) objView.findViewById(R.id.txtTitle2);
        title2TextView.setText(title2Strings[position]);

        // For Image
        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);





        return objView;
    }
}     //  main class
