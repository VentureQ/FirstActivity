package com.example.firstactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FruitAdapter(Context context, int textViewResorceId, List<Fruit> object) {
        super(context, textViewResorceId,object);
        resourceId=textViewResorceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view= LayoutInflater.from(getContext()).
                inflate(resourceId,parent,false);
        ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
        TextView fruitName=(TextView)view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getFruitId());
        fruitName.setText(fruit.getName());
        return view;
    }
}