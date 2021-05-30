package com.seayon.designpattern.start.builder;

import java.util.StringJoiner;

public class Student {

    public static class Builder {
        private String name;

        private int age;

        private String gender;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            if (gender != "男生" && gender != "女生") {
                throw new IllegalArgumentException("性别只能是男生或女生!");
            }
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this.name, this.age, this.gender);
        }


    }

    public static Builder builder() {
        return new Student.Builder();
    }

    private String name;

    private int age;

    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("gender='" + gender + "'")
                .toString();
    }
}
