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

public class name35Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name35 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.ashshakur );
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
        String sera = "আশ-শাকূর - সঠিক কর্ম সম্পাদনকারী,কৃতজ্ঞতার প্রতিদানকারি" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                          " +
                "যে ব্যক্তি আর্থিক অনটন কিংবা অন্য দুক্ষ-বেদনা বা কষ্টের মাঝে পতিত হয়, সে এ নাম প্রত্যহ ৪১ বার পাঠ করলে ইনশাআল্লাহ্‌, তা থেকে মুক্তি লাভ করবে।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinmju);
        String stvera = "The Acknowledging One;                                                             \n" +
                "The Grateful, The Appreciative, The One who gives a lot of reward for a little obedience.   \n" +


                "\n";

        textView.setText(stvera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
