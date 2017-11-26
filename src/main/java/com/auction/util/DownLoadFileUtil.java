package com.auction.util;

/**
 * Created by Administrator on 2017/11/25.
 */
public class DownLoadFileUtil {
    public static final String downUrl = "http://localhost:8080/file/fetch";

    public static String getImageUrl (int imageId){
        return downUrl+"?fileId="+imageId;
    }
}
