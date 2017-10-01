package com.fauzanrifqy.funfacts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fauzanrifqy.funfacts.components.ColorWheel;
import com.fauzanrifqy.funfacts.components.FactsBook;
import com.fauzanrifqy.funfacts.R;

public class FunFactsActivity extends AppCompatActivity implements View.OnClickListener {

    // Variables
    public TextView factTextView;
    public RelativeLayout relativeLayout;
    public Button btn, btnAllFunFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                 // default android
        setContentView(R.layout.activity_fun_facts);        // call layout

        // mengakses layout yang ada di xml
        findView();

        // definisi aksi yang dilakukan
        setListener();

    }

    private void setListener(){
        // Button
        btn.setOnClickListener(this);
        btnAllFunFact.setOnClickListener(this);
    }

    private void findView(){
        // TextView
        factTextView = (TextView) findViewById(R.id.factTextView);

        // Button
        btn = (Button) findViewById(R.id.showFact);
        btnAllFunFact = (Button) findViewById(R.id.showAllFact);

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
        }else if(view == btnAllFunFact){
            // Pindah halaman
            Intent intent = new Intent(getApplicationContext(), FactListActivity.class);
            startActivity(intent);
        }
    }
}
