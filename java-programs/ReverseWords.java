public class ReverseWords {
    public static void main(String[] args) {
        String str = "This is a test";

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }

        System.out.println("Original : " + str);
        System.out.println("Reversed : " + result);
    }
}
