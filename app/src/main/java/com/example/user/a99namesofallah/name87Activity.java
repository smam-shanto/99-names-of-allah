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

public class name87Activity extends AppCompatActivity{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_name87 );
        final MediaPlayer catMP = MediaPlayer.create( this, R.raw.aljame );
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
        String sera = "আল-জামি’ - সমবেত কারী" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagein);

        String pera = "\n" +
                "\n" +

                "ফজিলতঃ                                                                                                                                                " +
                "যে ব্যক্তির আত্মীয়-স্বজন ও বন্ধু-বান্ধব বিক্ষিপ্ত হয়ে যায়, সে চাশতের সময় গোসল করবে এবং আসমানের দিকে মুখ করে দশ " +
                "বার ( ইয়া-জামি'উ) পাঠ করবে এবং একটি আঙুল বন্ধ করতে থাকবে এবং সর্বশেষে উভয় হাত মুখের উপর ফিরাবে । এতে করে খুব শীঘ্রই তারা এক হয়ে যাবে  ।\n" +
                "\n" ;

        textView.setText(pera);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView = (TextView) findViewById( R.id.messageinkkr);
        String seuuora = "The Assembler of Scattered         Creations;                                                  " +
                "The Gatherer, The One who gathers the creatures on a day that there is no doubt about, that is the Day of Judgment." +

                "\n";

        textView.setText(seuuora);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

}
