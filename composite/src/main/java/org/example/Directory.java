package org.example;

import java.util.HashMap;

public class Directory implements FileSystem{
    String name;
    HashMap<String,FileSystem> files;
    HashMap<String,Directory> directory;

    public Directory(String name){
        this.name = name;
        files = new HashMap<>();
        directory = new HashMap<>();
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for(String fileName:files.keySet()){
            files.get(fileName).showDetails();
        }
        for(String dirNsme:directory.keySet()){
            directory.get(dirNsme).showDetails();
        }
    }

    public void addFile(String fileName){
        if(!files.containsKey(fileName)){
            File newFile = new File(fileName);
            files.put(fileName,newFile);
        }else{
            System.out.println("Filename: " + fileName + " Already exists.");
        }
    }

    public void addDirectory(String dirName){
        if(!directory.containsKey(dirName)){
            Directory newDirectory = new Directory(dirName);
            directory.put(dirName,newDirectory);
        }else{
            System.out.println("dirName: " + dirName + " Already exists.");
        }
    }

    public void addFile(String path,String fileName){
        
    }

    public void addDirectory(String path,String fileName){

    }

}
