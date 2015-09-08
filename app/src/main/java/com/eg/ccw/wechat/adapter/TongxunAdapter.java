package com.eg.ccw.wechat.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.eg.ccw.wechat.R;
import com.eg.ccw.wechat.util.TongContent;
import java.util.List;

/**
 * Created by Administrator on 2015/8/17.
 */
public class TongxunAdapter extends BaseExpandableListAdapter {
    private List<TongContent> tongContents;
    private LayoutInflater layoutInflater;

    public TongxunAdapter(Context context, List<TongContent> tongContents) {
        this.layoutInflater = layoutInflater.from(context);
        this.tongContents = tongContents;
    }

    @Override

    public int getGroupCount() {
        return tongContents.size();
    }



    @Override
    public int getChildrenCount(int groupPosition) {
        return tongContents.get(groupPosition).getTongImgs().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return tongContents.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return tongContents.get(groupPosition).getTongImgs().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }


    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        GroupViewHolder groupViewHolder;
        if(null==convertView){
            convertView= layoutInflater.inflate(R.layout.item_tongxunlu_ex_group,null);
            groupViewHolder=new GroupViewHolder(convertView);
            convertView.setTag(groupViewHolder);
        }
        else {
            groupViewHolder= (GroupViewHolder) convertView.getTag();
        }
//        Log.e("getTitle",tongContents.get(groupPosition).getCards().toString());
//        if("Title".equals(tongContents.get(groupPosition).getCards().toString()))
//        Log.i("groupPosition",""+groupPosition);
        if (0==groupPosition)
        {
            groupViewHolder.textView.setVisibility(View.GONE);
            return convertView;
        }
        groupViewHolder.textView.setText(tongContents.get(groupPosition).getCards());
        return convertView;
    }

    private static class GroupViewHolder {
        private TextView textView;
        public GroupViewHolder(View convertView){
            textView= (TextView) convertView.findViewById(R.id.item_tongxunlu_cards);
        }
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        ChildViewHolder childViewHolder;
        if(null==convertView){
            convertView= layoutInflater.inflate(R.layout.item_tongxunlu_ex_child,null);
            childViewHolder=new ChildViewHolder(convertView);
            convertView.setTag(childViewHolder);
        }
        else {
            childViewHolder= (ChildViewHolder) convertView.getTag();
        }
        childViewHolder.imageView.setBackgroundResource(tongContents.get(groupPosition).getTongImgs().get(childPosition).getImgid());
        childViewHolder.textView.setText(tongContents.get(groupPosition).getTongImgs().get(childPosition).getNickname().toString());
        return convertView;

    }
    private static class ChildViewHolder {
        private TextView textView;
        private ImageView imageView;
        public ChildViewHolder(View convertView){
            textView= (TextView) convertView.findViewById(R.id.item_tongxunlu_nickname);
            imageView= (ImageView) convertView.findViewById(R.id.item_tongxunlu_imgs);
        }
    }
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
