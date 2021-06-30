package com.example.a14;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a14.databinding.SecondItemBinding;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondHolder> {
    @NonNull
    private ArrayList<Numbers> numbers = new ArrayList<>();
    public void setNumbers(ArrayList<Numbers> numbers) {
        this.numbers.addAll(numbers);
        notifyDataSetChanged();
    }

    @Override
    public SecondHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondHolder(SecondItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondHolder holder, int position) {
        holder.onBind(numbers.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public class SecondHolder extends RecyclerView.ViewHolder {
        private SecondItemBinding binding;
        public SecondHolder(@NonNull SecondItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
        public  void onBind(Numbers numbers){
            binding.num.setText(numbers.getNum());
        }
    }
}
