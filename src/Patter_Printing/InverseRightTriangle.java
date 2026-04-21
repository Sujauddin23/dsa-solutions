package Patter_Printing;

import java.util.Scanner;

public class InverseRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=n-i;k>=1; k--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

