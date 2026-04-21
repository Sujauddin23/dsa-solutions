package Patter_Printing;

import java.util.Scanner;

public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            int sum=0;
            for(int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
                sum+=j;
            }
            System.out.println(sum);
            System.out.println(" ");
        }

    }

}
