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

public class name16Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name16 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alwahhab );
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
        String sera = "আল-ওয়াহ্হাব - অনেক বড় দাতা" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                              " +
                "যে ব্যক্তি অনাহার ও দারিদ্রের মধ্যে দিন কাটায়, সে যদি এ নাম পাঠ করে কিংবা লিখে সাথে রাখে, অথবা চাশত নামাজের শেষ সেজদায়" +
                "৪০ বার পড়ে, তাহলে আল্লাহ্‌ তার অভাব দূর করে দেবেন। তা দেখে মানুষ হতবাক হয়ে যাবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinas);
        String asera = "The Supreme Bestower;                                                           " +
                "The One who is Generous in giving plenty without any return. He is everything that benefits whether Halal or Haram." +

                "\n";

        textView.setText(asera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
