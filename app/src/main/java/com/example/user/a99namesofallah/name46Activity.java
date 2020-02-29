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

public class name46Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name46 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alhakim );
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
        String sera = "আল-হাকীম - সর্বশ্রেষ্ঠ জ্ঞানী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                         " +
                "যে ব্যক্তি এ নাম পাঠ করবে, আল্লাহ্‌ পাক তার নিকট হেকমতের দরজা খুলে দেবেন ।" +
                "যে ব্যক্তির কোন কাজ পুরো হতে চায় না, সে যদি এ নাম পড়তে থাকে, তাহলে সেই কাজ পুরো হয়ে যাবে ইনশাআল্লাহ্‌  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinju);
        String settra = "The Wise One;                                                                    " +
                " The Wise, The Judge of Judges, The One who is correct in His doings." +

                "\n";

        textView.setText(settra);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
