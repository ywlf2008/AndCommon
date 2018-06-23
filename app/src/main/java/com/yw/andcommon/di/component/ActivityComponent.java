package com.yw.andcommon.di.component;

import android.app.Activity;

import com.yw.andcommon.di.module.ActivityModule;
import com.yw.andcommon.di.scope.ActivityScope;

import dagger.Component;


/**
 * @author quchao
 * @date 2017/11/27
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    /**
     * 获取Activity实例
     *
     * @return Activity
     */
    Activity getActivity();

}
