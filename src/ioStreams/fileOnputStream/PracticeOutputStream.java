package ioStreams.fileOnputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeOutputStream {
    public static void main(String args[]) throws IOException {
        FileOutputStream fos = new FileOutputStream("./resources/FileOutputStreamTest.txt");
        // absolute path to use in above line is: /Users/rkkatta/PracticePrograms/resources/FileOutputStreamTest.text
        String str = "Learn Input/Output Streams in Java";
        byte[] byteArray = str.getBytes();
        fos.write(byteArray);
        //fos.write(byteArray,0,10);
    }
}
