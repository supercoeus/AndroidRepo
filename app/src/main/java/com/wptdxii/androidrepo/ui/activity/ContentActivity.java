package com.wptdxii.androidrepo.ui.activity;

import android.content.Context;
import android.content.Intent;

import com.wptdxii.androidrepo.R;
import com.wptdxii.androidrepo.model.Module;
import com.wptdxii.androidrepo.ui.base.BaseContentActivity;

import java.util.ArrayList;

public class ContentActivity extends BaseContentActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, ContentActivity.class);
        context.startActivity(intent);
    }
    

    @Override
    protected void initToolbarTitle(int titleResId) {
        super.initToolbarTitle(R.string.content_activity_toolbar_title);
    }

    @Override
    protected void addItem(ArrayList<Module> mDataList) {
        mDataList.add(new Module("基于BaseSwipeRecyclerActivity", SwipeRecyclerActivity.class));
        mDataList.add(new Module("基于BaseSwipeRecyclerFragment", SwipeRecyclerFragmentActivity.class));
        mDataList.add(new Module("BottomNavigation+ViewPager", TabViewPagerActivity.class));
        mDataList.add(new Module("ViewPagerActivity", ViewPagerActivity.class));
        mDataList.add(new Module("SDKDemo", SampleSDKActivity.class));
    }
    
}
