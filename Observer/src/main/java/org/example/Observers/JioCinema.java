package org.example.Observers;

public class JioCinema implements Observer{
    @Override
    public void update(String state){
        System.out.println("Jio Cinema : " + state);
    }
}
