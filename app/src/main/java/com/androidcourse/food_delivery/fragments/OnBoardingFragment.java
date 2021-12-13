package com.androidcourse.food_delivery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidcourse.food_delivery.Adapters.ViewPagerAdapter;
import com.androidcourse.food_delivery.R;
import com.androidcourse.food_delivery.databinding.FragmentOnBoardingBinding;

import java.util.LinkedList;
import java.util.List;

public class OnBoardingFragment extends Fragment {


    FragmentOnBoardingBinding binding;

    private List<Fragment>fragmentList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         binding = FragmentOnBoardingBinding.inflate(inflater, container, false);
            View view = binding.getRoot();
            initView();
            return view;
            
    }

    private void initView() {
     initViewPager();
     binding.cardViewNext.setOnClickListener(view -> {
        if (binding.viewPager.getCurrentItem() !=2){
            binding.viewPager.setCurrentItem(binding.viewPager.getCurrentItem()+1);
        }else {
            Navigation.findNavController(binding.cardViewNext).navigate(R.id.action_onBoardingFragment_to_loginFragment);
        }





    });
     binding.textSkip.setOnClickListener(view -> {
         Navigation.findNavController(binding.cardViewNext).navigate(R.id.action_onBoardingFragment_to_loginFragment);

     });
}


    private void initViewPager() {
        fragmentList = new LinkedList<>();
        fragmentList.add(new OnBordingPagerFragment(R.drawable.q,"Select a restaurant", "hello welcome my restaurant"));
        fragmentList.add(new OnBordingPagerFragment(R.drawable.ikin,"Order food you like","lavash and burger and hamburger"  ));
        fragmentList.add(new OnBordingPagerFragment(R.drawable.uch,"Deliver to your home","taxi and byckcle"));

        ViewPagerAdapter adapter=new ViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,fragmentList);
        binding.viewPager.setAdapter(adapter);
        binding.dotsIndicator.setViewPager(binding.viewPager);
    }
}
