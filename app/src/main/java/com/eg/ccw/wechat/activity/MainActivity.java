package com.eg.ccw.wechat.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

import com.eg.ccw.wechat.R;
import com.eg.ccw.wechat.fragment.Find_Frg;
import com.eg.ccw.wechat.fragment.Me_Frg;
import com.eg.ccw.wechat.fragment.Wechat_Frg;
import com.eg.ccw.wechat.fragment.AddressList_Frg;


public class MainActivity extends Activity implements OnClickListener {
    private Wechat_Frg wechat_frg;
    private AddressList_Frg addressList_frg;
    private Find_Frg find_frg;
    private Me_Frg me_frg;
    private TextView wechat,addresslist,find,me;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.weixin_title);

        wechat= (TextView) findViewById(R.id.weixin);
        addresslist= (TextView) findViewById(R.id.tongxunlu);
        find= (TextView) findViewById(R.id.find);
        me= (TextView) findViewById(R.id.me);
        wechat.setOnClickListener(this);
        addresslist.setOnClickListener(this);
        find.setOnClickListener(this);
        me.setOnClickListener(this);
        setDefault();


    }
    private void setDefault(){
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.fra, new Wechat_Frg());
        transaction.commit();
    }


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        switch ( v.getId()){
            case R.id.weixin:
                if (null==wechat_frg)
                {
                    wechat_frg=new Wechat_Frg();
                }
                transaction.replace(R.id.fra, wechat_frg);
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                wechat.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ami), null, null);
                addresslist.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.amg),null,null);
                find.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amo), null, null);
                me.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ams), null, null);
                wechat.setTextColor(getBaseContext().getResources().getColor(R.color.changed));
                addresslist.setTextColor(Color.GRAY);
                find.setTextColor(Color.GRAY);
                me.setTextColor(Color.GRAY);
                break;

            case R.id.tongxunlu:
                if (null==addressList_frg)
                {
                    addressList_frg=new AddressList_Frg();
                }
                transaction.replace(R.id.fra,addressList_frg);
//                transaction.hide(getFragmentManager().findFragmentById(0));

                transaction.setTransition(FragmentTransaction.TRANSIT_ENTER_MASK);
                transaction.addToBackStack(null);
                wechat.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amk), null, null);
                addresslist.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ame), null, null);
                find.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amo), null, null);
                me.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ams), null, null);
                wechat.setTextColor(Color.GRAY);
                addresslist.setTextColor(getBaseContext().getResources().getColor(R.color.changed));
                find.setTextColor(Color.GRAY);
                me.setTextColor(Color.GRAY);
                break;
            case R.id.find:
                if (null==find_frg)
                {
                    find_frg=new Find_Frg();
                }
                transaction.replace(R.id.fra,find_frg);
//                transaction.hide(getFragmentManager().findFragmentById(1));

                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.addToBackStack(null);
                wechat.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amk), null, null);
                addresslist.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amg), null, null);
                find.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amm), null, null);
                me.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ams), null, null);
                wechat.setTextColor(Color.GRAY);
                addresslist.setTextColor(Color.GRAY);
                find.setTextColor(getBaseContext().getResources().getColor(R.color.changed));
                me.setTextColor(Color.GRAY);
                break;
            case R.id.me:
                if (null==me_frg)
                {
                    me_frg=new Me_Frg();
                }
                transaction.replace(R.id.fra, me_frg);
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                transaction.addToBackStack(null);
                wechat.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amk), null, null);
                addresslist.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amg), null, null);
                find.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amo), null, null);
                me.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.amq), null, null);
                wechat.setTextColor(Color.GRAY);
                addresslist.setTextColor(Color.GRAY);
                find.setTextColor(Color.GRAY);
                me.setTextColor(getBaseContext().getResources().getColor(R.color.changed));
                break;
        }
        transaction.commit();

    }
}
