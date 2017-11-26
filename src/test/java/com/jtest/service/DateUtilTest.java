package com.jtest.service;

import com.auction.util.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 * Created by 李枝 on 2017/11/25.
 */
public class DateUtilTest {

    /**
     * 获取当天日期
     */
    @Test
    public void getNowDay(){

        System.out.println(DateUtil.convert2String(new Date(), "yyyy-MM-dd"));
        System.out.println(DateUtil.setStartDay(new Date()));
        System.out.println( DateUtil.convert2String(DateUtil.getHourClock(new Date(), 20), "yyyy-MM-dd HH:mm:ss"));
    }
}
