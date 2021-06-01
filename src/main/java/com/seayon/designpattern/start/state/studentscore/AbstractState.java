package com.seayon.designpattern.start.state.studentscore;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.state.studentscore
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 11:58 上午
 * @Version V1.0
 * @Description:
 */

public abstract class AbstractState {
    protected ScoreContext scoreContext;

    protected String stateName;

    protected int score;

    public abstract void checkState();


    public void addScore(int x) {
        score += x;
        System.out.print("加上了" + x + "分,当前分数" + score);
        checkState();
        System.out.println("分，\t当前状态：" + scoreContext.getState().stateName);
    }

}
