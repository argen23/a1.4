package com.example.a14;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a14.databinding.FirstItemBinding;
import com.example.a14.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Student> students = new ArrayList<>();

    public void setStudent(ArrayList<Student> students){
        this.students.addAll(students);
        notifyDataSetChanged();
    }
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(FirstItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onBind(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public  class Holder extends RecyclerView.ViewHolder{
        private FirstItemBinding binding;
        public Holder(@NonNull FirstItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Student student) {
          binding.name.setText(student.getName());
          binding.surname.setText(student.getSurname());
        }
    }
}
