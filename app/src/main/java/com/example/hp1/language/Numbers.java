package com.example.hp1.language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.*;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
      //  getActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayList<word> num =new ArrayList<word>();
        num.add(new word("one" ,"Ek",R.drawable.number_one));
        num.add(new word("Two" ,"Do",R.drawable.number_two));
        num.add(new word("Three" ,"Teen",R.drawable.number_three));
        num.add(new word("Four" ,"Cahr",R.drawable.number_four));
        num.add(new word("Five" ,"Panch",R.drawable.number_five));
        num.add(new word("Six" ,"Che",R.drawable.number_six));
        num.add(new word("Eight" ,"AAth",R.drawable.number_eight));
        num.add(new word("Seven" ,"Saat",R.drawable.number_seven));
        num.add(new word("Nine" ,"Nau",R.drawable.number_nine));
        num.add(new word("Ten" ,"Dus",R.drawable.number_ten));





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

        //constructor of word adpter class
        WordAdapter itemsAdapter =
                new WordAdapter(this , num ,R.color.numberscolor);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.root);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

    }


}
