package com.example.a14.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a14.R;
import com.example.a14.databinding.FragmentFirstBinding;
import com.example.a14.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    FragmentThirdBinding binding;
    public ThirdFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}