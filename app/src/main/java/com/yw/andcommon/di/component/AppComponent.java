package com.yw.andcommon.di.component;


import com.yw.andcommon.app.BaseApplication;
import com.yw.andcommon.data.DataManager;
import com.yw.andcommon.di.module.AppModule;
import com.yw.andcommon.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author quchao
 * @date 2017/11/27
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    /**
     * 提供App的Context
     *
     * @return GeeksApp context
     */
    BaseApplication getContext();

    /**
     * 数据中心
     *
     * @return DataManager
     */
    DataManager getDataManager();

}
