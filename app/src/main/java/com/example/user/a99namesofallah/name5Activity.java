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

public class name5Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name5 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.assalam );
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
        String sera = "আস-সালাম - একমাত্র শান্তি দান কারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +
                "ফজিলতঃ                                                                                                                                             " +
                "যে ব্যক্তি এ নাম অধিক পরিমাণে পাঠ করবে," +
                "সে সকল প্রকার বিপদ থেকে মুক্ত থাকবে।" +
                "১১৫ বার এ নাম পাঠ করে পীড়িত ব্যক্তির গায়ে ফুঁ দিলে আল্লাহ্‌ পাক তাকে শেফা দান করবেন।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinp);
        String oera = "The Embodiment of Peace;                                                      " +
                "The One who is free from every imperfection." +

                "\n";

        textView.setText(oera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
