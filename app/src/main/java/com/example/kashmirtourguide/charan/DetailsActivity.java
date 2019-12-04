package com.example.kashmirtourguide.charan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kashmirtourguide.R;

import java.util.Timer;
import java.util.TimerTask;

public class DetailsActivity extends Activity {

    TextView menu, htv, btv, ftv, rtv, fitv, dtv,txt1;
    TextView hptv, bptv, fptv, rptv, fiptv, dptv;
    String choices = "";
    String prices, usd_price_string;
    double usd_price = 0;
    Button nm;
    private static final int TEZ_REQUEST_CODE = 123;

    private static final String GOOGLE_TEZ_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";



    //removing button

    Button rm_biriyani, rm_haleem, rm_fried, rm_firni, rm_plain, rm_drinks, order;

    int bp = 0, hp = 0, pp = 0, drp = 0, frp = 0, fip = 0;
    int tbp = 0, thp = 0, tpp = 0, tdrp = 0, tfrp = 0, tfip = 0;
    int total = 0;

    // Paytm paytm;
    Button paymemt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        menu = findViewById(R.id.menuTv);
        btv = findViewById(R.id.nm_textView);


       nm = (Button) findViewById(R.id.nm_button);

        // removing button identifing

        rm_biriyani = (Button) findViewById(R.id.nm_button_rm);
        txt1 = findViewById(R.id.txt);

        /// order Button

        order = (Button) findViewById(R.id.order_button);


        bptv = findViewById(R.id.nm_price);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEZ_REQUEST_CODE) {
            // Process based on the data in response.
            Log.d("result", data.getStringExtra("Status"));
        }
    }



    public void place_order(View view) {

        balancesheet();
        Intent i = new Intent(DetailsActivity.this, RegisteredDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choice_iteams", choices);
        bundle.putString("bdt_price", prices);
        bundle.putString("usd_price", usd_price_string);
        i.putExtras(bundle);
        startActivity(i);
        choices = "";
    }


    @SuppressLint("ResourceAsColor")
    public void add_to_list(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();


         if (view == findViewById(R.id.nm_button)) {
            Toast.makeText(this, "Rooms added", Toast.LENGTH_SHORT).show();
            // = (choices+"\nBiriyani\t (1) plate.").toString();
            bp = bp + 1;

             txt1.setText(Integer.toString(bp));
             txt1.setTextColor(R.color.primary_color);



        }
    }

    // removing iteam

    @SuppressLint("ResourceAsColor")
    public void rmv_from_list(View view) {
        //SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //SharedPreferences.Editor editor = prefs.edit();

  if (view == findViewById(R.id.nm_button_rm)) {

            // = (choices+"\nBiriyani\t (1) plate.").toString();
            if (bp > 0) {
                bp = bp - 1;

                txt1.setText(Integer.toString(bp));
                txt1.setTextColor(R.color.primary_color);
                Toast.makeText(this, "Rooms Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Rooms First", Toast.LENGTH_SHORT).show();

        }

    }

    public void balancesheet() {
        tbp = bp * 2000;

        total = tbp ;
        usd_price = total / 80;
        prices = Integer.toString(total);
        usd_price_string = Double.toString(usd_price);

        if (bp > 0) {
            choices = choices + "Normal Room       (" + bp + " x 2000) = " + tbp;
        }






    }

    public void banner_about(View view) {

        final Dialog dialog = new Dialog(this); // Context, this, etc.
      //  dialog.setContentView(R.layout.about_dialoug);
        dialog.setTitle("About Developer");
        dialog.show();



        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            public void run() {
                dialog.dismiss(); // when the task active then close the dialog
                t.cancel(); // also just top the timer thread, otherwise, you may receive a crash report
            }
        }, 800000);
    }
}


