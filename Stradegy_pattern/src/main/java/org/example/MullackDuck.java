package org.example;

import org.example.Stradegy.Flyable.FlyNoWay;
import org.example.Stradegy.Quack.QuackStradegy;
import org.example.Stradegy.Quack.QuackWhichSqweeks;

public class MullackDuck extends Duck{

    public MullackDuck() {
        FlyBehaviour = new FlyNoWay();
        QuackBehaviour = new QuackWhichSqweeks();
    }

    public void display(){
        System.out.println("I am Mullack Dock Boss");
    }
}
