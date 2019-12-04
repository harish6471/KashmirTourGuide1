package com.example.kashmirtourguide;

import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class SportsIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_intent);


        ViewFlipper viewFlipper = findViewById(R.id.flipperid);
        ImageView iv1 = findViewById(R.id.imageView1);
        ImageView iv2 = findViewById(R.id.imageView2);
        ImageView iv3 = findViewById(R.id.imageView3);
        TextView tv = findViewById(R.id.textView1);

        Intent intent = getIntent();
        int id= intent.getIntExtra("position",0);

        if(id==0) {
            iv1.setImageResource(R.drawable.skiing);
            iv2.setImageResource(R.drawable.skiing2);
            iv3.setImageResource(R.drawable.skiing3);
            tv.setText(R.string.skiing_details);
            viewFlipper.startFlipping();
        }
        else if(id==1)
        {
            iv1.setImageResource(R.drawable.waterskiing);
            iv2.setImageResource(R.drawable.watersports2);
            iv3.setImageResource(R.drawable.watersports3);
            tv.setText(R.string.water_sports_details);
            viewFlipper.startFlipping();

        }
        else if(id==2)
        {
            iv1.setImageResource(R.drawable.golf);
            iv2.setImageResource(R.drawable.golf2);
            iv3.setImageResource(R.drawable.golf3);
            tv.setText(R.string.golf_details);
            viewFlipper.startFlipping();

        }
        else if(id==3)
        {
            iv1.setImageResource(R.drawable.cricket);
            iv2.setImageResource(R.drawable.cricket2);
            iv3.setImageResource(R.drawable.cricket3);
            tv.setText(R.string.cricket_details);
            viewFlipper.startFlipping();

        }
    }
}

