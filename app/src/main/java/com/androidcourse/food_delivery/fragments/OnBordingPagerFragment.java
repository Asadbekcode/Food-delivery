package com.androidcourse.food_delivery.fragments;

import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidcourse.food_delivery.R;
import com.androidcourse.food_delivery.databinding.FragmentOnBordingPagerBinding;

public class OnBordingPagerFragment extends Fragment {

    private FragmentOnBordingPagerBinding binding;

    private final int imageId;
    private final String title;
    private final String text;

    public OnBordingPagerFragment(int imageId, String title, String text) {
    this.imageId=imageId;
    this.title=title;
    this.text=text;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         binding = FragmentOnBordingPagerBinding.inflate(inflater, container, false);
            View view = binding.getRoot();
            initView();
            return view;


    }

    private void initView() {
        binding.imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(),imageId,null));
        binding.textViewTitle.setText(title);
        binding.textViewText.setText(text);
    }
}