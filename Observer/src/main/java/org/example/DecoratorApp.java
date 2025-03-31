package org.example;

import org.example.Observers.JioCinema;
import org.example.Observers.Observer;
import org.example.Observers.StarSports;

public class DecoratorApp {
    public static DecoratorApp instance;

    public DecoratorApp(){}

    public synchronized static DecoratorApp getInstance(){
        if(instance==null){
            instance = new DecoratorApp();
        }
        return instance;
    }

    public void execute(){
        Observer starSportsLive = new StarSports();
        Observer jioCinemaLive = new JioCinema();

        Publisher pub  = new Publisher("India vs Pakistan");
        pub.addSubscriber(starSportsLive);
        pub.addSubscriber(jioCinemaLive);

        pub.update("India Choose to bowl first");

        System.out.println("Attitude from jio cinema");
        pub.removeSubscriber(jioCinemaLive);

        pub.update("India: - 234/2 in 30 overs");

    }
}
