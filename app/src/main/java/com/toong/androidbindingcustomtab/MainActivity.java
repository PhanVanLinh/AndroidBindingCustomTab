package com.toong.androidbindingcustomtab;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.toong.androidbindingcustomtab.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private CustomTab tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setViewModel(new MainViewModel(this));
    }
}
