package com.seayon.java8study;

import java.text.SimpleDateFormat;
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

public class Java8Time {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        DateFormatThreadLocal dateFormatThreadLocal = new DateFormatThreadLocal();
        simpleDateFormat.format(new Date());

        Callable<Date> callable = () -> DateFormatThreadLocal.convert("20201204");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Date>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            futures.add(executorService.submit(callable));
        }
        for (Future<Date> future : futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
