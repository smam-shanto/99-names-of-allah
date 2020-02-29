package com.example.user.a99namesofallah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class name95Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name95 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.albadi );
        Button playmp = (Button) this.findViewById( R.id.buttonplay );

        playmp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catMP.start();
            }
        } );


        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        textView = (TextView) findViewById( R.id.messagest);
        String sera = "আল-বাদী’ - প্রথম অস্তিত্ব দানকারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                             " +
                "যে ব্যক্তি কোন দুঃখ যন্ত্রণা বা বালা মসিবতে পতিত হয়, সে এক হাজার বার পাঠ করবে, ইনশাআল্লাহ্‌ সে মুক্তি পাবে  ।" +
                "যে ব্যক্তি এ নাম অজু অবস্থায় পড়তে পড়তে শয়ন করবে, সে যে কাজের কথা চিন্তা করবে তা স্বপ্নে দেখতে পাবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinkkl);
        String sdfgera = "The Unique One;                                                                          " +
                "The Incomparable, The One who created the creation and formed it without any preceding example." +

                "\n";

        textView.setText(sdfgera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
