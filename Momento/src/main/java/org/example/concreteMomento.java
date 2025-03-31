package org.example;

public class concreteMomento implements Momento{
    public String state;

    public concreteMomento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
