package com.fauzanrifqy.funfacts;

import android.graphics.Color;
import java.util.Random;

/**
 * Created by fauzanrifqy on 10/1/17.
 */

public class ColorWheel {

    // Variables
    public String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    // getColor return random color
    public int getColor(){
        Random random = new Random();
        int j = random.nextInt(mColors.length);
        int color = Color.parseColor(mColors[j]);

        return color;
    };

}
