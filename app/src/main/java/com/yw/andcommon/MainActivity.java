package com.yw.andcommon;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.widget.Toolbar;

import com.vondear.rxtools.RxActivityTool;
import com.vondear.rxtools.RxCrashTool;
import com.vondear.rxtools.RxTool;
import com.vondear.rxtools.view.RxToast;
import com.vondear.rxtools.view.dialog.RxDialog;
import com.vondear.rxtools.view.dialog.RxDialogLoading;
import com.yw.andcommon.base.RxBus;
import com.yw.andcommon.base.activity.AbstractSimpleActivity;
import com.yw.andcommon.utils.RxUtils;


import butterknife.BindView;

public class MainActivity extends AbstractSimpleActivity {

    @BindView(R.id.common_toolbar)
    Toolbar toolbar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEventAndData() {
        setToolBar(toolbar, "这一页");
        RxDialogLoading rxDialogLoading = new RxDialogLoading(this, true, new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                RxToast.error("asdas");
            }
        });
        rxDialogLoading.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rxDialogLoading.dismiss();
            }
        }, 3000);

    }

}
