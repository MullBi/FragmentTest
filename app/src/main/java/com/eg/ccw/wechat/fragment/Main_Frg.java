package com.eg.ccw.wechat.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eg.ccw.wechat.R;

/**
 * Created by Administrator on 2015/8/17.
 */
public class Main_Frg extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frg_main, container,false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
