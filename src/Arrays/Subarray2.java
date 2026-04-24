package Arrays;
//Subarray equals to k
import java.util.Scanner;

public class Subarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subarray(arr);

    }
    static void subarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i; j< arr.length;j++){
                sum=sum+arr[j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
    }

}
