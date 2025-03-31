package org.example;

import java.util.ArrayList;
import java.util.List;

public class careTaker {
    originator Originator;
    List<Momento> history;

    public careTaker(originator Originator){
        this.Originator = Originator;
        history = new ArrayList<>();
    }

    public void addHistory(Momento snapShot){
        history.add(snapShot);
    }

    public void undo(){
        if(!history.isEmpty()){
            Momento lastSavedState = history.getLast();
            System.out.println(history.size());
            history.removeLast();
            Originator.restore(lastSavedState);
        }else{
            System.out.println("Nothing available to undo");
        }
    }

}
