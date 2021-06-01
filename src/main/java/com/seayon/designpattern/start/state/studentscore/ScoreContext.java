package com.seayon.designpattern.start.state.studentscore;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.state.studentscore
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 11:59 上午
 * @Version V1.0
 * @Description:
 */

public class ScoreContext {

    private AbstractState state;

    public ScoreContext() {
        this.state = new LowState(this);
    }

    public void add(int score) {
        state.addScore(score);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }
}
