package com.seayon.javabase.chapter03;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter03
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/23 9:52 上午
 * @Version V1.0
 * @Description:
 */

public class ClassTest {
    @Test
    public void testClass() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Employee employee = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        Employee employee2 = new Manager("Carl Cracker", 75000, 1987, 12, 15);
        String name = employee.getClass().getName();
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("name = " + name);

        System.out.println("employee2.getClass().getName() = " + employee2.getClass().getName());
        System.out.println("employee2 instanceof Employee = " + (employee2 instanceof Employee));
        System.out.println("employee2 instanceof Employee = " + (employee2 instanceof Manager));
        System.out.println("employee2 instanceof Employee = " + (employee instanceof Employee));

        Random random = new Random();
        System.out.println("random.getClass().getName() = " + random.getClass().getName());
        try {
            Class<?> aClass = Class.forName("java.util.Random");
            System.out.println(aClass.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<Employee> employeeClass = Employee.class;
        Class<? extends Employee> aClass = employee.getClass();

        Class<Void> voidClass = void.class;
        System.out.println(voidClass.getName());

        System.out.println(Double[].class.getName());
        System.out.println(int[].class.getName());


    }

    @Test
    public void testCreateWithName() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String name = "java.util.Random";
        Random random = (Random) Class.forName(name).newInstance();
        System.out.println(random.nextInt(5));
        Employee employee = new Employee("Carl Cracker", 75000, 1987, 12, 15);

        Method method = Random.class.getMethod("nextInt",int.class);
        int invoke = (int) method.invoke(random,100);
        System.out.println(invoke);
    }

    @Test
    public void testConstructor() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?>[] constructors = Class.forName("java.lang.StringBuffer").getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.toString());
        }
        StringBuffer stringBuffer = (StringBuffer) constructors[1].newInstance(new String("测试反射添加的字符串"));
        System.out.println(stringBuffer.toString());
    }

    @Test
    public void testInvoke() {
        Employee employee = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        Method getName = null;
        try {
            getName = employee.getClass().getMethod("getName");
            String invoke = (String) getName.invoke(employee);
            System.out.println("invoke = " + invoke);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRan(){
        Random random = new Random();
        Method method = null;
        try {
            method = Random.class.getMethod("nextInt",int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            int invoke = (int) method.invoke(random,1.0);
            System.out.println(invoke);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
