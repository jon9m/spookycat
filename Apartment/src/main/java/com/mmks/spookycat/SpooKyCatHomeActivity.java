package com.mmks.spookycat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class SpooKyCatHomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoo_ky_cat_home);

        //Ads
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-9522499941725479~1788733091");
        AdView mAdView = (AdView) findViewById(R.id.adView_home);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void startGame(View view){
        Intent startIntent = new Intent(this, UnityPlayerActivity.class);
        startActivity(startIntent);
    }

    public void exitApp(View view) {
        finish();
    }
}