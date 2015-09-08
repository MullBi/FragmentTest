package com.eg.ccw.wechat.util;

/**
 * Created by Administrator on 2015/8/17.
 */
public class TongImg {
   private int imgid;
    private String nickname;

    public TongImg(int imgid, String nickname) {
        this.imgid = imgid;
        this.nickname = nickname;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
