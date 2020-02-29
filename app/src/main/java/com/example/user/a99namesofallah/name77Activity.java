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

public class name77Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name77 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alwalii );
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
        String sera = "আল-ওয়ালি - তিনিই প্রথম অধিকার বিস্তারকারী বাদশাহُ" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                " +
                "যে ব্যক্তি অধিক মাত্রায় এ নাম পাঠ করবে, ইনশাআল্লাহ্‌ সে আকস্মিক বিপদ থেকে নিরাপদে থাকবে  ।" +
                "চীনা মাটির পাত্রে এ নাম লিখে তাতে পানি ভোরে বাড়িতে ছিটিয়ে দিলে যাবতীয় আপদ-বিপদ থেকে মুক্ত থাকবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinpopo);
        String serppqa = "The Holder of Supreme Authority;                                                          " +
                "The Governor, The One who owns things and manages them." +

                "\n";

        textView.setText(serppqa);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
