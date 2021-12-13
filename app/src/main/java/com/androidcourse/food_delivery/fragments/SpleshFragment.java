package com.androidcourse.food_delivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidcourse.food_delivery.R;
import com.androidcourse.food_delivery.databinding.FragmentSpleshBinding;

public class SpleshFragment extends Fragment {
    private FragmentSpleshBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
     binding = FragmentSpleshBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        initView(view);
        return view;
        
    
    
    }

    private void initView(View view) {
        new CountDownTimer(1500, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                Navigation.findNavController(view).navigate(R.id.action_spleshFragment_to_onBoardingFragment);

            }

        }.start();

    }
}