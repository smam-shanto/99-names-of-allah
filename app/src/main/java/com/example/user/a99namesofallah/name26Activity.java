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

public class name26Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name26 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.assami );
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
        String sera = "আস-সামী’ - যিনি সবকিছু শুনেন" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                           " +
                "যে ব্যক্তি বৃহস্পতিবার চাশতের নামাযের পর পাঁচশ, অথবা একশ কিংবা ৫০ বার 'ইয়া সামী'উ নামটি পাঠ করবে," +
                "ইনশাআল্লাহ্‌ তার দোয়া আল্লাহ্‌ পাক কবুল করবেন। এ নাম পাঠ করার মাঝে কারোর সাথে কোন কথা বলা যাবে না ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinhg);
        String sseera = "The All-Hearer;                                                               " +
                "The Hearer, The One who Hears all things that are heard by His Eternal Hearing without an ear, instrument or organ." +

                "\n";

        textView.setText(sseera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
