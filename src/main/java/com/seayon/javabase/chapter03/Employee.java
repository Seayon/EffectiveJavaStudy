package com.seayon.javabase.chapter03;

import java.time.LocalDate;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter03
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/21 11:01 上午
 * @Version V1.0
 * @Description:
 */
class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;

   public Employee(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Employee employee = (Employee) o;

      if (Double.compare(employee.salary, salary) != 0) return false;
      if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
      return hireDay != null ? hireDay.equals(employee.hireDay) : employee.hireDay == null;
   }

   @Override
   public int hashCode() {
      int result;
      long temp;
      result = name != null ? name.hashCode() : 0;
      temp = Double.doubleToLongBits(salary);
      result = 31 * result + (int) (temp ^ (temp >>> 32));
      result = 31 * result + (hireDay != null ? hireDay.hashCode() : 0);
      return result;
   }
}
