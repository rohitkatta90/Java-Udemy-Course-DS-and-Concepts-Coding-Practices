package stringInBuiltFunctions;

public class StringFunctions {

    public static void main(String args[]){
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = "Program";
        String str5 = "   I love programming  ";

        System.out.println(str1);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        str5=str5.trim();
        String stringArray[] = str5.split(" ");
        System.out.println(stringArray.length);
        System.out.printf("Test for printf");

    }
}
