package com.androidcourse.food_delivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidcourse.food_delivery.R;
import com.androidcourse.food_delivery.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    private FragmentLoginBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       
        binding = FragmentLoginBinding.inflate(inflater, container, false);
           View view = binding.getRoot();
           initView();
           return view;
           
    }

    private void initView() {
        binding.signUp.setOnClickListener(view -> {
            Navigation.findNavController(binding.signUp).navigate(R.id.action_loginFragment_to_passwordFragment);

        });
    }
}