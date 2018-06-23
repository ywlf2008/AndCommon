package com.yw.andcommon.data;


import com.yw.andcommon.data.db.DbHelper;
import com.yw.andcommon.data.http.HttpHelper;
import com.yw.andcommon.data.prefs.PreferenceHelper;

/**
 * @author quchao
 * @date 2017/11/27
 */

public class DataManager implements HttpHelper, DbHelper, PreferenceHelper {

    private HttpHelper mHttpHelper;
    private DbHelper mDbHelper;
    private PreferenceHelper mPreferenceHelper;

    public DataManager(HttpHelper httpHelper, DbHelper dbHelper, PreferenceHelper preferencesHelper) {
        mHttpHelper = httpHelper;
        mDbHelper = dbHelper;
        mPreferenceHelper = preferencesHelper;
    }

    @Override
    public void setLoginAccount(String account) {
        mPreferenceHelper.setLoginAccount(account);
    }

    @Override
    public void setLoginPassword(String password) {
        mPreferenceHelper.setLoginPassword(password);
    }

    @Override
    public String getLoginAccount() {
        return mPreferenceHelper.getLoginAccount();
    }

    @Override
    public String getLoginPassword() {
        return mPreferenceHelper.getLoginPassword();
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mPreferenceHelper.setLoginStatus(isLogin);
    }

    @Override
    public boolean getLoginStatus() {
        return mPreferenceHelper.getLoginStatus();
    }

    @Override
    public void setCookie(String domain, String cookie) {
        mPreferenceHelper.setCookie(domain, cookie);
    }

    @Override
    public String getCookie(String domain) {
        return mPreferenceHelper.getCookie(domain);
    }

    @Override
    public void setCurrentPage(int position) {
        mPreferenceHelper.setCurrentPage(position);
    }

    @Override
    public int getCurrentPage() {
        return mPreferenceHelper.getCurrentPage();
    }

    @Override
    public void setProjectCurrentPage(int position) {
        mPreferenceHelper.setProjectCurrentPage(position);
    }

    @Override
    public int getProjectCurrentPage() {
        return mPreferenceHelper.getProjectCurrentPage();
    }

    @Override
    public boolean getAutoCacheState() {
        return mPreferenceHelper.getAutoCacheState();
    }

    @Override
    public boolean getNoImageState() {
        return mPreferenceHelper.getNoImageState();
    }

    @Override
    public boolean getNightModeState() {
        return mPreferenceHelper.getNightModeState();
    }

    @Override
    public void setNightModeState(boolean b) {
        mPreferenceHelper.setNightModeState(b);
    }

    @Override
    public void setNoImageState(boolean b) {
        mPreferenceHelper.setNoImageState(b);
    }

    @Override
    public void setAutoCacheState(boolean b) {
        mPreferenceHelper.setAutoCacheState(b);
    }


}
