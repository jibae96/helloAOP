package org.example.cse;

import lombok.Setter;

public class Cat implements AnimalType{

    @Setter
    private String myName;

    @Override
    public void sound() {
        System.out.println("Cat name=" + myName + "Meow");
    }
}
