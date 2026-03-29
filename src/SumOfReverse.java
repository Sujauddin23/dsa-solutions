import java.util.Scanner;

public class SumOfReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int m=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println(rev+m);
    }
}
