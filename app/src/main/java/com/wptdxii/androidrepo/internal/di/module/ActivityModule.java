package com.wptdxii.androidrepo.internal.di.module;

import android.app.Activity;

import com.wptdxii.androidrepo.internal.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wptdxii on 2016/9/17 0017.
 */
@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @PerActivity
    Activity provideActivity() {
        return mActivity;
    }
}
