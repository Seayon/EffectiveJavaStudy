package com.seayon.linklist;

import org.junit.Test;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.linklist
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/2 1:53 下午
 * @Version V1.0
 * @Description:
 */

public class ReverseList {

    public ListNode createIntList() {
        //创建链表头
        ListNode listNodeStart = new ListNode(0);
        //创建一个临时节点,指向链表头
        ListNode tempListNode = listNodeStart;

        for (int i = 1; i < 5; i++) {
            ListNode newNode = new ListNode(i);
            //临时节点的下一个指向新的节点,其实这时候链表头的下一个也指向了新的节点
            tempListNode.next = newNode;
            //将本临时节点指向刚才的链表末尾
            tempListNode = tempListNode.next;
        }
        return listNodeStart;
    }

    public void prettyPrintLinkList(ListNode listNode) {
        while (listNode != null && listNode.next != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
        if (listNode != null) {
            System.out.println(listNode.val);
        } else {
            System.out.println("空字符串");
        }
    }


    @Test
    public void testReverseList() {
        ListNode listNode = createIntList();
        prettyPrintLinkList(listNode);
        ListNode current = listNode;
        ListNode pre = null;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = pre;
            pre = current;
            current = tmp;
        }
        prettyPrintLinkList(pre);
    }
}
