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

public class name2Activity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name2 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.arrahim );
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







        textView = (TextView) findViewById(R.id.messagest);
        textView = (TextView) findViewById( R.id.messagest);
        String sera = "আর-রহীম - পরম দাতা ও দয়ালু" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                           " +
                "" +
                "যে ব্যক্তি দৈনিক প্রত্যেক নামাজের পরে ১০০ বার পরবে আল্লাহতালা দুনিয়াবিদ বালা মসিবত দূর করে দিবেন" +
                "এই নাম লিকিয়া পানিতে ধুইয়া সেই পানি গাছের গোড়ায় ঢালিয়া দিলে সে গাছে বেশী ফল ধরিবে\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messageina);
        String aera = "The Merciful;                                                          " +
                "He who acts with extreme kindness" +

                "\n";

        textView.setText(aera);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
    }


