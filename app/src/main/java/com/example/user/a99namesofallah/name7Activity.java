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

public class name7Activity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name7 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almuhaymin );
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
        String sera = "আল-মুহাইমিন - একমাত্র রক্ষণাবেক্ষণকারীُ" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +
                "ফজিলতঃ                                                                                                                                               " +
                "যে ব্যক্তি গোসল করে দু'রাকাত নামায পড়ে ১০০ বার এ নাম পাঠ করবে, আল্লাহ্‌ তার জাহের-বাতেন পবিত্র করে দেবেন।" +
                "যে ব্যক্তি ১১৫ বার পাঠ করবে সে লুকানো জিনিসের কথা জানতে পারবে।" +
                "যে ব্যক্তি ফজরবাদ ৪১ বার পাঠ করবে, তার কারোর ওপর নির্ভর করতে হবে না এবং অপমানের পর সম্মান লাভ করবে।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinc);
        String uera = "The Preserver of Safety;                                                      " +
                "The One who witnesses the saying and deeds of His creatures" +

                "\n";

        textView.setText(uera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
