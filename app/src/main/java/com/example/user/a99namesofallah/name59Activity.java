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

public class name59Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name59 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.almuid );
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
        String sera = "আল-মু’ঈদ - পুনরুত্থানকারী শ্রষ্টা" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "ُ\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                               " +
                "কোন হারানো ব্যক্তিকে ফিরে পেতে হলে যখন ঘরের শুয়ে পড়বে, তখন ঘরের চার কোণায় সত্তর বার করে এ নাম পাঠ করবে, " +
                "ইনশাআল্লাহ্‌ সাত দিনের মধ্যে সে ইনশাআল্লাহ্‌ ব্যক্তি ফিরে আসবে কিংবা কোথায় আছে তা জানা যাবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messageinuuu);
        String seapra = "The Restorer;                                                                        " +
                "The Reproducer, The One who brings back the creatures after death" +

                "\n";

        textView.setText(seapra);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
