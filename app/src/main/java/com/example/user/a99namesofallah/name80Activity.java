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

public class name80Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name80 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.attawwab );
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
        String sera = "আত-তাওয়াব - তিনি তওবা কবুল কারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                            " +
                "যে ব্যক্তি চাশতের নামাযের পর তিনশ ষাট বার এ নাম পাঠ করবে, ইনশাআল্লাহ্‌ তার সত্যিকার তওবা নসীব হবে  ।" +
                "বেশী পরিমাণে এ নাম পাঠ করলে, সমস্ত কাজ সহজ হবে  । \n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinvvm);
        String sawera = "The Ever-Acceptor of Repentance;                                                            " +
                "The Relenting, The One who grants repentance to whoever He willed among His creatures and accepts his repentance." +

                "\n";

        textView.setText(sawera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
