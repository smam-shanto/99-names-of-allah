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

public class name36Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name36 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alali );
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
        String sera = "আল-’আলিই - অতি বড় মহানُ" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = " \n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                              " +
                "যে ব্যক্তি এ নাম সর্বদা পাঠ করবে এবং লিখে নিজের কাছে রাখবে, ইনশাআল্লাহ্‌ সে অত্যন্ত সম্মান, স্বাচ্ছন্দ্য ও সফল হওয়ার সৌভাগ্য অর্জন করবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinlop);
        String oosera = "The Sublime One;                                                                  " +
                " The Most High, The One who is clear from the attributes of the creatures." +

                "\n";

        textView.setText(oosera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
