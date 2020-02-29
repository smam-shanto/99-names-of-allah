package com.example.user.a99namesofallah;

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
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_about );

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );

        textView = (TextView) findViewById( R.id.messagest );
        String pera = "মহান প্রভু, সবকিছুর সৃষ্টিকর্তার নাম হচ্ছে আল্লাহ্। এটা হচ্ছে আল্লাহ্ তা’আলার সর্বশ্রেষ্ঠ নাম। কারণ যে কোন গুণবাচক নাম দিয়েই আল্লাহ্ র কথা বলা হোক না কেন, সব নাম দ্বারা আল্লাহ্কেই ইঙ্গিত করা হয়। " +
                "" +
                "" +
                "" +
                "" +
                "যেমন, আল্লাহ্ তা’আলা বলেছেন," +
                "                                                                                                                                                                                                                          " +
                "                                                                                                                                                          " +
                "                                                                                                                                        " +
                "                          " +
                "\n" +
                "\n" ;

        textView.setText( pera );
        textView.setMovementMethod( new ScrollingMovementMethod() );

        textView = (TextView) findViewById( R.id.messagein);
        String mera = "“তিনিই আল্লাহ্, যিনি ছাড়া লা ইলাহা ইল্লা হুয়া (আর কেউ নাই উপাসনা করার), দৃশ্যমান এবং অদৃশ্যমান জগতের সব ব্যাপারে যিনি সম্যক অবগত। তিনি সবচাইতে দয়ালু, সবচাইতে ক্ষমাশীল। তিনিই আল্লাহ্, যিনি ছাড়া লা ইলাহা ইল্লা হুয়া, যিনি সবকিছুর অধিপতি, পূতঃপবিত্র, সবকিছুর উর্ধে, নিরাপত্তা প্রদানকারী, অভিভাবক, সর্বশক্তিমান, সমুচ্চ, গৌরবান্বিত, সকল প্রশংসা তাঁর জন্য, তারা তাঁর সাথে যা কিছু শরিক করে সেগুলা থেকে তিনি অনেক উর্ধে। তিনি আল্লাহ্, যিনি শূন্য থেকে সৃষ্টি শুরু করেছেন, সবকিছু তৈরি করেছেন, আকৃতি দিয়েছেন। সবচাইতে ভাল নামগুলি তাঁর জন্যই প্রযোজ্য। মহাকাশ এবং পৃথিবীর মধ্যে যা কিছু আছে সবকিছু তাঁর মহত্ত্ব বর্ণনা করে, এবং তিনিই সর্বশক্তিমান, সর্বজ্ঞ।”  [৫৯:২২-২৪]" +
                "\n";

        textView.setText(mera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagefin );
        String tera = "এখানে আল্লাহ্ তা’আলা তাঁর কিছু গুণবাচক নামের উল্লেখ করেছেন।" +
                "                                                                                                                  \n" +
                "                                                                                         " +
                "একইভাবে কুর’আনের অন্যত্র আল্লাহ্ বলেছেন,\n" +
                "                                                                \n" +
                "“এবং (সব) সুন্দর সুন্দর নাম আল্লাহ্ তা’আলার জন্য, সুতরাং তাঁকে এসব নামেই ডাক।”" +
                "\n";

        textView.setText(tera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagefuin );
        String rera = "আবু হুরাইরাহ্ রাদিআল্লাহু তা’আলা আনহু কর্তৃক বর্ণিত, রসূল সল্লাল্লাহু আলাইহি ওয়া সাল্লাম বলেছেন," +
                "                                                                                        " +
                "" +
                "" +
                "                                                                                                                                         " +
                "" +

                "\n";

        textView.setText(rera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagefucin );
        String vera = "“আল্লাহ্” এই নামটি হচ্ছে সব নামের মধ্যে সবচাইতে মর্যাদাপূর্ণ ।  ইনশা’আল্লাহ আমরা আমাদের সুবিধামত সময়ে এবং উপায়ে এই নামগুলি মনে রাখার চেষ্টা করব ।   আল্লাহ্ আমাদের সবাইকে জান্নাহ –এর অধিবাসী করুক। আমীন!" +
                "" +
                "" +
                "                                                                                                    " +
                "" +
                "" +
                "" +
                "                                                                                                                                                                                                               " +
                "" +
                "" +

                "\n";

        textView.setText(vera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagefuckin );
        String sera = "Develop by SM Asif Mahmood Shanto " +
                "                                                                                                      " +
                "Copyright © Feather IT 2019" +

                "\n";

        textView.setText(sera);
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView = (TextView) findViewById( R.id.messagefuckind );
        String xera = "------------------------------------------------------------------------------------------------------------" +

                "\n";

        textView.setText(xera);
        textView.setMovementMethod(new ScrollingMovementMethod());


        textView = (TextView) findViewById( R.id.messagefuina );
        String zera = "“আল্লাহ্ তা’আলার রয়েছে নিরানব্বইটি নাম, একশো থেকে একটি কম, যে এই নামগুলি মনে রাখবে, বুঝবে এবং উপলব্ধি করবে, সে জান্নাহ -তে যাবে।” [বুখারি ৩.৫০:৮৯৪, মুসলিম ৩৫:৬৪৭৬, তিরমিযি ৫১.৮৭:৫১৩৮]" +

                "\n";

        textView.setText(zera);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.about, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }
}
