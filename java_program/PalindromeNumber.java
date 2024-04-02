import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindrome(int n) {
        int mynum = n;
        int rev = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;

        }
        if (mynum == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int mynum = sc.nextInt();
        if (palindrome(mynum)) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is  not palindrome");
        }

    }

}
