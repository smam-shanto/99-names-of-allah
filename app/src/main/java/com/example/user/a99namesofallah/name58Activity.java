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

public class name58Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name58 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almubdi );
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
        String sera = "আল-মুব্দি’ - সব বস্তুর প্রথম শ্রষ্টাُ" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                " +
                "যে ব্যক্তি সেহেরীর সময় গর্ভবতী নারীর পেতের উপর হাত রেখে নিরানব্বই বার এ নাম পাঠ করবে, ইনশাআল্লাহ্‌" +
                "তার গর্ভপাত এবং নির্দিষ্ট সময়ের পূর্বে সন্তান প্রসব হবে না  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinqwe);
        String seraop = "The Originator;                                                                     " +
                "The One who started the human being. That is, He created him." +

                "\n";

        textView.setText(seraop);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
