package abstractClass;

public class Test {

  public static void main(String args[]){
      int A[] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,14,15,16,17,18,19,20};
      int length = A.length;
      int target = 25;
      //bruteforceMethod(A, length, target);
      optimalMethod(A, length, target);
  }

    private static void optimalMethod(int[] a, int length, int target) {

      int low=0;
      int high = length-1;

      while(low < high){
          if(a[low] + a[high] < target){
              low++;
          }else if(a[low] + a[high] > target){
              high--;
          }else if(a[low] + a[high] == target){
              System.out.println("["+a[low]+","+a[high]+"]");
              high--;
              low++;
          }
      }
    }

    public static void bruteforceMethod(int A[], int length, int target) {

      for(int i = 0 ; i < length ; i++){
          for(int j = i+1 ; j < length ; j++){

              if(A[i] == target - A[j]){
                  System.out.println("["+A[i]+","+A[j]+"]");
              }
          }
      }

    }
}
