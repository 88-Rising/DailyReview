package cn.lkx.Daytwo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrows {

    public static void main(String[] args) throws IOException {
        readThisFile();
    }

    public static void readThisFile() throws IOException {

            FileReader reader = new FileReader("d:/a.txt") ;
            System.out.println("stepOne");
            char c1=(char)reader.read();
            System.out.println(c1);


            System.out.println("stepTwo");



            System.out.println("stepThree");

        }
    }


