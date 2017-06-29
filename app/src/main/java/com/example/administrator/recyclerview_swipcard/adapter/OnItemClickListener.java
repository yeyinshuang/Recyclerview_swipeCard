package com.example.administrator.recyclerview_swipcard.adapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/6/29 0029.
 */

public interface OnItemClickListener<T> {
    void onItemClick(ViewGroup var1, View var2,T var3,int var4);
    boolean onItemLongClick(ViewGroup var1, View var2,T var3,int var4);
}
