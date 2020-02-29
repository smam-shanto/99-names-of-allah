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

public class name38Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name38 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alhafiz );
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
        String sera = "আল-হ়াফীয - সবকিছু সংরক্ষণকারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = " ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                              " +
                "যে ব্যক্তি অনেক পরিমাণে পাঠ করবে এবং লিখে নিজের কাছে রাখবে, সে ইনশাআল্লাহ্‌ অবশ্যই সকল প্রকার ভয়-ভীতি ও বিপদের হাত থেকে রক্ষা পাবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinvfr);
        String xasera = "The Guarding One;                                                                   \n" +
                "The Preserver, The Protector, The One who protects whatever and whoever He willed to protect.\n" +

                "\n";

        textView.setText(xasera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
