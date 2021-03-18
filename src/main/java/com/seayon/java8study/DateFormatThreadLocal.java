package com.seayon.java8study;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.java8study
 * @Copyright 2018-2020 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2020/12/4 10:39 上午
 * @Version V1.0
 * @Description:
 */

public class DateFormatThreadLocal {
    private static final ThreadLocal<DateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd"));

    public static Date convert(String s) throws ParseException {
        return df.get().parse(s);
    }
}
