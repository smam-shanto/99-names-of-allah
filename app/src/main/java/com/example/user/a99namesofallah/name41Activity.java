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

public class name41Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name41 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.aljalil );
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
        String sera = "আল-জালীল - অতি বড় মর্যাদাশালী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                     " +
                "যে ব্যক্তি মেশক ও জাফরান দ্বারা এ নাম লিখেনিজের কাছে রাখবে এবং অধিক পরিমাণে পাঠ করতে করতে শরণ করবে, " +
                "আল্লাহ্‌ তাকে আলেম,ছালেহ লকদের মধ্যে সম্মান দান করবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinbbn);
        String szcera = "The Majestic One;                                                                    \n" +
                "The Sublime One, The Beneficent, The One who is attributed with greatness of Power and Glory of status.\n" +

                "\n";

        textView.setText(szcera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

    }

