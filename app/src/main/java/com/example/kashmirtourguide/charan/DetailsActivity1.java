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

public class DetailsActivity1 extends Activity {

    TextView menu, htv, btv, ftv, rtv, fitv, dtv,txt1;
    TextView hptv, bptv, fptv, rptv, fiptv, dptv;
    String choices = "";
    String prices, usd_price_string;
    double usd_price = 0;
    Button sm;
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
        setContentView(R.layout.activity_details1);

        menu = findViewById(R.id.menuTv);
        btv = findViewById(R.id.sm_textView);
       txt1 = findViewById(R.id.txt);


      sm = (Button) findViewById(R.id.sm_button);

        // removing button identifing

        rm_biriyani = (Button) findViewById(R.id.sm_button_rm);


        /// order Button

        order = (Button) findViewById(R.id.order_button);


        bptv = findViewById(R.id.sm_price);

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
        Intent i = new Intent(DetailsActivity1.this, RegisteredDetails.class);
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


        if (view == findViewById(R.id.sm_button)) {
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

        if (view == findViewById(R.id.sm_button_rm)) {

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
        tbp = bp * 3500;

        total = tbp ;
        usd_price = total / 80;
        prices = Integer.toString(total);
        usd_price_string = Double.toString(usd_price);

        if (bp > 0) {
            choices = choices + "Suit Rooms    (" + bp + " x 3500) = " + tbp;
        }






    }

    public void banner_about(View view) {

        final Dialog dialog = new Dialog(this); // Context, this, etc.
        //dialog.setContentView(R.layout.about_dialoug);
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


