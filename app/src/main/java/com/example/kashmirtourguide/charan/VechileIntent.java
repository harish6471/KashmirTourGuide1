package com.example.kashmirtourguide.charan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kashmirtourguide.R;

public class VechileIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vechile_intent);
        ViewFlipper viewFlipper = findViewById(R.id.flipperid1);

        ImageView iv4 = findViewById(R.id.imageView4);
        ImageView iv5 = findViewById(R.id.imageView5);
        ImageView iv6 = findViewById(R.id.imageView6);


        TextView tv = findViewById(R.id.textView2);

        Intent intent = getIntent();
        int id= intent.getIntExtra("position",0);

        if(id==0) {
            iv4.setImageResource(R.drawable.intent1);
            iv5.setImageResource(R.drawable.intent2);
            iv6.setImageResource(R.drawable.intent3);

            tv.setText(R.string.barbecue_details);
            viewFlipper.startFlipping();

        }
        else if(id==1)
        {
            iv4.setImageResource(R.drawable.intent4);
            iv5.setImageResource(R.drawable.intent5);
            iv6.setImageResource(R.drawable.intent6);

            tv.setText(R.string.rogan_josh_details);
            viewFlipper.startFlipping();

        }

    }
}

