public class SortingFirstHalfOfArrayinAsceandSecondHalfinDecsOrder {
    public static void firsthalf(int arr[]) {
        for (int i = 1; i <= arr.length / 2; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;

        }
    }

    public static void secondhalf(int arr[]) {
        for (int k = arr.length / 2 + 1; k < arr.length; k++) {
            int curr = arr[k];
            int previ = k - 1;
            while (previ >= arr.length / 2 && arr[previ] < curr) {
                arr[previ + 1] = arr[previ];
                previ--;
            }
            arr[previ + 1] = curr;

        }
    }

    public static void print(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 1, 0, 5, 2, 9, 3, 7 };
        firsthalf(arr);
        secondhalf(arr);
        print(arr);
    }
}
