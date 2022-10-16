package com.example.neopraelect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {
    public Department reader(String fileName) {
        Department dept = new Department();
        try {
            File file = new File(fileName);
            FileInputStream io = new FileInputStream(file);
            Scanner sc = new Scanner(io);
            while (sc.hasNextLine()) {
                String[] strArray = sc.nextLine().split(",");
                int code = Integer.parseInt(strArray[0].replace("CSC ", ""));
                dept.setCourse(new Course(code, strArray[1], new Professor(strArray[2], strArray[3], strArray[4])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return dept;
    }
}
