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

public class name22Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name22 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alkhafid );
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
        String sera = "আল-খাফিদ - তিনি অবস্থার অবনতি করেন" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                           " +
                "যে ব্যক্তি রোজ পাঁচশ বার এ নাম পড়বে, আল্লাহ্‌ পাক তার অভাব অনটন পূরণ করে দেবেন, যাবতীয় মুশকিল দূর করে দেবেন।" +
                "আর যে ব্যক্তি ৩টি রোযা রাখবে এবং ৪র্থ এক জায়গায় বসে ৭০ বার এ নাম পড়বে, ইনশাআল্লাহ্‌ সে শত্রুর বিরুদ্ধে জয়লাভ করবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messageingf);
        String sbera = "The Reducer;                                                                   " +
                "The Abaser, The One who lowers whoever He willed by His Destruction and raises whoever He willed by His Endowment." +

                "\n";

        textView.setText(sbera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
