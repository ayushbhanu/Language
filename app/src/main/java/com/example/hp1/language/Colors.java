package com.example.hp1.language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.*;

public class Colors  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.word_list);


        ArrayList<word> num =new ArrayList<word>();
        num.add(new word("Red" ,"Lal",R.drawable.color_red));
        num.add(new word("Yellow" ,"Peela",R.drawable.color_dusty_yellow));
        num.add(new word("Black" ,"Kala",R.drawable.color_black));
        num.add(new word("Brown" ,"Bhura",R.drawable.color_brown));
        num.add(new word("Gray" ,"Grey",R.drawable.color_gray));
        num.add(new word("White" ,"Safed",R.drawable.color_white));
        num.add(new word("Green" ,"Hara",R.drawable.color_green));
        num.add(new word("Mustard YEllow" ,"Sarsoi Peela",R.drawable.color_mustard_yellow));
     //   num.add(new word("Purple" ,"Bangni",R.drawable.c));






//
//        LinearLayout l= (LinearLayout)findViewById(R.id.root);
//
//        for (int i=0;i<50;i++) {
//            TextView tv= new TextView(this);
//            tv.setText(num.get(i));
//            l.addView(tv);
//        }


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter itemsAdapter =
                new WordAdapter(this , num,R.color.colorcolor);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.root);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

    }


}
