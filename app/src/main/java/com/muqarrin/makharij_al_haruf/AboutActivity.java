package com.muqarrin.makharij_al_haruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onClickVisitRepo(View view) {
        String url= "https://github.com/muqarrinjamal/Makharij-Al-Haruf";
        Uri webpage = Uri.parse(url);
        Intent intent = new
                Intent( Intent.ACTION_VIEW , webpage);
        startActivity(intent);
    }
}