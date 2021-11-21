package variableArguments;

public class MethodPractice {

    /*static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }*/

    static void inc(int...x)
    {
       for(int i:x)
        System.out.println(i);
    }

    public static void main(String[] args) {

        /*int a=10,b=15;
        //System.out.println(max(a,b));

        MethodPractice mp=new MethodPractice();
        System.out.println(mp.max(a,b));*/


        inc(10);
        inc(20,10,30);
        inc(new int[] {1,2,3,4,5,6,7}); //This is the anonymous array created on the fly. It means it gets deleted automatically after use


    }
}