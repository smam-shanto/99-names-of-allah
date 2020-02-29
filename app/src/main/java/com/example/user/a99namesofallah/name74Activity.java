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

public class name74Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name74 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alakhir );
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
        String sera = "আল-আখির - তিনিই অন্ত" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                   " +
                "যে ব্যক্তি রোজ এক হাজার বার (আল আখিরু) " +
                "পাঠ করবে, তার অন্তর থেকে ইনশাআল্লাহ্‌ , গায়রুল্লাহ্র মহব্বত দূর হয়ে যাবে এবং সমগ্র জীবনের গোনাহ কাফফারা হবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinhhu);
        String serwwa = "The Infinite Last One;                                                                        " +
                "The Last, The One whose Existence is without an end." +

                "\n";

        textView.setText(serwwa);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
