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

public class name99Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name99 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.assabur );
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
        String sera = "আস-সবূর - তিনি ধৈর্যশীল" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                            " +
                "যে ব্যক্তি সূর্যোদয়ের পূর্বে একশ বার এ নাম পাঠ করেন, সে ঐ দিন যাবতীয় বিপদ থেকে নিরাপদ থাকবে এবং দুশমন ও হিংসুকের মুখ বন্ধ থাকবে  ।" +
                "যে ব্যক্তি স্ত্রীর সাথে মিলনের সময় এ নাম পাঠ করবে, ইনশাআল্লাহ্‌ তার সন্তান নেককার হবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinsdk);
        String separa = "The Extensively Enduring One;                                                                " +
                "The Patient, The One who does not quickly punish the sinners." +

                "\n";

        textView.setText(separa);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
