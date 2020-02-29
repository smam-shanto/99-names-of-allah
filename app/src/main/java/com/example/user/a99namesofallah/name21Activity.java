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

public class name21Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name21 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.albasit );
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
        String sera = "আল-বাসিত - যিনি প্রশস্ত বা বড় করেন" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                          " +
                "যে ব্যক্তি চাশতের নামাজের পর আসমানের দিকে হাত তুলে রোজ দশ বার এ নাম পড়বে এবং মুখমণ্ডলে হাত ফিরাবে," +
                "আল্লাহ্‌ তাকে ধনী করে দেবেন, সে আর অন্যের মুখাপেক্ষী হবে না ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinzx);
        String sqaera = "The Extender;                                                                   " +
                "The Englarger, The One who constricts the sustenance by His wisdom and expands and widens it with His Generosity and Mercy." +

                "\n";

        textView.setText(sqaera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
