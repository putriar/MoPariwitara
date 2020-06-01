package com.example.mopariwitara;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainDescript extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maindesc);
        }
    public void call(View view) {
        String url = "https://www.google.com/maps/search/restaurant+terdekat+dari+gembiraloka+zoo/@-7.7397544,110.4619592,14z/data=!3m1!4b1" ;
        Intent button = new Intent(Intent. ACTION_VIEW);
        button.setData(Uri. parse(url));
        startActivity(button);
    }

    public void panggil(View view) {
        String url = "https://www.google.com/maps/search/penginpan+terdekat+dari+gembiraloka+zoo/@-7.7395357,110.4094278,12z/data=!3m1!4b1" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
};
