package org.example;


public class originator {
    public String state;

    public originator(String state){
        this.state = state;
    }

    public Momento save(){
        return new concreteMomento(state);
    }

    public void setState(String state){
        this.state = state;
    }

    public void restore(Momento lastSavedState){
        if (lastSavedState instanceof concreteMomento) {
            this.state = ((concreteMomento) lastSavedState).getState(); // Accesses state safely
            System.out.println(this.state);
        }
    }
}
