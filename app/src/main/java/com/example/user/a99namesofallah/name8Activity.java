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

public class name8Activity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name8 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alaziz );
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
        String sera = "আল-’আযীয - মহা সন্মানিত" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);
        String pera = " \n" +
                "\n" +
                "ফজিলতঃ                                                                                                                                               " +
                "যে ব্যক্তি ৪০ দিন ৪০ বার এ নাম পরবে, আল্লাহ্‌ পাক তাকে শক্তিমান ও অন্যের অমুখাপেক্ষী করে দিবেন।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinv);
        String yera = "The Mighty One;                                                               " +
                "The Strong, The Defeater who is not defeated" +

                "\n";

        textView.setText(yera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
