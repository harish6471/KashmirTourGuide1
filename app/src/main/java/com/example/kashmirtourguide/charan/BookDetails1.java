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

public class BookDetails1 extends Activity {

    TextView menu, htv, btv, ftv, rtv, fitv, dtv,txt1,txt2,txt3;
    TextView hptv, bptv, fptv, rptv, fiptv, dptv;
    String choices = "";
    String prices, usd_price_string;
    double usd_price = 0;
    Button innova, jeep, tb1;
    private static final int TEZ_REQUEST_CODE = 123;

    private static final String GOOGLE_TEZ_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";



    //removing button

    Button rm_innova, rm_jeep, rm_tb1, order;

    int bp = 0, hp = 0, pp = 0, drp = 0, frp = 0, fip = 0;
    int tbp = 0, thp = 0, tpp = 0, tdrp = 0, tfrp = 0, tfip = 0;
    int total = 0;

    // Paytm paytm;
    Button paymemt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details1);

        menu = findViewById(R.id.menuTv);
        htv = findViewById(R.id.jeep_textView);
        btv = findViewById(R.id.innova_textView);
        ftv = findViewById(R.id.tb1_textView);
//button of iteams add

        innova = (Button) findViewById(R.id.innova_button);
       jeep = (Button) findViewById(R.id.jeep_button);
        tb1 = (Button) findViewById(R.id.tb1_button);

        // removing button identifing

        rm_innova = (Button) findViewById(R.id.innova_button_rm);
        rm_jeep = (Button) findViewById(R.id.jeep_button_rm);
        rm_tb1 = (Button) findViewById(R.id.tb1_button_rm);


        /// order Button

        order = (Button) findViewById(R.id.order_button);

        txt1 = findViewById(R.id.txt);
        txt2 = findViewById(R.id.txt1);
        txt3 = findViewById(R.id.txt3);
        hptv = findViewById(R.id.jeep_price);
        bptv = findViewById(R.id.innova_price);
        fptv = findViewById(R.id.tb1_price);
       /* Typeface french_font = ResourcesCompat.getFont(this, R.font.french);
        Typeface gatholic = ResourcesCompat.getFont(this, R.font.gatholic);

        menu.setTypeface(french_font);

        htv.setTypeface(french_font);
        btv.setTypeface(french_font);
        ftv.setTypeface(french_font);
        rtv.setTypeface(french_font);
        fitv.setTypeface(french_font);
        dtv.setTypeface(french_font);


        hptv.setTypeface(gatholic);
        bptv.setTypeface(gatholic);
        fptv.setTypeface(gatholic);
        rptv.setTypeface(gatholic);
        fiptv.setTypeface(gatholic);
        dptv.setTypeface(gatholic);*/

        // setting order button font

        //  order.setTypeface(gatholic);
       /* paymemt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Uri uri =
                    new Uri.Builder()
                            .scheme("upi")
                            .authority("pay")
                            .appendQueryParameter("pa", "kishorec111-2@oksbi")
                            .appendQueryParameter("pn", "Test Merchant")
                            .appendQueryParameter("mc", "1234")
                            .appendQueryParameter("tr", "123456789")
                            .appendQueryParameter("tn", "test transaction note")
                            // .appendQueryParameter("am", "10.01")
                            .appendQueryParameter("cu", "INR")
                            .appendQueryParameter("url", "https://test.merchant.website")
                            .build();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                intent.setPackage(GOOGLE_TEZ_PACKAGE_NAME);
                startActivityForResult(intent, TEZ_REQUEST_CODE);
            }





        });*/

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
        Intent i = new Intent(BookDetails1.this, RegisteredDetails.class);
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


        if (view == findViewById(R.id.jeep_button)) {
            Toast.makeText(this, "Jeep added", Toast.LENGTH_SHORT).show();
            hp = hp + 1;

            //choices = (choices+"\nHaleem\t (1) Bowl.").toString();

            txt1.setText(Integer.toString(hp));
            txt1.setTextColor(R.color.primary_color);
        } else if (view == findViewById(R.id.innova_button)) {
            Toast.makeText(this, "Innova  added", Toast.LENGTH_SHORT).show();
            // = (choices+"\nBiriyani\t (1) plate.").toString();
            bp = bp + 1;

            txt2.setText(Integer.toString(bp));
            txt2.setTextColor(R.color.primary_color);

        } else if (view == findViewById(R.id.tb1_button)) {
            Toast.makeText(this, "Touring Bus Added", Toast.LENGTH_SHORT).show();
            //choices = (choices+"\nTikkas\t (1) pieces.").toString();
            frp = frp + 1;
            txt3.setText(Integer.toString(frp));
            txt3.setTextColor(R.color.primary_color);

        }

    }

    // removing iteam

    @SuppressLint("ResourceAsColor")
    public void rmv_from_list(View view) {
        //SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //SharedPreferences.Editor editor = prefs.edit();


        if (view == findViewById(R.id.jeep_button_rm)) {
            if (hp > 0) {

                hp = hp - 1;
                txt1.setText(Integer.toString(hp));
                txt1.setTextColor(R.color.primary_color);
                Toast.makeText(this, "Jeep Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Vehicles First", Toast.LENGTH_SHORT).show();

            //choices = (choices+"\nHaleem\t (1) Bowl.").toString();

        } else if (view == findViewById(R.id.innova_button_rm)) {

            // = (choices+"\nBiriyani\t (1) plate.").toString();
            if (bp > 0) {
                bp = bp - 1;

                txt2.setText(Integer.toString(bp));
                txt2.setTextColor(R.color.primary_color);
                Toast.makeText(this, "Innova Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Vehicles First", Toast.LENGTH_SHORT).show();

        } else if (view == findViewById(R.id.tb1_button_rm)) {

            //choices = (choices+"\nTikkas\t (1) pieces.").toString();

            if (frp > 0) {

                frp = frp - 1;
                txt3.setText(Integer.toString(frp));
                txt3.setTextColor(R.color.primary_color);
                Toast.makeText(this, "Touring Bus Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Add Vehicles First", Toast.LENGTH_SHORT).show();

        }

    }

    public void balancesheet() {
        tbp = bp * 15000;
        tfrp = frp * 30000;
        thp = hp * 10000;
        total = tbp +   thp +  tfrp;
        usd_price = total / 80;
        prices = Integer.toString(total);
        usd_price_string = Double.toString(usd_price);

        if (bp > 0) {
            choices = choices + "Innova       (" + bp + " x 15000) = " + tbp;
        }




        if (frp > 0) {
            choices = choices + "\n\nTouring Bus (" + frp + " x 30000) = " + tfrp;
        }
        if (hp > 0) {
            choices = choices + "\n\n Jeep    (" + hp + " x 10000) = " + thp;
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


