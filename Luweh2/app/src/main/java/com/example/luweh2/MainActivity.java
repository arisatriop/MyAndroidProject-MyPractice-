package com.example.luweh2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class PageChange implements ViewPager.OnPageChangeListener {

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {

        switch (position) {
            case 0:
                navigation.setSelectedItemId(R.id.navigation_dashboard);
                break;
            case 1:
                navigation.setSelectedItemId(R.id.navigation_calculate);
                break;
            case 2:
                navigation.setSelectedItemId(R.id.navigation_dss);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}