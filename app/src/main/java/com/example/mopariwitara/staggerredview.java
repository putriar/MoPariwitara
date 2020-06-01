package com.example.mopariwitara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class staggerredview extends AppCompatActivity {

    private RecyclerView staggeredRv;
    private RecyclerViewAdapter adapter;
    private StaggeredGridLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow() .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.staggervieww);


        getSupportActionBar().hide();

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);

        //List Of Images
        List<row> lst = new ArrayList<>();
        lst.add(new row(R.drawable.waduksermo_yk));
        lst.add(new row(R.drawable.prambanan_yk));
        lst.add(new row(R.drawable.sonobudoyo_yk));
        lst.add(new row(R.drawable.tamansari_yk));
        lst.add(new row(R.drawable.vredeburg_yk));
        lst.add(new row(R.drawable.affandimuseum_yk));
        lst.add(new row(R.drawable.borobudur_yk));
        lst.add(new row(R.drawable.gembiraloka_yk));
        lst.add(new row(R.drawable.kasongan_yk));
        lst.add(new row(R.drawable.kedungpedut_yk));
        lst.add(new row(R.drawable.monjali_yk));
        lst.add(new row(R.drawable.keraton_yk));
        lst.add(new row(R.drawable.beringharjo_yk));

        adapter = new RecyclerViewAdapter(this,lst);
        staggeredRv.setAdapter(adapter);
     }

}
