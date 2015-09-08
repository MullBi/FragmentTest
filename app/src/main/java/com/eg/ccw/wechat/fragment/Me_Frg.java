package com.eg.ccw.wechat.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.eg.ccw.wechat.R;

/**
 * Created by Administrator on 2015/8/16.
 */
public class Me_Frg extends Fragment {
    private LinearLayout purse;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.frg_me,container,false);
        purse= (LinearLayout) view.findViewById(R.id.purse);
        purse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"我是钱包~~~",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
