package udemyDSCourseByHolczerBalazs.arraysPrograms;

public class RepeatedIntegersInArrayProblemTest {

    public static void main(String args[]){
        // NOTE: All values of the array are smaller than the array size.
        int array[]={2,3,1,2,4,3};
        RepeatedIntegersInArrayProblem obj = new RepeatedIntegersInArrayProblem();
        System.out.println("\nBelow is Absolute value way to solve this and find repeated numbers: ");
        obj.absValueWay(array);
        //System.out.println("\nBelow is bruteforce way to solve this and find repeated numbers: ");
        //obj.bruteForce(array);
        //System.out.println("\nBelow is Hash Map way to solve this and find repeated numbers: ");
        //obj.hashMapWay(array);

    }
}
