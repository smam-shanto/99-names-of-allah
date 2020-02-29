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

public class name40Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name40 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alhasib );
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
        String sera = "আল-হাসীব - সবার হিসাব গ্রহনকারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                            " +
                "যে কোন ব্যক্তি বা জিনিসের ভয়ে ভীত হবে সে বৃহস্পতিবার থেকে শুরু করে আট দিন পর্যন্ত সকাল সন্ধ্যায় সত্তর বার করে পাঠ করবে, সে সকল জিনিষের অনিষ্ঠ থেকে নিরাপদ থাকবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinllb);
        String sbbaera = "The Reckoning One;                                                                \n" +
                "The Reckoner, The One who gives the satisfaction.\n" +

                "\n";

        textView.setText(sbbaera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
