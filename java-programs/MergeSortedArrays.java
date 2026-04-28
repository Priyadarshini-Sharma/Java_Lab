public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) C[k++] = A[i++];
            else C[k++] = B[j++];
        }
        while (i < A.length) C[k++] = A[i++];
        while (j < B.length) C[k++] = B[j++];

        System.out.println("Merged sorted array:");
        for (int x : C)
            System.out.print(x + " ");
    }
}
