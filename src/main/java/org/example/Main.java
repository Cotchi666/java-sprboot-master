package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        SuperMan superMan = new SuperMan();
        superMan.setDateOfBirth(LocalDateTime.now());
        superMan.setName("loda");
        System.out.println(superMan.getName());
        String json =JsonNameProcessor.toJson(superMan);
        System.out.println(json);
    }

}