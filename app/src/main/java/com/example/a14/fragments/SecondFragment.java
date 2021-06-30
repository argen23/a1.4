package com.example.a14.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a14.Numbers;
import com.example.a14.R;
import com.example.a14.SecondAdapter;
import com.example.a14.databinding.FragmentFirstBinding;
import com.example.a14.databinding.FragmentSecondBinding;
import com.example.a14.databinding.SecondItemBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private ArrayList<Numbers> numbers = new ArrayList<>();
    private SecondAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        getNumbers();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new SecondAdapter();
        adapter.setNumbers(numbers);
        binding.rv2.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    private void getNumbers() {
        numbers.add(new Numbers("1"));
        numbers.add(new Numbers("2"));
        numbers.add(new Numbers("3"));
        numbers.add(new Numbers("4"));
        numbers.add(new Numbers("5"));
        numbers.add(new Numbers("6"));
        numbers.add(new Numbers("7"));
        numbers.add(new Numbers("8"));
        numbers.add(new Numbers("9"));
        numbers.add(new Numbers("10"));
        numbers.add(new Numbers("11"));
        numbers.add(new Numbers("12"));
        numbers.add(new Numbers("13"));
        numbers.add(new Numbers("14"));
        numbers.add(new Numbers("15"));
        numbers.add(new Numbers("16"));
        numbers.add(new Numbers("17"));
        numbers.add(new Numbers("19"));
        numbers.add(new Numbers("20"));
        numbers.add(new Numbers("21"));
        numbers.add(new Numbers("22"));

    }
}