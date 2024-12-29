public class increseArrayLength {
        public static void main(String[] args) {
            int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int B[] = new int[2*A.length ]; // Increase size by 5
            System.out.print("Array of A is: ");
          for (int i : A) {
            System.out.print(i+" ");
          }
          System.out.println();
            for (int i = 0; i < A.length; i++) {
                B[i] = A[i];
            }
            // Print array C
            System.out.print("Array of B is: ");
            for (int i : B) {
                System.out.print(i + " ");
            }
        }
    }