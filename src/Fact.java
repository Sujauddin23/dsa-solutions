import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        BigInteger fact= BigInteger.ONE;
        for(int i=1; i<=n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
            System.out.println(fact);
        }

    }
}
