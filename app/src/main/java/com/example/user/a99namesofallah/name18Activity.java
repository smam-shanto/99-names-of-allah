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

public class name18Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name18 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alfattah );
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
        String sera = "আল-ফাত্তাহ় - যিনি বিদ্যা,বুদ্ধি,রুজি ইত্যাদীর বন্ধ দরোজা খুলেদেন।" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                        " +
                "যে ব্যক্তি ফজর নামাজের পর উভয় হাত বুকের উপর বেঁধে ৭০ বার এ নাম পাঠ করবে," +
                "ইনশাআল্লাহ্‌ তার অন্তর ঈমানের নূরে দীপ্তিমান হয়ে থাকবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinwq);
        String wsera = "The Supreme Solver;                                                           " +
                "The Opener, The Reliever, The Judge, The One who opens for His slaves the closed worldly and religious matters." +

                "\n";

        textView.setText(wsera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
