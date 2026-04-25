package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int[]arr){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
                   }

        for(int i=0;i< arr.length;i++){
            if(arr[i]>secmax &&arr[i]!=max){
                secmax=arr[i];
            }
        }
        if(secmax==Integer.MIN_VALUE){
            return -1;
        }
        return secmax;
    }
}
