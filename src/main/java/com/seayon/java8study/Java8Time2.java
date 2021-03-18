package com.seayon.java8study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.java8study
 * @Copyright 2018-2020 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2020/12/4 10:13 上午
 * @Version V1.0
 * @Description:
 */

public class Java8Time2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        LocalDateTime of = LocalDateTime.of(2020, 12, 2, 20, 2);

        LocalDateTime localDateTime = of.plusYears(1);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusMonths(1);
        Month month = localDateTime1.getMonth();
        int i = month.maxLength();
        System.out.println("month.minLength() = " + month.minLength());
        System.out.println("i = " + i);

    }
}
