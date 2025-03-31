package org.example.Observers;

public class StarSports implements Observer{

    @Override
    public void update(String state){
        System.out.println("Star Sports : " + state);
    }
}
