import java.util.Arrays;

public class RemoveDuplicateElementsInArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 3, 5, 6, 1 };
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return array; // No duplicates possible
        }

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[n - 1]; // last element

        int[] uniqueArray = Arrays.copyOf(array, j);
        return uniqueArray;
    }
}
