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

public class name27Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name27 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.albasir );
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
        String sera = "আল-বাসী়র - সব কিছু যিনি দেখেন" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                        " +
                "যে ব্যক্তি জুম্মার নামাযের পর একশবার এ নাম পাঠ করবে, আল্লাহ্‌ তা'য়ালা তার দৃষ্টিতে জ্যােতি এবং অন্তরে নূর পয়দা করে দিবেন ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinnn);
        String sewaera = "The All-Seeing;                                                               " +
                "The All-Noticing, The One who Sees all things that are seen by His Eternal Seeing without a pupil or any other instrument." +

                "\n";

        textView.setText(sewaera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
