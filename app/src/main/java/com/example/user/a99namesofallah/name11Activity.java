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

public class name11Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name11 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.alkhaliq );
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
        String sera = "আল-খলিক্ব - দৃশ্যমান যাবতীয় জিনিষের সৃষ্টিকর্তা" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                             " +
                "যে ব্যক্তি একটানা ৭ দিন পর্যন্ত ১০০ বার করে এ নাম পড়বে, সে সকল বিপদ থেকে মুক্ত থাকবে।" +
                "যে ব্যক্তি সর্বদা এ নাম পড়বে, আল্লাহ্‌ তার জন্য এমন একজন ফেরেশতা পয়দা করে দেন, যে তার পক্ষ থেকে ইবাদত করতে থাকে" +
                "এবং তার চেহারা উজ্জ্বল থাকে।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageing);
        String xera = "The Creator;                                                                   " +
                "The One who brings everything from non-existence to existence" +

                "\n";

        textView.setText(xera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }


}
