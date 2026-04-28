public class StringStats {
    public static void main(String[] args) {
        String str = "Hello World 123";

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))      upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch))     digits++;
            else if (ch == ' ')                 spaces++;
        }

        System.out.println("String         : " + str);
        System.out.println("Uppercase count: " + upper);
        System.out.println("Lowercase count: " + lower);
        System.out.println("Digits count   : " + digits);
        System.out.println("Spaces count   : " + spaces);
    }
}
