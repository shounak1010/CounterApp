package com.amaxindustries.counterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<String>{

    private  ArrayList<String >web;
    LayoutInflater mInflater;
    public CustomList(Context context, ArrayList<String> web) {
        super(context, 0, web);
        mInflater= LayoutInflater.from(context);
        this.web = web;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView= mInflater.inflate(R.layout.list_item,parent,false);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);
        txtTitle.setText(web.get(position));
        return rowView;
    }
}