package Arrays;

import java.util.Scanner;

public class ArraySubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int m=sc.nextInt();
        int[]b =new int[m];
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        int[]diff=new int[n>m?n:m];
        int borrow=0;
        int i=a.length-1;
        int j=b.length-1;
        int k=diff.length-1;
        while(k>=0){
            int d=a[i]-b[i]-borrow;
            if(d<0){
                d=d+10;
                borrow=1;
            }
            else {
                borrow=0;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        for(int val:diff){
            System.out.println(val);
        }
    }
}
