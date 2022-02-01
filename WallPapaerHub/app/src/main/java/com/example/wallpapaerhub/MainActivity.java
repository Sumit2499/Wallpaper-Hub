package com.example.wallpapaerhub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        navigationView = (NavigationView) findViewById(R.id.navigation);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);


        toolbar.setTitle("Wallpaper HUb");
        setSupportActionBar(toolbar);


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (item.getItemId()) {
            case R.id.cars:
                Toast.makeText(this, "Cars Fragment", Toast.LENGTH_SHORT).show();
                Fragment_car car = new Fragment_car();
                fragmentTransaction.add(R.id.frameLayout, car);
                fragmentTransaction.commit();
                break;


            case R.id.bikes:
                Toast.makeText(this, "Bikes Fragment", Toast.LENGTH_SHORT).show();
                Fragment_Bikes bikes = new Fragment_Bikes();
                fragmentTransaction.add(R.id.frameLayout, bikes);
                fragmentTransaction.commit();
                break;

            case R.id.mountain:
                Toast.makeText(this, "Mountain Fragment", Toast.LENGTH_SHORT).show();
                Fragment_Mountains fragment_mountains = new Fragment_Mountains();
                fragmentTransaction.add(R.id.frameLayout, fragment_mountains);
                fragmentTransaction.commit();
                break;
            case R.id.nature:
                Toast.makeText(this, "Natue Fragment", Toast.LENGTH_SHORT).show();
                Fragment_natue fragment_natue = new Fragment_natue();
                fragmentTransaction.add(R.id.frameLayout, fragment_natue);
                fragmentTransaction.commit();
                break;
        }
        drawerLayout.closeDrawers();
        return true;
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit");
//        builder.setCancelable(true);
        builder.setMessage("Do you want to exit ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        builder.show();

    }
}