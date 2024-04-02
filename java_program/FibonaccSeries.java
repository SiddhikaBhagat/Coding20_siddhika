import java.util.Scanner;

public class FibonaccSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number up to which we want the fabonaccseries");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;// zerothterm
        int y = 1;// firstterm
        System.out.print(x + " " + y);
        int nextterm;
        for (int i = 2; i < n; i++) {
            nextterm = x + y;
            x = y;
            y = nextterm;
            System.out.print(" " + nextterm);
        }

    }
}
