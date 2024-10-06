package demo;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello world";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String with duplicates removed: " + result);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}

