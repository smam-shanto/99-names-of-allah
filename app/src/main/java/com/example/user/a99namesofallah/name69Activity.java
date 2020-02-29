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

public class name69Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name69 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alqadir );
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
        String sera = "আল-ক্বদির - শক্তিমান" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                        " +
                "যে ব্যক্তি দু'রাকাত নামায পড়ে একশ বার (আল কাদিরু) পাঠ করবে, আল্লাহ্‌ তার শত্রুকে লাঞ্ছিত অপদস্ত করে দেবেন ।" +
                "যদি কঠিন কোন কাজে কঠিন বাধা এসে যায়, তাহলে এ নাম পাঠ করলে সে কঠিন কাজ সহজ হয়ে যাবে এবং কঠিন বাধা অপসারিত হবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinaass);
        String serqwea = "The Omnipotent One;                                                                        " +
                "The Able, The Capable, The One attributed with Power." +

                "\n";

        textView.setText(serqwea);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
