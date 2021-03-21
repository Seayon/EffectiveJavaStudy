package com.seayon.javabase.chapter03;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This program tests the Employee class.
 *
 * @author Cay Horstmann
 * @version 1.12 2015-05-08
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
    }

    @Test
    public void testSwap() {
        Employee e1 = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        Employee e2 = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        swap(e1, e2);
        System.out.println("name=" + e1.getName() + ",salary=" + e1.getSalary() + ",hireDay=" + e1.getHireDay());
        System.out.println("name=" + e2.getName() + ",salary=" + e2.getSalary() + ",hireDay=" + e2.getHireDay());
        assertThat(e1.getName(), equalTo("Carl Cracker"));
        assertThat(e2.getName(), equalTo("Harry Hacker"));

        assertThat(e1.getSalary(), equalTo(75000.0));
        assertThat(e2.getSalary(), equalTo(50000.0));


    }

    public void swap(Employee e1, Employee e2) {
        Employee temp = e1;
        e1 = e2;
        e2 = temp;
    }
}
