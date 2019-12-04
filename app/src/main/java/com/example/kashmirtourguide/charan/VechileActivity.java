package com.example.kashmirtourguide.charan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.kashmirtourguide.DatabaseRestaurants;
import com.example.kashmirtourguide.Location;
import com.example.kashmirtourguide.MainActivity;
import com.example.kashmirtourguide.R;

import java.util.ArrayList;

public class VechileActivity extends AppCompatActivity implements ListAdapter1.customButtonListener1 {

    DatabaseRestaurants myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);

        myDb = new DatabaseRestaurants(this);
        Toolbar toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Vechiles");
        //View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> attraction = new ArrayList<Location>();
        attraction.add(new Location(R.string.two_wheelers,
                R.string.lalit_grand_palace_address, R.drawable.twowheel));
        attraction.add(new Location(R.string.four_wheelers,
                R.string.jamal_resorts_address, R.drawable.fourwheel));


        ListAdapter1 adapter = new ListAdapter1(this, attraction);

        ListView listView = (ListView) findViewById(R.id.list);
        adapter.setCustomButtonListner(VechileActivity.this);
        //adapter.setCustomListener1(HotelActivity.this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Intent intent = new Intent(VechileActivity.this, VechileIntent.class);
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    intent.putExtra("position",position);
                    startActivity(intent);

                } else if (position == 1) {
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

            }
        });


        // return rootView;
    }
    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        Intent intent = new Intent(VechileActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
       // super.onBackPressed();  // optional depending on your needs
    }
    @Override
    public void onButtonClickListner(int position) {
        if (position == 0) {
           // Toast.makeText(VechileActivity.this, "Opening Lalit Grand Palace", Toast.LENGTH_SHORT).show();
         //   startActivity(new Intent(VechileActivity.this, BookActivity.class));;
            Intent intent = new Intent(VechileActivity.this,BookDetails.class);
            intent.putExtra("price","800" );
            intent.putExtra("price1","1200" );
            intent.putExtra("price2","2000" );


            startActivity(intent);


        } else if (position == 1) {
           // Toast.makeText(VechileActivity.this, , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(VechileActivity.this,BookDetails1.class);
            intent.putExtra("price","10000" );
            intent.putExtra("price1","15000" );
            intent.putExtra("price2","25000" );


            startActivity(intent);


        }
    }

}
