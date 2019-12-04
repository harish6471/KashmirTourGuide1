package com.example.kashmirtourguide.charan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kashmirtourguide.DatabaseRestaurants;
import com.example.kashmirtourguide.Location;
import com.example.kashmirtourguide.MainActivity;
import com.example.kashmirtourguide.R;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity implements ListAdapter1.customButtonListener1 {

    DatabaseRestaurants myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);

        myDb = new DatabaseRestaurants(this);
        Toolbar toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Hotels");
        //View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Location> attraction = new ArrayList<Location>();
        attraction.add(new Location(R.string.lalit_grand_palace,
                R.string.lalit_grand_palace_address, R.drawable.lalitgrandpalace));
        attraction.add(new Location(R.string.jamal_resorts,
                R.string.jamal_resorts_address, R.drawable.jamalresorts));

        attraction.add(new Location(R.string.ahdoos,
                R.string.ahdoos_address, R.drawable.ahdoos));
        attraction.add(new Location(R.string.mughal_darbar,
                R.string.mughal_darbar_address, R.drawable.mughaldarbar));
        attraction.add(new Location(R.string.cloves_restaurant,
                R.string.cloves_restaurant_address, R.drawable.cloves));
        attraction.add(new Location(R.string.vivanta,
                R.string.vivanta_address, R.drawable.vivanta));
        attraction.add(new Location(R.string.the_orchard,
                R.string.the_orchard_address, R.drawable.theorchad));


        ListAdapter1 adapter = new ListAdapter1(this, attraction);

        ListView listView = (ListView) findViewById(R.id.list);
        adapter.setCustomButtonListner(HotelActivity.this);
        //adapter.setCustomListener1(HotelActivity.this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=lalit grand palace"));
                    startActivity(intent);
                } else if (position == 1) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=jamal resorts nishat"));
                    startActivity(intent);
                } else if (position == 2) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=stream restaurant boulevard road"));
                    startActivity(intent);
                } else if (position == 3) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=ahdoos hotel srinagar"));
                    startActivity(intent);
                } else if (position == 4) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=mughal darbar residency road"));
                    startActivity(intent);
                } else if (position == 5) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=cloves restaurant gulmarg"));
                    startActivity(intent);
                } else if (position == 6) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Vivanta By taj srinagar"));
                    startActivity(intent);
                } else if (position == 7) {
                    Toast.makeText(HotelActivity.this, "Showing in Maps", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=the orchad retreat and spa zukura srinagar"));
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
        Intent intent = new Intent(HotelActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
       // super.onBackPressed();  // optional depending on your needs
    }
    @Override
    public void onButtonClickListner(int position) {
        if (position == 0) {
            Toast.makeText(HotelActivity.this, "Opening Lalit Grand Palace", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity   .class));;

       /* Cursor res = myDb.getAllData0();
        if (res.getCount() == 0) {
            showMessage("Error", "Nothing found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append("Title: Lalit Grand Palace \n");
        while (res.moveToNext()) {
            buffer.append("Review : " + res.getString(2) + "\n");
        }
        showMessage("Data", buffer.toString());*/
        } else if (position == 1) {
            Toast.makeText(HotelActivity.this, "Opening Jamal Resorts", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity.class));;

        /*Cursor res = myDb.getAllData1();
        if (res.getCount() == 0) {
            showMessage("Error", "Nothing found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append("Title: Jamal Resorts \n");

        while (res.moveToNext()) {
            buffer.append("Review : " + res.getString(2) + "\n");

        }
        showMessage("Data", buffer.toString());*/
        } else if (position == 2) {
            Toast.makeText(HotelActivity.this, "Opening Stream", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity.class));;

        } else if (position == 3) {
            Toast.makeText(HotelActivity.this, "Opening Ahdoos", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity.class));;


        } else if (position == 4) {
            Toast.makeText(HotelActivity.this, "Opening Mughal Darbar", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity.class));;


        } else if (position == 5) {
            Toast.makeText(HotelActivity.this, "Opening  Cloves Restaurant", Toast.LENGTH_SHORT).show();

        } else if (position == 6) {
            Toast.makeText(HotelActivity.this, "Opening Vivanta", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity.class));;

        } else if (position == 7) {
            Toast.makeText(HotelActivity.this, "Opening Orchard", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HotelActivity.this, BookActivity.class));;


        }
    }

}
