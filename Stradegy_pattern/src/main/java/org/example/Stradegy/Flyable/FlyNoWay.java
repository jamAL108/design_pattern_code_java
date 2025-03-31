package org.example.Stradegy.Flyable;

public class FlyNoWay implements FlyStradegy{

    @Override
    public void fly(){
        System.out.println("I cannot fly");
    }
}
