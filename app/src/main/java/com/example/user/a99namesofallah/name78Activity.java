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

public class name78Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name78 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almutaali );
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
        String sera = "আল-মুতা’আলী - সর্বোচ্চ ক্ষমতাবান" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                               " +
                "যে ব্যক্তি অধিক পরিমাণে এই নাম পাঠ করবে, ইনশাআল্লাহ্‌ তার যাবতীয় সংকট দূরীভূত হয়ে যাবে  ।" +
                "যে স্ত্রীলোক হায়েজ অবস্থায় এ নাম পড়বে, ইনশাআল্লাহ্‌ তার কোন কষ্ট হবে না  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinbhy);
        String serccva = "The Extremely Exalted One;                                                                " +
                "The Most Exalted, The High Exalted, The One who is clear from the attributes of the creation." +

                "\n";

        textView.setText(serccva);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
