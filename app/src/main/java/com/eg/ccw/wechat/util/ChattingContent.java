package com.eg.ccw.wechat.util;


/**
 * Created by Administrator on 2015/8/16.
 */
public class ChattingContent {
    private String name;
    private String contents;
    private String time;

    public ChattingContent( String name,String contents, String time) {
        this.name = name;
        this.contents = contents;
        this.time = time;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
