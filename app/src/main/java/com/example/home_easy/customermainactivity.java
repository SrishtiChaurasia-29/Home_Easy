package com.example.home_easy;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.home_easy.Category_fragment;
import com.example.home_easy.Help_fragment;
import com.example.home_easy.Home_fragment;
import com.example.home_easy.Profile_fragment;
import com.example.home_easy.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class customermainactivity extends AppCompatActivity {
    
    BottomNavigationView Bottom_navig1;
    Home_fragment homefragment= new Home_fragment();
    Profile_fragment profilefragment=new Profile_fragment();
    Help_fragment helpfragment=new Help_fragment();
    Category_fragment categoryfragment=new Category_fragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_fragment);
        Bottom_navig1=findViewById(R.id.Bottom_navig);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefragment).commit();
        Bottom_navig1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefragment).commit();
                        return true;
                    case R.id.category:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,categoryfragment).commit();
                        return true;
                    case R.id.help:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,helpfragment).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profilefragment).commit();
                        return true;
                }
                return false;
            }
        });


    }
}