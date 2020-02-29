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

public class name3Activity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name3 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almalik );
        Button playmp = (Button) this.findViewById( R.id.buttonplay );

        playmp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catMP.start();
            }
        } );


        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );






        textView = (TextView) findViewById( R.id.messagest);
        String sera = "আল-মালিক - রাজাধিরাজ" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagein);
        String pera = "\n" +
                "\n" +
                "ফজিলতঃ                                                                                                                                           " +
                "যে ব্যক্তি প্রত্যেক ফজর বাদ অধিক পরিমাণে পাঠ করবে, আল্লাহ্‌ পাক তাকে ধনী করে দেবেন।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinx);
        String zera = "The Eternal Lord;                                                             " +
                "The Sovereign Lord, The One with the complete Dominion, the One Whose Dominion is clear from imperfection" +

                "\n";

        textView.setText(zera);
        textView.setMovementMethod(new ScrollingMovementMethod());


    }

}
