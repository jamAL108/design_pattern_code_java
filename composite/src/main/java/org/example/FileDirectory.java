package org.example;

public class FileDirectory {
    public static FileDirectory instance;


    public FileDirectory(){}

    public static synchronized FileDirectory getInstance(){
        if(instance==null){
            instance = new FileDirectory();
        }
        return instance;
    }

    public void execute(){

    }
}
