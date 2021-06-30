package com.example.a14.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a14.Adapter;
import com.example.a14.R;
import com.example.a14.Student;
import com.example.a14.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment  {
    private FragmentFirstBinding binding;
    private Adapter adapter;
    private ArrayList<Student> students = new ArrayList<>();
    public FirstFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        getList();
    }

    private void getList() {
        students.add(new Student("Кайрат","Кайратович"));
        students.add(new Student("Максим","Галкинович"));
        students.add(new Student("Имя","Фамилия"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Гулчапчап","Гульчапчаевна"));
        students.add(new Student("Имя","Фамилия"));
        students.add(new Student("Имя","Фамилия"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
        students.add(new Student("Азамат","Айталиев"));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new Adapter();
        adapter.setStudent(students);
        binding.recycler.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}