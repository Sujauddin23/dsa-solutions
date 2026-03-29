import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        System.out.println(sum);
         productOfN(1234);
         evenNumberSum(1234);
    }

     static void productOfN(int n){
        int product=1;
        while(n!=0){
            int lastDigit=n%10;
            product*=lastDigit;
            n/=10;
        }
        System.out.println(product);
    }
    static void evenNumberSum(int m){
        int sum=0;
        while(m !=0){
            int lastDigit= m %10;
            if(lastDigit%2==0){
                sum+=lastDigit;
            }
        m/=10;
        }
        System.out.println(sum);
    }
}

