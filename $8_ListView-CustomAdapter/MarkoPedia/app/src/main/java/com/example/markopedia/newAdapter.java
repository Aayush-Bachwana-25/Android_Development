package com.example.markopedia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class newAdapter extends ArrayAdapter<String> {
    private String[] companyName;
    private int[] images;
    static String url="";

    public newAdapter(@NonNull Context context, int resource, @NonNull String[] objects,@NonNull int[] images) {
        super(context, resource, objects);
        this.companyName=objects;
        this.images=images;
    }

    @Nullable
    public String getCompanyName(int position) {
        return companyName[position];
    }

    @Nullable
    public int getImages(int position) {
        return images[position];
    }

    public static String getUrl(){
        return url;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.newadapter,parent,false);

        TextView t=convertView.findViewById(R.id.company_name);
        t.setText(getCompanyName(position));

        ImageView i=convertView.findViewById(R.id.imageView);
        i.setImageResource(getImages(position));

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You Clicked on::"+getCompanyName(position), Toast.LENGTH_SHORT).show();

                if(position==0){
                    url="https://www.facebook.com/";
                }
                else if(position==1){
                    url="https://www.google.com/";
                }
                else if(position==2){
                    url="https://www.apple.com/";
                }
                else if(position==3){
                    url="https://www.amazon.com/";
                }
                else if(position==4){
                    url="https://www.coca-colacompany.com/";
                }
                else if(position==5){
                    url="https://microsoft.com/";
                }
                else if(position==6){
                    url="https://www.samsung.com/hk_en/";
                }
//                Toast.makeText(getContext(), "Opening..."+url, Toast.LENGTH_SHORT).show();
//                MainActivity.runIntent(url);
            }
        });
        return convertView;
    }
}
