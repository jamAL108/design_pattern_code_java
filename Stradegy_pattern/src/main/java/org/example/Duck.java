package org.example;

import org.example.Stradegy.Flyable.FlyStradegy;
import org.example.Stradegy.Quack.QuackStradegy;

public abstract class Duck {
    FlyStradegy FlyBehaviour;
    QuackStradegy QuackBehaviour;

    public Duck(){}

    public void performFly(){
        FlyBehaviour.fly();
    }

    public void performQuack(){
        QuackBehaviour.Quack();
    }

    public void setFlyBehaviour(FlyStradegy fb) {
        FlyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackStradegy qb){
        QuackBehaviour = qb;
    }

    public abstract void display();

    public void swim(){
        System.out.println("All Ducks as swim, So i can also swim buddy");
    }
}
