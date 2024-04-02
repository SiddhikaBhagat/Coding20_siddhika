public class RotateArrayElementsLeftBy1position {
    public static void rotateleft(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void print(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Original array is :");
        print(arr);
        System.out.println("Array after rotating :");
        rotateleft(arr);
        print(arr);
    }
}
