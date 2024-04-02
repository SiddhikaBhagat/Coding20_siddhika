public class CommonElementsBetweenTwoArrays {
    public static void common(int arro[], int arrt[]) {
        boolean found = false;
        for (int i = 0; i < arro.length; i++) {
            for (int j = 0; j < arrt.length; j++) {
                if (arro[i] == arrt[j]) {
                    found = true;
                    System.out.print(arro[i] + " ");

                }

            }
        }
        if (!found) {
            System.out.print("no common elements are present ");
        }

    }

    public static void main(String args[]) {
        int i;
        int j;
        int arro[] = { 22, 51, 80, 45, 63, 10, 50 };
        int arrt[] = { 32, 63, 51, 90, 35, 20, 10 };
        // int arro[] = { 22, 51, 80, 45, 63, 10, 50 };
        // int arrt[] = { 32, 36, 15, 90, 35, 20, 11 };
        common(arro, arrt);

    }

}
