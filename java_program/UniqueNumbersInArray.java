import java.util.HashSet;

public class UniqueNumbersInArray {
    public static void printUniqueNumbers(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num);
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 1, 5 };
        System.out.println("Unique numbers in the array:");
        printUniqueNumbers(arr);
    }
}
