package com.android.luuu.almightyproject.Utils;

import android.text.TextUtils;

import com.android.luuu.almightyproject.AppInit.AppConfig;


/**
 * Created by luuu on 2018/1/22.
 */

class AppUtils {

    /**
     * 拼接url
     *
     * @param url
     * @return
     */
    public static String appendUrl(String url) {
        if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(AppConfig.getNetDomain())) {
            return AppConfig.getNetDomain() + url;
        }
        return url;
    }

}
