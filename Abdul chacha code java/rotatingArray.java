public class rotatingArray {
    public static void main(String[] args) {
        int A[]={2,3,4,5,6,7,8,9,12,13,14,11};
        for (int i : A) {
            System.out.print(i+" ");
        }
        System.out.println();
        int temp=A[0];
        for (int i = 1; i < A.length; i++) {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for (int i : A) {
            System.out.print(i+" ");
            
        }
    }
}
