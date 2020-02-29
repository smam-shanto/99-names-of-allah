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

public class name15Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name15 );final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alqahhar );
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
        String sera = "আল-ক্বহ্হার - প্রভাব বিস্তারকারী মহাশক্তিধর" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                           " +
                "যে ব্যক্তি দুনিয়ার মহব্বতে অন্ধ হয়ে যায়, সে যদি বেশী মাত্রায় এ নাম পাঠ করে," +
                "তা হলে তার দুনিয়ার মহাব্বত কমতে থাকবে এবং আল্লাহ্‌র মহাব্বত বৃদ্ধি পাবে ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinas);
        String ssera = "The All-Prevailing One;                                                      " +
                "The Dominant, The One who has the perfect Power and is not unable over anything." +

                "\n";

        textView.setText(ssera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
