import java.util.*;

public class CheckNumberIsAmstrongOrNot {
    public static int countdigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static boolean checkamstrongnumber(int num) {
        int mynum = num;
        int numberofdigits = countdigits(num);
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberofdigits);
            num = num / 10;
        }
        return sum == mynum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (checkamstrongnumber(num)) {
            System.out.println("The number is Amstrong");
        } else {
            System.out.println("The number is  not Amstrong");
        }

    }
}