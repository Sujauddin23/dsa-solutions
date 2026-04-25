package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MovesZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] num=new int[n];
        for(int i=0; i<n;i++){
            num[i]=sc.nextInt();
        }
        moveZeros(num);

    }
    static void moveZeros(int[] num){
        int j=0;
        for(int i=0;i< num.length;i++){
            if(num[i]!=0){
                num[j]=num[i];
                j++;
            }
        }
        while(j< num.length){
            num[j]=0;
            j++;
        }
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
}
