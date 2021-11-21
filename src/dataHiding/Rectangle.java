package dataHiding;

class Rectangle {
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public double area(){
        return length*breadth;
    }

    public void setLength(double l){
        if(l>0){
            length=l;
        }else{
            length=0;
        }
    }

    public void setBreadth(double b){
        if(b>0){
            breadth=b;
        }else{
            breadth=0;
        }
    }

    public double perimeter(){
        return 2*(length*breadth);
    }

    public boolean isSquare(){
        if(length==breadth){
            return true;
        }else
            return false;
    }
}

class RectangleTest{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        //r.length=10.5;
        //r.breadth=10.5;

        r.setLength(3);
        r.setBreadth(2);

        System.out.println("Area2: "+r.area());
        System.out.println("Permimeter2: "+r.perimeter());
        System.out.println("Is Square: "+r.isSquare());

        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
    }

}
