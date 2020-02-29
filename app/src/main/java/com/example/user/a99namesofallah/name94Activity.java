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

public class name94Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name94 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alhadi );
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
        String sera = "আল-হাদী - তিনি পথ দেখান বা হিদায়াত দানকারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                         " +
                "যে ব্যক্তি আসমানের দিকে মুখ করে দুহাত তুলে অধিক পরিমাণে পাঠ করবে এবং সবশেষে চেহারার উপর ফিরাবে, ইনশাআল্লাহ্‌ " +
                "সে পরিপূর্ণ হেদায়াত এবং মারেফাত লাভের সৌভাগ্য অর্জন করবে।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinzaq);
        String sercba = "The Provider of Guidance;                                                                 " +
                "The Guide, The One whom with His Guidance His believers were guided, and with His Guidance the living beings have been guided " +

                "\n";

        textView.setText(sercba);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
