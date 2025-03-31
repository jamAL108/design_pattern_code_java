package org.example;

import org.example.Stradegy.Flyable.FlyWithRocketSpeed;
import org.example.Stradegy.Quack.QuackNoQuack;

public class DuckStradegy {

    public static DuckStradegy instance;

    public DuckStradegy(){}

    public synchronized static DuckStradegy getInstance(){
        if(instance==null){
            instance = new DuckStradegy();
        }
        return instance;
    }

    public void performDuckOperations(){
        Duck Mullack = new MullackDuck();
        Mullack.display();
        Mullack.performFly();
        Mullack.setFlyBehaviour(new FlyWithRocketSpeed());
        Mullack.performFly();

        Mullack.performQuack();
        Mullack.setQuackBehaviour(new QuackNoQuack());
        Mullack.performQuack();
        System.out.println("Completed");
    }
}
