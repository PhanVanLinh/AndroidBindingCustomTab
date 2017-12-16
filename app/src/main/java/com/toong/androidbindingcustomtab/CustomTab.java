package com.toong.androidbindingcustomtab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomTab extends TabLayout {

    public CustomTab(Context context) {
        super(context);
    }

    public CustomTab(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        Log.i("TAG", "setupWithViewPager");
        if (viewPager.getAdapter() == null) {
            return;
        }
        createTabIcons();
    }

    private void createTabIcons() {
        Log.i("TAG", "createTabIcons");
        LinearLayout tabOne =
                (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        ((TextView) tabOne.findViewById(R.id.text_title)).setText("tab 1");
        this.getTabAt(0).setCustomView(tabOne);

        LinearLayout tabTwo =
                (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        ((TextView) tabOne.findViewById(R.id.text_title)).setText("tab 2");
        this.getTabAt(1).setCustomView(tabTwo);

        LinearLayout tabThree =
                (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        ((TextView) tabOne.findViewById(R.id.text_title)).setText("tab 3");
        this.getTabAt(2).setCustomView(tabThree);
    }
}
