package udemyDSCourseByHolczerBalazs.arraysPrograms;

public class ReverseArrayInPlaceTest {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        ReversingAnArrayInPlace reverseArray = new ReversingAnArrayInPlace();

        int[] reversedArray = reverseArray.reverseArray(nums);

        for(int i=0;i<reversedArray.length;i++) {
            System.out.print(reversedArray[i]+" ");
        }
    }
}
