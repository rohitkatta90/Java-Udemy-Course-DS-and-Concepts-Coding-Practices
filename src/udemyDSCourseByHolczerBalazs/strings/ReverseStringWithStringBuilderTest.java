package udemyDSCourseByHolczerBalazs.strings;

import java.lang.reflect.Method;

public class ReverseStringWithStringBuilderTest {

    public static void main(String args[]){
        String str = "Rohit Katta";
        ReverseStringWithStringBuilder obj = new ReverseStringWithStringBuilder();
        System.out.println(obj.revertString(str));


        // Reflection in Java
        /*Class<String> stringClass = String.class;
        System.out.println(stringClass.getPackage());
        Method[] strMethods=stringClass.getMethods();
        for(Method x:strMethods){
            System.out.println(x);
        }*/
    }
}
