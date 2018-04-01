package com.luuu.netmodule.VolleyUtilK

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

/**
 * Created by luuu on 2018/3/10.
 */
class VolleyUtilK private constructor() {

    private lateinit var mContext: Context
    private lateinit var requestQueue: RequestQueue

    private constructor(mContext: Context) : this() {
        this.mContext = mContext
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(mContext.applicationContext)
        }
    }

    companion object {
        lateinit var instance: VolleyUtilK
        fun getInstance(mContext: Context): VolleyUtilK {
            if (VolleyUtilK.Companion.instance == null) {
                VolleyUtilK.Companion.instance = VolleyUtilK(mContext)
            }
            return instance
        }
    }





}