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

public class name70Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name70 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almuqtadir );
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
        String sera = "আল-মুক্বতাদির - সর্ব শক্তির উদ্ভাবক" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                          " +
                "যে ব্যক্তি শোয়া হতে উঠার পর অধিক মাত্রায় এ নাম পাঠ করতে থাকবে অথবা বিশ বার পাঠ করবে, ইনশাআল্লাহ্‌ তার সমস্ত কাজই সহজ এবং সুসম্পন্ন হবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinggt);
        String setora = "The All Authoritative One;                                                              " +
                "The Powerful, The Dominant, The One with the perfect Power that nothing is withheld from Him." +

                "\n";

        textView.setText(setora);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
