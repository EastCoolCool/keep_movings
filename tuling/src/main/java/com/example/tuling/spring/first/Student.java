package com.example.tuling.spring.first;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 下午2:26
 */
public class Student {

    @Value("${firstName}")
    private String firstName;

    @Value("${lastName}")
    private String lastName;

    @Value("#{28-9}")
    private Integer age;

    public Student(){
        System.out.println(this.firstName+this.lastName+this.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
