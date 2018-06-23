package com.yw.andcommon.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author quchao
 * @date 2018/3/5
 */

public class GlideImageLoader extends ImageLoader {

    public void displayImage(Context context, Object o, ImageView imageView) {
        Glide.with(context).load(o).into(imageView);
    }

}