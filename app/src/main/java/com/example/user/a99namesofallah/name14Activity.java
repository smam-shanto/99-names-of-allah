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

public class name14Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name14 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alghaffar );
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
        String sera = "আল-গফ্ফার - অনেক বড় ক্ষমাশীলُ" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                            " +
                "যে ব্যক্তি জুম্মার নামাজের পর ১০০ বার এ নাম পড়বে, তার ভিতর ক্ষমার প্রকাশ পরিলক্ষিত হতে থাকবে।" +
                "আর যে ব্যক্তি রোজ আছরের পরে(ইয়া গফফারু গফিরলী) পড়বে," +
                "ইনশাআল্লাহ্‌ সে খমাপ্রাপ্ত ব্যক্তিদের দলভুক্ত হবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinaa);
        String hera = "The Great Forgiver;                                                           " +
                "The Forgiver, The One who forgives the sins of His slaves time and time again." +

                "\n";

        textView.setText(hera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
