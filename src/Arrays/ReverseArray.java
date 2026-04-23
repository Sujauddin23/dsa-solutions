package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);//Pass by reference. This arr and reverseArray(arr) are pointing to same object arr.
        for(int val:arr){
            System.out.print(val+" ");
        }

    }
    static void reverseArray(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
