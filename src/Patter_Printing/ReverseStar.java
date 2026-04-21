package Patter_Printing;

import java.util.Scanner;

public class ReverseStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j+i<=n+1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
