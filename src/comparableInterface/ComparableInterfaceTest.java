package comparableInterface;

import java.util.TreeSet;

public class ComparableInterfaceTest {

    public static void main(String args[]){

        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(2,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        ts.add(new Point(1,1));

        System.out.println(ts);
    }
}

class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if(this.x<p.x){
            return -1;
        }else if(this.x>p.x){
            return 1;
        }else{
            if(this.y<p.y){
                return -1;
            }else if(this.y>p.y){
                return 1;
            }else
                return 0;
        }

    }
    public String toString(){

        return "X="+x+","+"Y="+y;
    }
}