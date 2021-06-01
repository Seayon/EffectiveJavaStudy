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

public class ExcellentState extends AbstractState{

    public ExcellentState(AbstractState abstractState) {
        scoreContext = abstractState.scoreContext;
        stateName = "优秀";
        score = abstractState.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            scoreContext.setState(new LowState(this));
        } else if (score < 90) {
            scoreContext.setState(new MiddleState(this));
        }
    }
}
