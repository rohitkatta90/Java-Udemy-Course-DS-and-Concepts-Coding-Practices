package genericsDemo;

public class GenericDemo {

    public static void main(String args[]){
        Object obj[] =  new Object[3];
        obj[0]="Hi";
        obj[1]="Bye";
        obj[2]=3;//This statement should throw an error but it throws at Runtime

        for(int i=0;i<obj.length;i++){
            String str = (String)obj[i];
            System.out.println(str);
        }
    }


// Below is the Generic Class creation.
//If any method is created Generic then the entire class should also be Generic
// Generic class reference should always point to Object class and then object class should be type casted to generic.
public static class GenericDemo1<T>{ //Here the class is generic

        T[] A =(T[]) new Object[10]; //Generic Class
        int length=0;
        public void append(T value){
            A[length++]=value;
        }
        public void display(){
            for(int i=0;i<length;i++){
                System.out.println(A[i]);
            }
    }
    public static void main(String args[]){
            GenericDemo1<Integer> gen= new GenericDemo1<>(); // Here Integer type generic class is created.
            gen.append(10);
            gen.append(20);
            gen.append(30);
            gen.display();

        GenericDemo1 gen1= new GenericDemo1<>(); // Here since data type is not give it will be considered as an object.
        gen1.append("Hello");
        gen1.append("Rohit");
        gen1.append(30);
        gen1.display();

    }
}


}
