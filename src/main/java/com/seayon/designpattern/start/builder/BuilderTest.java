package com.seayon.designpattern.start.builder;

public class BuilderTest {
    public static void main(String[] args) {

        Student build = Student.builder().age(18).build();
        System.out.println(build);

        Student build1 = Student.builder().gender("男生").name("赵旭阳").age(27).build();
        System.out.println(build1);

        try {

            Student.builder().gender("男生2").name("赵旭阳").age(27).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            assert e.getMessage().equals("性别只能是男生或女生!");
        }


    }
}
