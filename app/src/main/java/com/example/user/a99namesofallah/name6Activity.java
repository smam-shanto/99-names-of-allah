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

public class name6Activity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name6 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almumin );
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
        String sera = "আল-মু’মিন - একমাত্র নিরাপত্তা দান কারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);
        String pera = "\n" +
                "\n" +
                "ফজিলতঃ                                                                                                                                          " +
                "যে ব্যক্তি কোন ভয়ের সময়ে ৬৩০ বার এ নাম পাঠ করবে, আল্লাহ্‌ তাকে সমস্ত ভয় ও ক্ষতি থেকে রক্ষা করবেন এবং লিখে সাথে রাখলে" +
                "আল্লাহ্‌ পাক তাকে জাহেরী-বাতেনী নিরাপত্তা দান করবেন।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageink);
        String iera = "The Infuser of Faith;                                                         " +
                "The One who witnessed for Himself that no one is God but Him. And He witnessed for His believers that they are truthful ." +

                "\n";

        textView.setText(iera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
