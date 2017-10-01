package com.fauzanrifqy.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity implements View.OnClickListener {

    // Variables
    public TextView factTextView;
    public RelativeLayout relativeLayout;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                 // default android
        setContentView(R.layout.activity_fun_facts);        // call layout

        findView();

        setListener();

    }

    private void setListener(){
        // Button
        btn.setOnClickListener(this);
    }

    private void findView(){
        // TextView
        factTextView = (TextView) findViewById(R.id.factTextView);

        // Button
        btn = (Button) findViewById(R.id.showFact);

        // relativeLayout
        relativeLayout = (RelativeLayout) findViewById(R.id.realativeLayout);
    }

    @Override
    public void onClick(View view) {
        if (view == btn){
            // Change fact
            FactsBook factsbook = new FactsBook();
            factTextView.setText(factsbook.getFact());

            // Set Background
            ColorWheel colorWheel = new ColorWheel();
            relativeLayout.setBackgroundColor(colorWheel.getColor());
        }
    }
}
