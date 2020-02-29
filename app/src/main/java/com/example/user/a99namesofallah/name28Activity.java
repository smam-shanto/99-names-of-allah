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

public class name28Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name28 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alhakam );
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
        String sera = "আল-হা়কাম - একমাত্র আদেশ দানকারী ও আইন প্রণেতা" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                           " +
                "যে ব্যক্তি শেষ রাত্রে অজু অবস্থায় নিরানব্বই বার এ নাম পাঠ করবে, আল্লাহ্‌ পাক তার অন্তরকে ভেদ ও নূর দ্বারা ভরে দিবেন।" +
                "আর যে ব্যক্তি জুম্মার রাতে এ নাম পড়তে পড়তে প্রায় জ্ঞানহারা হয়ে যাবে, আল্লাহ্‌ পাক তার কলবে 'এলহাম' দান করবেন ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinaa);
        String asera = "The Impartial;                                                                  \n" +
                "Judge The Judge, He is the Ruler and His judgment is His Word." +

                "\n";

        textView.setText(asera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
