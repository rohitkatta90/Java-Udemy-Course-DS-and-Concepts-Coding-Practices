package methodOverriding;

class Super1
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");

    }
}

class Sub1 extends Super1
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub display.");

    }
}

public class OverrideRules {

    public static void main(String[] args) {

        Sub1 s1=new Sub1();

    }

}
