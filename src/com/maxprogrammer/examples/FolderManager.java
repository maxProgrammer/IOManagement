package com.maxprogrammer.examples;

import java.io.File;
import java.util.Scanner;

public class FolderManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");

        for(File folder: folders){
            System.out.println(folder);
        }

        System.out.println("------------------");

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file: files){
            System.out.println(file);
        }

        //cria um subdiretório
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + sucess);

    }
}
