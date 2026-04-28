public class SwapCase {
    public static void main(String[] args) {
        String str = "Hello World Java";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }

        System.out.println("Original  : " + str);
        System.out.println("Swapped   : " + result);
    }
}
