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

public class name48Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name48 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almajid );
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
        String sera = "আল-মাজীদ - সবচেয়ে সন্মানিত" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                     " +
                "যে ব্যক্তি কোন কষ্টদায়ক ব্যাধি, যথা গনোরিয়া, কুণ্ঠ ইত্যাদি দ্বারা আক্রান্ত হবে, সে ১৩,১৪ ও ১৫ তারিখ রোযা রাখবে " +
                "এবং ইফতারের পরে অধিক পরিমাণে এ নাম পাঠ করে পানিতে দম করে পান করবে, ইনশাআল্লাহ্‌ এতে করে সে আরোগ্য লাভ করবে।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinuu);
        String psera = "The Glorious One;                                                                 \n" +
                "The Most Glorious One, The One who is with perfect Power, High Status,\n" +
                "Compassion, Generosity and Kindness.\n" +

                "\n";

        textView.setText(psera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
