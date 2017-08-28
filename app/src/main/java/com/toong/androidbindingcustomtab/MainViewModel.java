package com.toong.androidbindingcustomtab;

import android.databinding.BaseObservable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends BaseObservable {
    FragmentActivity mContext;
    ViewPagerAdapter adapter;

    MainViewModel(FragmentActivity context) {
        mContext = context;
        createViewPager();
    }

    public PagerAdapter getPagerAdapter() {
        return adapter;
    }

    private void createViewPager() {
        adapter = new ViewPagerAdapter(mContext.getSupportFragmentManager());
        adapter.addFrag(new Fragment1(), "Tab 1");
        adapter.addFrag(new Fragment1(), "Tab 1");
        adapter.addFrag(new Fragment1(), "Tab 1");
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}