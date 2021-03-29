package com.seayon.javabase.chapter06;


import com.seayon.javabase.chapter03.Employee;
import com.seayon.javabase.chapter03.EmployeeTest;
import org.junit.Test;

import java.util.Date;

public class CloneDemo {
    @Test
    public void test() throws CloneNotSupportedException {
        Employee employee = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        Date birthday = new Date();
        employee.setBirthday(birthday);
        Employee s = employee;
        employee.raiseSalary(5);
        System.out.println(s.getSalary());
        System.out.println(s.getBirthday());
        Employee clone = employee.clone();

        clone.raiseSalary(10);
        Date date = new Date();
        date.setTime(new Date().getTime()-10000);
        employee.setBirthday(date);

        System.out.println(clone.getSalary());
        System.out.println(s.getSalary());

        System.out.println(clone.getBirthday());
        System.out.println(s.getBirthday());

    }
}
