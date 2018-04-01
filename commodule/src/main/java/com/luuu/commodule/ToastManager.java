package com.luuu.commodule;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by luuu on 2018/1/29.
 */

public class ToastManager {

    private static String oldMessage = "";
    private static long firstTime = 0;     //第一次时间
    private static long secondTime = 0;    //第二次时间

    private static Toast toast = null;
    private static int oldGravity = -1;

    /**
     * 展示短时间的toast
     *
     * @param context
     * @param tip
     */
    public static void showShortTip(Context context, String tip) {
        showNormalTip(context, tip, Toast.LENGTH_SHORT, -1, 0, 0);
    }

    /**
     * 展示长时间的toast
     *
     * @param context
     * @param tip
     */
    public static void showLongTip(Context context, String tip) {
        showNormalTip(context, tip, Toast.LENGTH_LONG, -1, 0, 0);
    }

    /**
     * 在一定时间内不重复展示相同内容
     * 自定义toast展示的位置
     *
     * @param context
     * @param tip
     * @param duration
     */
    public static void showNormalTip(Context context, String tip, int duration, int gravity, int offsetX, int offsetY) {
        if (oldGravity != gravity) {
            toast.cancel();
            toast = null;
        }
        oldGravity = gravity;
        if (toast == null) {
            toast = Toast.makeText(context, tip, duration);
            if (gravity >= 0) {
                toast.setGravity(gravity, offsetX, offsetY);
            }
            toast.show();
            firstTime = System.currentTimeMillis();
        } else {
            secondTime = System.currentTimeMillis();
            if (tip.equals(oldMessage)) {
                if (secondTime - firstTime > duration) {
                    toast.show();
                    firstTime = secondTime;
                }
            } else {
                oldMessage = tip;
                toast.setText(tip);
                toast.show();
                firstTime = secondTime;
            }
        }
    }


    /**
     * 消除当前展示的toast信息
     */
    public static void cancel() {
        if (toast != null) {
            toast.cancel();
        }
    }

}
