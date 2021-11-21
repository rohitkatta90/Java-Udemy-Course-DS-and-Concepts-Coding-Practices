package methodOverriding;

class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}


class DynamicMethodDispatch//This is the important concept in Java
{
    public static void main(String[] args)
    {
        Super sup=new Super();
        sup.display();

        Sub sub=new Sub();
        sub.display();

        Super s=new Sub();
        s.display();

    }
}
