package com.yw.andcommon.di.module;


import com.yw.andcommon.app.BaseApplication;
import com.yw.andcommon.data.DataManager;
import com.yw.andcommon.data.db.DbHelper;
import com.yw.andcommon.data.db.GreenDaoHelper;
import com.yw.andcommon.data.http.HttpHelper;
import com.yw.andcommon.data.http.RetrofitHelper;
import com.yw.andcommon.data.prefs.PreferenceHelper;
import com.yw.andcommon.data.prefs.PreferenceHelperImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author quchao
 * @date 2017/11/27
 */

@Module
public class AppModule {

    private final BaseApplication application;

    public AppModule(BaseApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    BaseApplication provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DbHelper provideDBHelper(GreenDaoHelper realmHelper) {
        return realmHelper;
    }

    @Provides
    @Singleton
    PreferenceHelper providePreferencesHelper(PreferenceHelperImpl implPreferencesHelper) {
        return implPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, DbHelper dbhelper, PreferenceHelper preferencesHelper) {
        return new DataManager(httpHelper, dbhelper, preferencesHelper);
    }

}
