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

public class name10Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name10 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almutakabbir );
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
        String sera = "আল-মুতাকাব্বির - অহংকার এবং গৌরবের একমাত্র মালিক" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = " \n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                 " +
                "যে ব্যক্তি এ নাম বেশী পরিমাণে পড়বে, আল্লাহ্‌ তাকে লকচক্ষে বড় ও সম্মানী করে রাখবেন।" +
                "আর যদি প্রতি কাজের প্রথমে এ নাম অধিক মাত্রায় পড়তে থাকে, সে কাজে সফলতা লাভ করবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinb);
        String hera = "The Dominant One;                                                             " +
                "The One who is clear from the attributes of the creatures and from resembling them." +

                "\n";

        textView.setText(hera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
