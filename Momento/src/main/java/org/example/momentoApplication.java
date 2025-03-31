package org.example;

public class momentoApplication {
    public static momentoApplication instance;

    public momentoApplication(){}

    public synchronized static momentoApplication getInstance(){
        if(instance==null){
            instance = new momentoApplication();
        }
        return instance;
    }

    public void showMomentoDemo(){
        originator text = new originator("");

        careTaker textHistory = new careTaker(text);

        text.setState("Hi I am Jamal");

        textHistory.addHistory(text.save());

        textHistory.undo();

        textHistory.undo();

        text.setState("Meow");

        textHistory.addHistory(text.save());
    }
}
