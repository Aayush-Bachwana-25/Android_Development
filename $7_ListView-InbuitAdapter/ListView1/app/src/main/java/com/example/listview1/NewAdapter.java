package com.example.listview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NewAdapter extends ArrayAdapter<String> {

    String[] arr;
    int[] images;

    public NewAdapter(@NonNull Context context, int resource, @NonNull String[] arr,@NonNull int[] images) {
        super(context, resource, arr);
        this.arr=arr;
        this.images=images;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    public int getResId(int position){
        return images[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView=LayoutInflater.from(getContext()).inflate(R.layout.mylayout,parent,false);

        TextView t=convertView.findViewById(R.id.textView);
        t.setText(getItem(position));

        ImageView i=convertView.findViewById(R.id.imageView);
        i.setImageResource(getResId(position));

        return convertView;
    }
}
