package com.eg.ccw.wechat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.eg.ccw.wechat.R;
import com.eg.ccw.wechat.adapter.TongxunAdapter;
import com.eg.ccw.wechat.util.TongContent;
import com.eg.ccw.wechat.util.TongImg;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/16.
 */
public class AddressList_Frg extends Fragment {
    private List<TongContent> tongContentList;
    private List<TongImg> tongImgList1,tongImgList2,tongImgList3,tongImgList4,tongImgList5;
    private ExpandableListView expandableListView;
    private TongxunAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frg_tongxunlu,container,false);
        expandableListView= (ExpandableListView) view.findViewById(R.id.addresslist_ex);
        expandableListView.setGroupIndicator(null);
        tongContentList=new ArrayList<TongContent>();
        tongImgList1=new ArrayList<TongImg>();
        tongImgList2=new ArrayList<TongImg>();
        tongImgList3=new ArrayList<TongImg>();
        tongImgList4=new ArrayList<TongImg>();
        tongImgList5=new ArrayList<TongImg>();
        tongImgList1.add(new TongImg(R.drawable.adn,"新的朋友"));
        tongImgList1.add(new TongImg(R.drawable.adq,"群聊"));
        tongImgList1.add(new TongImg(R.drawable.adb,"标签"));
        tongImgList1.add(new TongImg(R.drawable.adg,"公众号"));
        tongContentList.add(new TongContent("Title",tongImgList1));

        tongImgList2.add(new TongImg(R.drawable.me,"啊蠢"));
        tongImgList2.add(new TongImg(R.drawable.me,"阿胜"));
        tongImgList2.add(new TongImg(R.drawable.me,"爱欣"));
        tongContentList.add(new TongContent("A",tongImgList2));

        tongImgList3.add(new TongImg(R.drawable.adn,"巴德"));
        tongImgList3.add(new TongImg(R.drawable.adg,"备查"));
        tongImgList3.add(new TongImg(R.drawable.me,"北城"));
        tongImgList3.add(new TongImg(R.drawable.adq,"北春"));
        tongImgList3.add(new TongImg(R.drawable.me,"标签"));
        tongContentList.add(new TongContent("B",tongImgList3));

        tongImgList4.add(new TongImg(R.drawable.me,"蠢"));
        tongImgList4.add(new TongImg(R.drawable.me,"春芸"));
        tongContentList.add(new TongContent("C",tongImgList4));

        tongImgList5.add(new TongImg(R.drawable.adn,"丫丫"));
        tongImgList5.add(new TongImg(R.drawable.me,"雅雅"));
        tongContentList.add(new TongContent("Y",tongImgList5));

        adapter=new TongxunAdapter(getActivity(),tongContentList);
        expandableListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        final int groupCount=expandableListView.getCount();
        for (int i=0;i<groupCount;i++){
            expandableListView.expandGroup(i);
        }
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(getActivity(),
                        "我是"+tongContentList.get(groupPosition).getTongImgs().get(childPosition).getNickname(),
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
