package com.auction.vo;

import java.util.List;

/**
 * Created by Administrator on 2017/11/26.
 */
public class AuctionUserVO {

    private Integer id;

    private String openId;

    private String nickname;

    List<AuctionTimeLineVO> timeLines;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<AuctionTimeLineVO> getTimeLines() {
        return timeLines;
    }

    public void setTimeLines(List<AuctionTimeLineVO> timeLines) {
        this.timeLines = timeLines;
    }
}
