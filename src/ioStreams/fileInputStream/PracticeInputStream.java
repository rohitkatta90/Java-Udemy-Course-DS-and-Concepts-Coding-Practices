package ioStreams.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeInputStream {

    public static void main(String args[]) throws IOException {


        FileInputStream fis = new FileInputStream("./resources/FileOutputStreamTest.txt");
        // Instead of FileInputStream class above we can just simply use FileReader and the rest of the code works fine.
        //System.out.print(fis.read()+"\n");

        //APPROACH - 1
//        byte[] b = new byte[fis.available()];
//        fis.read(b);
//        String str = new String(b);
//        System.out.println(str);

        // APPROACH - 2
        int x;
        while((x = fis.read()) != -1){
            System.out.print((char)x);
        }
    }
}
