package com.auction.domain;

public class AuctionFile {
    private Integer fileId;

    private String filePath;

    private Byte imageStay;

    private Long createTime;

    private Long updateTime;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Byte getImageStay() {
        return imageStay;
    }

    public void setImageStay(Byte imageStay) {
        this.imageStay = imageStay;
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