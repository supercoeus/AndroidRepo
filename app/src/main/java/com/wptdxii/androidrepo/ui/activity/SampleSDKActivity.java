package com.wptdxii.androidrepo.ui.activity;

import com.wptdxii.androidrepo.R;
import com.wptdxii.androidrepo.model.Module;
import com.wptdxii.androidrepo.ui.base.BaseContentActivity;

import java.util.ArrayList;

public class SampleSDKActivity extends BaseContentActivity {
    @Override
    protected void initToolbarTitle(int titleResId) {
        super.initToolbarTitle(R.string.sample_sdk_activity_toolbar_title);
        
    }

    @Override
    protected void addItem(ArrayList<Module> mDataList) {
        
    }
}
