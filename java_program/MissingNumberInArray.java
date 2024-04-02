public class MissingNumberInArray {

    public static void missingnumber(int arr[]) {
        int n = arr.length + 1;
        int totalsum = (n * (n + 1)) / 2;// sum of 1st n natural numbers
        int arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum += arr[i];
        }
        int missingnumber = totalsum - arrsum;
        System.out.println(" The missing number in array is : " + missingnumber);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
        missingnumber(arr);
    }

}
