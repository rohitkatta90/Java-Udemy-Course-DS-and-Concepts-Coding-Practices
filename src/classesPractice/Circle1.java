package classesPractice;

public class Circle1 {
    public static void main(String args[]){

        Circle c = new Circle();
        Circle c2 = new Circle();
        c.radius=7;
        c2.radius=14;
        System.out.println("Area: "+c.area());
        System.out.println("Permimeter: "+c.perimeter());
        System.out.println("Circumference: "+c.circumference());

        System.out.println("Area2: "+c2.area());
        System.out.println("Permimeter2: "+c2.perimeter());
        System.out.println("Circumference2: "+c2.circumference());

    }
}

class Circle{
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
