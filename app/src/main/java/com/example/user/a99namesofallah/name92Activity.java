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

public class name92Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name92 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.annafi );
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
        String sera = "আন-নাফি’ - লাভ দান কারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                " +
                "যে ব্যক্তি বা অন্য কোন যানবাহনে উঠে অধিক পরিমাণে পড়বে, সে ইনশাআল্লাহ্‌ সকল বিপদ থেকে মুক্ত থাকবে ।" +
                "যে ব্যক্তি স্ত্রীর সাথে মিলনের সময় এ নাম পাঠ করবে, ইনশাআল্লাহ্‌ তার সন্তান নেককার হবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinvft);
        String sevvqra = "The Bestower of Benefits;                                                                  " +
                "The Propitious, The One who makes harm reach to whoever He willed and benefit to whoever He willed." +

                "\n";

        textView.setText(sevvqra);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
