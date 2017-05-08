package com.example.hp1.language;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hp 1 on 1/20/2017.
 */
public class WordAdapter extends ArrayAdapter<word> {

    //color resource id
    private int colourid;


    public WordAdapter(Activity context, List<word> words,int colourid) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, words);
        this.colourid=colourid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

// View listitemview=convertView;
        // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position
        word currentword = getItem(position);

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lisi_item, parent, false);
        }

        TextView english = (TextView) convertView.findViewById(R.id.miwoktext);
        english.setText(currentword.getmylang());

        TextView miwok = (TextView) convertView.findViewById(R.id.englishtext);
        miwok.setText(currentword.getmiwok());


        ImageView iv = (ImageView) convertView.findViewById(R.id.image);

        if (currentword.hasimage()) {
            iv.setImageResource(currentword.getimageid());
        } else
            iv.setVisibility(View.GONE);



        View textcolor=convertView.findViewById(R.id.color_category);
        int color= ContextCompat.getColor(getContext(),colourid);
        textcolor.setBackgroundColor(color);





        return convertView;

    }
}
