package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        FileDirectory fileDirectory = FileDirectory.getInstance();
        fileDirectory.execute();
    }
}