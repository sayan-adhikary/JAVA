public class reverceArray {
        public static void main(String[] args) {
            int A[]={1,2,3,4,5,6,7,8,9};
            int B[]=new int[A.length];
            int C[]=new int[B.length];
            for(int i=0;i<A.length;i++){
                B[i]=A[i];
            }
            //System.out.print("Array B is: ");
            for (int i : B) {
                System.out.print(i+" ");
            }
            System.out.println();
            for (int i = 0; i < B.length; i++) {
                C[i]=B[B.length-1-i];
            }
            for (int i : C) {
                System.out.print(i+" ");
            }
        }
    }


