package com.example.a14;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.style.ScaleXSpan;
import android.widget.TextView;

import com.example.a14.databinding.ActivityMainBinding;
import com.example.a14.fragments.FirstFragment;
import com.example.a14.fragments.SecondFragment;
import com.example.a14.fragments.ThirdFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ViewPagerAdapter ViewPagerAdapter;
    Adapter adapter;
    RecyclerView rv;
    TextView name , surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        binding.Vp.setAdapter(ViewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.Vp);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        setRv();
    }

    private void setRv() {
    rv = findViewById(R.id.recycler);
    adapter = new Adapter();
    rv.setAdapter(adapter);
    }
}




