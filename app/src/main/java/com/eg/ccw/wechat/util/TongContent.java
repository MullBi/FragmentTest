package com.eg.ccw.wechat.util;

import java.util.List;

/**
 * Created by Administrator on 2015/8/17.
 */
public class TongContent {
    private String cards;
    private List<TongImg> TongImgs;

    public TongContent(String cards, List<TongImg> TongImgs) {
        this.cards = cards;
        this.TongImgs = TongImgs;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }

    public List<TongImg> getTongImgs() {
        return TongImgs;
    }

    public void setTongImgs(List<TongImg> tongImgs) {
        this.TongImgs = tongImgs;
    }
}
