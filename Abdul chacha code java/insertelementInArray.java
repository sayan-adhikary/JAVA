public class insertelementInArray {
    public static void main(String[] args) {

        int A[]=new int[10];
        A[0]=1;A[1]=2;A[2]=3;A[3]=4;A[4]=5;A[5]=6;

        int n=6;

        for (int i=0;i<n;i++) 
            System.out.print(A[i]+" ");
            System.out.println();
            int x=9;
            int index=2;

            for (int j = n; j > index; j--) {
                A[j]=A[j-1];
            }
            A[index]=x;
            
            n++;                    //THIS LINE IS MANDATORY

            for (int i=0;i<n;i++) {
                System.out.print(A[i]+" ");
            }
        }
    }