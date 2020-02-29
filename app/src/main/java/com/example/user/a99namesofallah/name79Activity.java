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

public class name79Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name79 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.albarr );
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
        String sera = "আল-বার্র - পরম বন্ধু" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                      " +
                "যে ব্যক্তি মদ্যপান, ব্যভিচার ইত্যাদির ন্যয় দুষ্কর্মে লিপ্ত, সে যদি প্রত্যহ সাত বার এই নাম পাঠ করে, তাহলে ইনশাআল্লাহ্‌ তার দুষ্কর্মের ইচ্ছা ও প্রবণতা দ্রুত কমে যাবে ।" +
                " \n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinmap);
        String seuuytra = "The Fountain-Head of Truth;                                                               " +
                "The Source of All Goodness, The Righteous, The One who is kind to His creatures, who covered them with His sustenance and specified ." +

                "\n";

        textView.setText(seuuytra);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
