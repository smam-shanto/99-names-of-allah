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

public class name4Activity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name4 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alquddus );
        Button playmp = (Button) this.findViewById( R.id.buttonplay );

        playmp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catMP.start();
            }
        } );


        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );





        textView = (TextView) findViewById( R.id.messagest);
        String sera = "আল-ক্বুদ্দূস - সব ত্রুটি থেকে পবিত্র" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);
        String pera = "ُ\n" +
                "\n" +
                "ফজিলতঃ                                                                                                                                            " +
                "যে ব্যক্তি প্রত্যেক জাওয়ালের(দুপুরের সূর্য ঢলে যাওয়ার) পরে এ পবিত্র নাম বেশী করে পাঠ করলে," +
                "অন্তরে সমস্ত রূহানী ব্যাধি থেকে মুক্তি পাওয়া যাবে। \n" + "\n";

        textView.setText( pera );
        textView.setMovementMethod( new ScrollingMovementMethod() );

        textView = (TextView) findViewById( R.id.messageinw);
        String wera = "The Most Sacred;                                                              " +
                "The One who is pure from any imperfection and clear from children and adversaries" +

                "\n";

        textView.setText(wera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
