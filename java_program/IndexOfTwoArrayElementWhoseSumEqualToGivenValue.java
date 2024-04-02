public class IndexOfTwoArrayElementWhoseSumEqualToGivenValue {
    public static int[] findIndex(int arr[], int givenvalue) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i + j == givenvalue) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15, 3, 5, 6 };
        int givenvalue = 3;

        int indices[] = findIndex(arr, givenvalue);
        if (indices != null) {
            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }

}
