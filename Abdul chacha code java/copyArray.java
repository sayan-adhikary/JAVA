public class copyArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        System.out.print("A: ");
        for (int i : A) {
            System.out.print(i+" ");
        }
        System.out.println();
        int B[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        System.out.print("B: ");
        for (int i : B) {
            System.out.print(i+" ");
        }
    }
}