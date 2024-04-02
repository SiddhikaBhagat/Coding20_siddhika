
public class RotateArrayElementsLeftByKthPosition {
    public static void rotateLeft(int arr1[], int k) {
        int n = arr1.length;
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[(i + n - k) % n] = arr1[i];
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = arr2[i];
        }
    }

    public static void print(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 2;

        System.out.println("Original array: ");
        print(arr1);
        rotateLeft(arr1, k);
        System.out.println("Array after rotating ");
        print(arr1);
    }

}
