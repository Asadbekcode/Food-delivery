package com.androidcourse.food_delivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidcourse.food_delivery.R;
import com.androidcourse.food_delivery.databinding.FragmentPasswordBinding;

public class passwordFragment extends Fragment {

    private FragmentPasswordBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         binding = FragmentPasswordBinding.inflate(inflater, container, false);
            View view = binding.getRoot();
            initView();
            return view;

    }

    private void initView() {
        binding.logIn.setOnClickListener(view -> {
            Navigation.findNavController(binding.logIn).navigate(R.id.action_passwordFragment_to_loginFragment);

        });
    }
}