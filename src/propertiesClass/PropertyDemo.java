package propertiesClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

    public static void main(String args[]) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/rkkatta/PracticePrograms/src/propertiesClass/Test.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("firstname"));
        System.out.println(prop.getProperty("address"));

        //setting property
        prop.setProperty("ageOfSpouse","26");
        System.out.println(prop.getProperty("ageOfSpouse"));

        //Now, below step will create a new text file with all the above properties stored in it.
        prop.store(new FileOutputStream("/Users/rkkatta/PracticePrograms/src/propertiesClass/Test.txt"),"Details");

        //Now, below step will create a new xml file with all the above properties stored in it.
        prop.storeToXML(new FileOutputStream("/Users/rkkatta/PracticePrograms/src/propertiesClass/TestXml.xml"),"Details");
    }
}
