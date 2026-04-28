public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 3, 2};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " time(s)");
            }
        }
    }
}
