package Arrays;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotation(arr,k);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void rotation(int arr[], int k){
        int m=arr.length;
        k=k%m;
        if(k<0){
            k=k+m;
            reverse(arr,m-1,0);
            reverse(arr,k-1,0);
            reverse(arr,m-1,k);
        }
        reverse(arr,0,m-1);
        reverse(arr,0,k-1);
        reverse(arr,k,m-1);
    }
    static void reverse(int[] arr, int start, int end ){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
