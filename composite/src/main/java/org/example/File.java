package org.example;

public class File implements FileSystem{
    String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void showDetails(){
        System.out.println("File: " + name);
    }
}
