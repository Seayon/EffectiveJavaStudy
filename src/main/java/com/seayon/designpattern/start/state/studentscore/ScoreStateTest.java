package com.seayon.designpattern.start.state.studentscore;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.state.studentscore
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 12:51 下午
 * @Version V1.0
 * @Description:
 */

public class ScoreStateTest {
    // 状态模式,通过状态类里面本身的处理来自动切换状态,对于调用者来说屏蔽了实现细节
    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.add(0);
        scoreContext.add(60);
        scoreContext.add(-1);
        scoreContext.add(-100);
        scoreContext.add(+200);


    }
}
