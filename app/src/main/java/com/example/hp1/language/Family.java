package com.example.hp1.language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.word_list);


                ArrayList<word> num =new ArrayList<word>();
                num.add(new word("Father" ,"Papa",R.drawable.family_father));
                num.add(new word("Mother" ,"Mummy",R.drawable.family_mother));
                num.add(new word("Son" ,"Beta",R.drawable.family_son));
                num.add(new word("Daughter" ,"Beti",R.drawable.family_daughter));
                num.add(new word("Older Brother" ,"Bhai",R.drawable.family_older_brother));
                num.add(new word("Older Sister" ,"Di",R.drawable.family_older_sister));
                num.add(new word("GrandMother" ,"Amma",R.drawable.family_grandmother));
                num.add(new word("Grandfather" ,"Dada",R.drawable.family_grandfather));






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
                        new WordAdapter(this , num,R.color.familycolor);

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







