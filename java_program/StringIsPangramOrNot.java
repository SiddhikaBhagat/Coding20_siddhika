public class StringIsPangramOrNot {
    public static void main(String[] args) {
        String str = "Abcdefghijklmnopqrstuvwxyz";

        if (isPangram(str)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {

        str = str.toLowerCase();

        boolean[] present = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for (boolean value : present) {
            if (!value) {
                return false;
            }
        }

        return true;
    }
}
