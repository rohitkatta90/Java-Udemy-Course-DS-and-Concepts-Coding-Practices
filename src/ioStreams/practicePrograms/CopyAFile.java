package ioStreams.practicePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAFile {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("./resources/FileOutputStreamTest.txt");
        int x;
        String str="";
        while((x = fis.read()) != -1){
            str += (char)x;
        }
        System.out.println(str);
        FileOutputStream fos = new FileOutputStream("./resources/FileOutputStreamTestCopy.txt");
        fos.write(str.getBytes());
    }

}
