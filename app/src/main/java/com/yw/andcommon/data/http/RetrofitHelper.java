package com.yw.andcommon.data.http;

import com.yw.andcommon.data.http.api.GeeksApis;

import javax.inject.Inject;


/**
 * @author quchao
 * @date 2017/11/27
 */

public class RetrofitHelper implements HttpHelper {

    private GeeksApis mGeeksApis;

    @Inject
    RetrofitHelper(GeeksApis geeksApis) {
        mGeeksApis = geeksApis;
    }

}
