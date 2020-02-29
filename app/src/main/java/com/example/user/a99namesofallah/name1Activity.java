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
import android.widget.Toast;

public class name1Activity extends AppCompatActivity {
    TextView textView;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name1 );

        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.arrahman );
        Button playmp = (Button) this.findViewById( R.id.buttonplay );

        playmp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catMP.start();
            }
        } );

        textView = (TextView) findViewById( R.id.messagest);
        String sera = "আর-রহমান - অসীম দয়ালু" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);
        String pera = "\n" +
                "\n" +


                "ফজিলতঃ                                                                                                                                        " +
                "যে ব্যক্তি দৈনিক প্রত্যেক নামাজের পরে ১০০ বার পরবে তার অন্তর থেকে সকল প্রকার কর্কশতা ও গাফলতি দূর হবে।" +
                "অলসতা,গ্লানি ও ভ্রম দূর হয়।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinz);
        String qera = "The Beneficent;                                                           " +
                "He who wills goodness and mercy for all His creatures" +

                "\n";

        textView.setText(qera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

}
