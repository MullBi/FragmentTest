package com.eg.ccw.wechat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.eg.ccw.wechat.R;
import com.eg.ccw.wechat.util.ChattingContent;

import java.util.List;

/**
 * Created by Administrator on 2015/8/16.
 */
public class WeixinAdapter extends BaseAdapter {
    private List<ChattingContent> chattingContents;
    private LayoutInflater layoutInflater;

    public WeixinAdapter(Context context, List<ChattingContent> chattingContents) {
        this.layoutInflater = layoutInflater.from(context);
        this.chattingContents=chattingContents;
    }

    @Override
    public int getCount() {
        return chattingContents.size();
    }

    @Override
    public Object getItem(int position) {
        return chattingContents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(null==convertView)
        {
            convertView=layoutInflater.inflate(R.layout.item_weixin,null);
            viewHolder= new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.chatContents.setText(chattingContents.get(position).getContents());
        viewHolder.weixin_nickname.setText(chattingContents.get(position).getName());
        viewHolder.weixin_time.setText(chattingContents.get(position).getTime());
//        viewHolder.weixin_img.setText(chattingContents.get(position).getimg());
        return convertView;
    }
    private static class ViewHolder{
        private TextView weixin_nickname,chatContents,weixin_time;
//        private ImageView weixin_img;
        public  ViewHolder(View converView){
            weixin_nickname= (TextView) converView.findViewById(R.id.item_weixin_nickname);
            chatContents= (TextView) converView.findViewById(R.id.item_weixin_chatcontent);
//            weixin_img= (ImageView) converView.findViewById(R.id.item_weixin_img);
            weixin_time= (TextView) converView.findViewById(R.id.item_weixin_time);
        }
    }
}
