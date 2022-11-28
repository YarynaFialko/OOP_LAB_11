package org.example.builder;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular (value = "occupation")
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder().name("Anna").gender(Gender.FEMALE).height(5.5).occupation("UCU").weight(123).build();
        System.out.println(user);
    }

//    public User builder(String name, int age, Gender gender, double weight, double height) {
//        return builder().name(name).age(age).gender(gender).weight(weight).height(height).build();
//    }
//
//    public User builder(String name, int age, Gender gender) {
//        return builder().name(name).age(age).gender(gender).build();
//    }
//
//    public User builder(String name, Gender gender) {
//        return builder().name(name).gender(gender).build();
//    }
//
//    public User builder(String name) {
//        return builder().name(name).build();
//    }
}