package com.seayon.linklist;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.linklist
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/2 1:54 下午
 * @Version V1.0
 * @Description:
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
