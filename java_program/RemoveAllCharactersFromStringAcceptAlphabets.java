public class RemoveAllCharactersFromStringAcceptAlphabets {

    public static void main(String[] args) {
        String str = "Hello123 World!";

        String result = removeNonAlphabets(str);
        System.out.println("Original string: " + str);
        System.out.println("String with only alphabets: " + result);
    }

    public static String removeNonAlphabets(String str) {

        String regex = "[^a-zA-Z]";

        String result = str.replaceAll(regex, "");

        return result;
    }
}
