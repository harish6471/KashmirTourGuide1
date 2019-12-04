package com.example.kashmirtourguide.charan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kashmirtourguide.R;

public class BookActivity extends AppCompatActivity {

    ImageView iv,iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Toolbar toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Booking");
        iv=findViewById(R.id.image);
        iv1=findViewById(R.id.image1);

        iv.setImageResource(R.drawable.r1);
        iv1.setImageResource(R.drawable.r2);




        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookActivity.this,DetailsActivity.class);
                intent.putExtra("price","1000" );
             startActivity(intent);
            }
        });
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(BookActivity.this,DetailsActivity1.class);
                intent1.putExtra("price1", "2000");
                startActivity(intent1);
            }
        });

    }
}
