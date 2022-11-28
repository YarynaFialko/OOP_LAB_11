package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
//@AllArgsConstructor
public class Client {
    private static int count = 0;
    private int id;
//    private final int id;
    private String name;
    private int age;
    private String email;

    public Client(String name, String email) {
        id = count++;
        this.name = name;
        this.email = email;
    }
}
