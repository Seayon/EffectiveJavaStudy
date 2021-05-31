package com.seayon.designpattern.start.share;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ShareInString {
    public static void main(String[] args) {
        String s1 = "Seayon";
        String s2 = "Seayon";//s1 s2 都在常量池里面
        assertThat(s1 == s2, equalTo(true));
        String s3 = new String("Seayon");
        assertThat(s1 != s3, equalTo(true));
        String s4 = new String("Seayon");//new String() 的在堆里,所以不想等
        assertThat(s4 != s3, equalTo(true));
        String s5 = "Sea" + "yon";//编译优化,所以 s5 等于s1
        assertThat(s1 == s5, equalTo(true));
        String s6 = "Sea" + new String("yon");
        assertThat(s1 != s6, equalTo(true));
//        intern 可以将一个字符动态的放入常量池
//        使用 intern 动态放入常量池之前比较两个字符
        String str = "intern";
        String intern = new String("intern");
//        应该是不相等
        assertThat(str != intern,equalTo(true));
//        放入常量池,返回常量池的引用
        String intern1 = intern.intern();
//        这两个应该是相等的
        assertThat(str == intern1,equalTo(true));

    }
}
