package org.example;

import org.example.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Observer> subscribers;
    String MainState;

    public Publisher(String initialState){
        this.MainState=initialState;
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Observer sub){
        subscribers.add(sub);
    }

    public void removeSubscriber(Observer sub){
        subscribers.remove(sub);
    }

    public void update(String state){
        this.MainState=state;
        updateSubscribers();
    }

    private void updateSubscribers() {
        for(Observer sub : subscribers){
            sub.update(MainState);
        }
    }

}
