package com.example.neopraelect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    public Department reader(String fileName) {
        Department dept = new Department();
        try {
            File file = new File(fileName);
            FileReader read = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(read);
            while (buffRead.ready()) {
                String[] strArray = buffRead.readLine().split(",");
                int code = Integer.parseInt(strArray[0].replace("CSC ", ""));
                dept.setCourse(new Course(code, strArray[1], new Professor(strArray[2], strArray[3], strArray[4])));
            }
            buffRead.close();
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO mess");
        }
        return dept;
    }
}
