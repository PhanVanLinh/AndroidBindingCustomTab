package com.toong.androidbindingcustomtab;

import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Created by PhanVanLinh on 28/08/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class BindingUtil {

    @BindingAdapter({ "setUpWithViewpager" })
    public static void setUpWithViewpager(final TabLayout tabLayout, ViewPager viewPager) {
        viewPager.addOnAdapterChangeListener(new ViewPager.OnAdapterChangeListener() {
            @Override
            public void onAdapterChanged(@NonNull ViewPager viewPager,
                    @Nullable PagerAdapter oldAdapter, @Nullable PagerAdapter newAdapter) {
                if (oldAdapter == null && newAdapter == null) {
                    return;
                }
                Log.i("TAG", "onAdapterChanged");
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }
}
