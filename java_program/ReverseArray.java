public class ReverseArray {
    public static void reverse(int arr[]) {
        System.out.println("Reverse array is :");
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("original array is :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        reverse(arr);
    }

}
