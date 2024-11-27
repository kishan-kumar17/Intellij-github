import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num:");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("is a armstrong");
        } else {
            System.out.println("is a not a armstrong");
        }
    }
    public static boolean isArmstrong(int n){
        int originalnum = n;
        int result = 0;
        int digits = String.valueOf(n).length();
        while(n!=0){
            int digit = n % 10;
            result +=  Math.pow(digit,digits);
            n /= 10;

        }
         return result == originalnum;


    }
}
