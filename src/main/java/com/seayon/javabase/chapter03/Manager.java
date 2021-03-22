package com.seayon.javabase.chapter03;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter03
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/21 11:42 下午
 * @Version V1.0
 * @Description:
 */

public class Manager extends Employee {
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0.0;
    }

    private double bonus;

    @Override
    public double getSalary() {
        double salary = super.getSalary();
        return salary + this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
