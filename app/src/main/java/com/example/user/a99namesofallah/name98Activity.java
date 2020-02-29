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

public class name98Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name98 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.arrashid );
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
        String sera = "আর-রশীদ - তিনি সত্য" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                       " +
                "যে ব্যক্তি কোন কাজ বা মক্সুদ হাসিলের তদবির সম্পর্কে কি করনীয় তা বুঝতে অক্ষম হয়ে পড়ে, সে মাগরিব ও এশার মধ্যবর্তী সময়ে এক হাজার " +
                "বার পাঠ করবে। এতে করে তা বুঝতে সক্ষম হবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinooqp);
        String settra = "The Guide to Path of Rectitude;                                                             " +
                "The Guide to the Right Path, The One who guides." +

                "\n";

        textView.setText(settra);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
