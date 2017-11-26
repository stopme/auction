package com.auction.domain;

public class HeaderTag {
    private Integer tagId;

    private String tagName;

    private String tagType;

    private Integer tagSort;

    private Byte tagUsed;

    private Long createTime;

    private Long updateTime;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType == null ? null : tagType.trim();
    }

    public Integer getTagSort() {
        return tagSort;
    }

    public void setTagSort(Integer tagSort) {
        this.tagSort = tagSort;
    }

    public Byte getTagUsed() {
        return tagUsed;
    }

    public void setTagUsed(Byte tagUsed) {
        this.tagUsed = tagUsed;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}