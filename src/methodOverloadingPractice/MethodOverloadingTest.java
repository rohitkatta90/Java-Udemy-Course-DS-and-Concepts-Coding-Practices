package methodOverloadingPractice;

public class MethodOverloadingTest {

        public int max(int a,int b)
        {
            return a>b?a:b;
        }

        public int max(int a,int b,int c)
        {
            if(a>b && a>c) return a;
            else if(b>c) return b;
            return c;
        }
    }

    class Overloading
    {
        public static void main(String[] args)
        {
            MethodOverloadingTest t=new MethodOverloadingTest();
            t.max(5,10);
            t.max(10,15,5);



        }
}
