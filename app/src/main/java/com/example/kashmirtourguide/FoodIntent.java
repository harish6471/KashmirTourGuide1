package com.example.kashmirtourguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class FoodIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_intent);
        ViewFlipper viewFlipper = findViewById(R.id.flipperid1);

        ImageView iv4 = findViewById(R.id.imageView4);
        ImageView iv5 = findViewById(R.id.imageView5);

        TextView tv = findViewById(R.id.textView2);

        Intent intent = getIntent();
        int id= intent.getIntExtra("position",0);

        if(id==0) {
            iv4.setImageResource(R.drawable.barbeque);
            iv5.setImageResource(R.drawable.barbeque1);

            tv.setText(R.string.barbecue_details);
            viewFlipper.startFlipping();

        }
        else if(id==1)
        {
            iv4.setImageResource(R.drawable.roganjosh);
            iv5.setImageResource(R.drawable.roganjosh1);

            tv.setText(R.string.rogan_josh_details);
            viewFlipper.startFlipping();

        }
        else if(id==2)
        {
            iv4.setImageResource(R.drawable.noonchai);
            iv5.setImageResource(R.drawable.noonchai1);

            tv.setText(R.string.noon_chai_details);
            viewFlipper.startFlipping();

        }
        else if(id==3)
        {
            iv4.setImageResource(R.drawable.rista);
            iv5.setImageResource(R.drawable.rista1);

            tv.setText(R.string.meat_balls_details);
            viewFlipper.startFlipping();

        }
        else if(id==4)
        {
            iv4.setImageResource(R.drawable.czot);
            iv5.setImageResource(R.drawable.czot1);

            tv.setText(R.string.czot_details);
            viewFlipper.startFlipping();

        }
        else if(id==5)
        {
            iv4.setImageResource(R.drawable.goshtaba);
            iv5.setImageResource(R.drawable.goshtaba1);

            tv.setText(R.string.gushtaba_details);
            viewFlipper.startFlipping();

        }
        else if(id==6)
        {
            iv4.setImageResource(R.drawable.haak);
            iv5.setImageResource(R.drawable.haakh1);

            tv.setText(R.string.haakh_details);
            viewFlipper.startFlipping();

        }
        else if(id==7)
        {
            iv4.setImageResource(R.drawable.kebab);
            iv5.setImageResource(R.drawable.kebab1);

            tv.setText(R.string.kebab_details);
            viewFlipper.startFlipping();

        }
        else if(id==8)
        {
            iv4.setImageResource(R.drawable.yakhni);
            iv5.setImageResource(R.drawable.yakhni1);

            tv.setText(R.string.yakhni_details);
            viewFlipper.startFlipping();

        }

    }
}

