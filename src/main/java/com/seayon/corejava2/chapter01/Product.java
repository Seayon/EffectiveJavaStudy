package com.seayon.corejava2.chapter01;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.corejava2.chapter01
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/18 6:47 下午
 * @Version V1.0
 * @Description:
 */

@Data
@AllArgsConstructor
class Product implements Comparable<Product> {
    private Integer id;
    private String name;


    @Override
    public int compareTo(@NotNull Product o) {
        return this.getId().compareTo(o.getId());
    }
}
