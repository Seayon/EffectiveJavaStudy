package com.seayon.designpattern.start.state.studentscore;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.state.studentscore
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 12:05 下午
 * @Version V1.0
 * @Description:
 */

public class LowState extends AbstractState {

    public LowState(ScoreContext scoreContext) {
        this.scoreContext = scoreContext;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState abstractState) {
        scoreContext = abstractState.scoreContext;
        stateName = "不及格";
        score = abstractState.score;
    }

    @Override
    public void checkState() {
        if (score >= 90) {
            scoreContext.setState(new ExcellentState(this));
        } else if (score >= 60) {
            scoreContext.setState(new MiddleState(this));
        }
    }
}
