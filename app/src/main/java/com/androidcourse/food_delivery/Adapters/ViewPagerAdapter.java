package com.androidcourse.food_delivery.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mList;



    public ViewPagerAdapter(FragmentManager childFragmentManager, int behaviorResumeOnlyCurrentFragment, List<Fragment> mList) {
        super(childFragmentManager, behaviorResumeOnlyCurrentFragment);
        this.mList = mList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}


