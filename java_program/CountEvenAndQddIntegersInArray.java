public class CountEvenAndQddIntegersInArray {
    public static void count(int arr[]) {
        int evenintegercount = 0;
        int oddintegercount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenintegercount += 1;
            } else {
                oddintegercount += 1;
            }
        }
        System.out.println("Even integers Count in array are: " + evenintegercount);
        System.out.println("Odd integers Count in array are: " + oddintegercount);
    }

    public static void main(String[] args) {
        int arr[] = { 76, 90, 87, 54, 65, 90, 89, 87, 84, 34, 20, 60, 79 };
        count(arr);
    }
}