import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int lastdigit;

        while (num > 0) {
            lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
        }
        System.out.println("the reverse number is" + rev);
    }
}