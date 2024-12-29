public class DeleteElementInArray {
    public static void main(String[] args) {

        int A[] = new int[10];
        A[0] = 1;A[1] = 2;A[2] = 3;A[3] = 4;A[4] = 5;A[5] = 6;

        int n = 6; // Current number of elements in the array

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int indexToDelete = 2;

            for (int j = indexToDelete; j < n - 1; j++) {
                A[j] = A[j + 1];
            }
            n--;        //THIS LINE IS MANDATORY
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }
        }
    }
