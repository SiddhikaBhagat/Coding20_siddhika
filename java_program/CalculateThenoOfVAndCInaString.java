public class CalculateThenoOfVAndCInaString {

    public static void main(String[] args) {
        String str = "Hello World";

        int[] counts = countVowelsAndConsonants(str);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    public static int[] countVowelsAndConsonants(String str) {
        str = str.toLowerCase();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        return new int[] { vowelsCount, consonantsCount };
    }
}
