package com.androiddibya.dibya;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KRISHNA on 14-02-2016.
 */
public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] relation;
    private final Integer[] imageId;

    public CustomList(Activity context, String[] name,String[] relation,Integer[] imageId) {
        super(context, R.layout.single_row, name);
        this.context = context;
        this.name = name;
        this.relation=relation;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_row, null, true);
        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.txt1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.txt2);

        txtTitle1.setText(name[position]);
        txtTitle2.setText(relation[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
