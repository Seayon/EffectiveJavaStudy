package com.seayon.javabase.chapter03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter03
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/23 2:36 下午
 * @Version V1.0
 * @Description:
 */

public class ReflectiveTest {
    public static void main(String[] args) {
        System.out.println("请输入完整类名:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Class<?> aClass = null;

        try {
            aClass = Class.forName(s);
        } catch (ClassNotFoundException e) {
            System.out.println(String.format("未找到类 %s ", s));
            System.exit(-1);
        }
        String modifiers = Modifier.toString(aClass.getModifiers());
        StringBuffer stringBuffer = new StringBuffer();
        if (modifiers.length() > 0) {
            stringBuffer.append(modifiers);
            stringBuffer.append(" ");
        }
        stringBuffer.append("class ");
        stringBuffer.append(aClass.getName());
        Class<?> superclass = aClass.getSuperclass();
        if (superclass != null && superclass != Object.class) {
            stringBuffer.append(" extends ");
            stringBuffer.append(superclass.getName());
        }
        stringBuffer.append(" \n { \n");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            stringBuffer.append("\t" + constructor.toString() + ";\n");
        }
        stringBuffer.append("\n");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            stringBuffer.append("\t" + method.toString() + ";\n");
        }

        stringBuffer.append("\n");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            field.setAccessible(true);
            stringBuffer.append("\t" + field.toString() + ";\n");
        }
        stringBuffer.append("\n}\n");
        System.out.println("类完整信息 = \n " + stringBuffer);
    }
}
