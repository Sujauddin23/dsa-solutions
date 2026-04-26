package Arrays;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int result= maximumSubarraySum(arr);
        System.out.println(result);

    }
    static int maximumSubarraySum(int[]arr){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
            if(sum>max_sum){
                max_sum=sum;
            }
            }

        }
        return max_sum;
    }

}
