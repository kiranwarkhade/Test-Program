package demo;

public class Unique {
    public static void main(String[] args) {
    	
    	
        String input = "kirankiranS";
        String result = findUniqueCharacters(input);
        System.out.println("original characters: "+ input);
        System.out.println("Unique characters: " + result);
    }

    public static String findUniqueCharacters(String str) {
        StringBuilder uniqueChars = new StringBuilder(); 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString();
    }
}


   