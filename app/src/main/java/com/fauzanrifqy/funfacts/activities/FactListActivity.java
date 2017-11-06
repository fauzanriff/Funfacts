package com.fauzanrifqy.funfacts.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fauzanrifqy.funfacts.R;
import com.fauzanrifqy.funfacts.components.FactsBook;

public class FactListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_list);

        FactsBook factsBook = new FactsBook();
        String[] facts = factsBook.getAllFacts();

        LinearLayout factContainer = (LinearLayout) findViewById(R.id.fact_container);

        for (int i=0; i<facts.length; i++){

            // membuat text view
            TextView factView = new TextView(getApplicationContext());

            // ubah style dari text view
            factView.setTextSize(18.0f);
            factView.setPadding(15, 15, 15, 15);
            factView.setBackgroundColor(Color.parseColor("#39add1"));
            factView.setTextColor(Color.parseColor("#ffffff"));

            // ubah parameter layout
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 0, 0, 15);
            factView.setLayoutParams(layoutParams);

            // mengisi nilai textview dengan facts[i]
            factView.setText(facts[i]);

            // menambahkan textview kedalam layout
            factContainer.addView(factView);
        }

    }
}
