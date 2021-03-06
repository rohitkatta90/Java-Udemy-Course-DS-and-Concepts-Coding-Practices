package udemyDSCourseByHolczerBalazs.arraysPrograms;

/*
In place algorithm means we have to print reverse Array without using extra memory.
This in turn means, we will need to use the same array to reverse it and should not declare any other array.
 */


public class ReversingAnArrayInPlace {

    //the running time complexity is O(N) + in-place algorithm (no need for extra memory)
    public int[] reverseArray(int[] nums) {

        //pointer to the first item
        int startIndex = 0;
        //pointer to the last item
        int endIndex = nums.length-1;

        //we swap 2 items in 1 iteration: so we just have to make N/2 iterations
        while(endIndex>startIndex) {

            //swap two items with index endIndex and startIndex
            swap(nums,startIndex,endIndex);

            //increment and decrement the indexes
            startIndex++;
            endIndex--;
        }

        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
