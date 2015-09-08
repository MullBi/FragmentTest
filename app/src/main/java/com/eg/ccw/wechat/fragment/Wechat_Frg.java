package com.eg.ccw.wechat.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.eg.ccw.wechat.R;
import com.eg.ccw.wechat.adapter.WeixinAdapter;
import com.eg.ccw.wechat.util.ChattingContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/16.
 */
public class Wechat_Frg extends Fragment{
    private ListView chattinglv;
    private List<ChattingContent> contents;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frg_weixin,container,false);
        chattinglv=(ListView) view.findViewById(R.id.chatting);
        contents=new ArrayList<ChattingContent>();
        contents.add(new ChattingContent("三月扬州","Hey，how are you ?","上午 11:30"));
        contents.add(new ChattingContent("宫崎骏","你住的城市下雨了，很想问你带伞没有，可是我忍住了" +
                "因为我害怕你说没有，而我又无能为力，就好像是我是爱你的却不能给你需要的陪伴。","上午 11:28"));
        contents.add(new ChattingContent("用心","Hey,你还好吗？","昨天 00:30"));
        contents.add(new ChattingContent("周杰伦","繁华如三千东流水，我只取一瓢爱了解","昨天 00:28"));
        contents.add(new ChattingContent("努力","体胖任需勤锻炼，人丑就该多读书","昨天 00:26"));
        contents.add(new ChattingContent("三月扬州","别让等待的心，等到无望。别让想念的人，想到不想","昨天 00:20"));
        contents.add(new ChattingContent("用心","当一些名字只是痕迹，是否忘了珍惜。当一段感情只是曾经，是否只剩惋惜","昨天 00:18"));
        chattinglv.setAdapter(new WeixinAdapter(getActivity(), contents));
        chattinglv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),contents.get(position).getName().toString()+
                        "：\n"+contents.get(position).getContents().toString(),Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
