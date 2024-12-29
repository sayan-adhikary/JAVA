public class multiply2matrics {
    public static void main(String[] args) {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};

        int C[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                C[i][j]=0;
                for (int j2 = 0; j2 < 3; j2++) {
                    C[i][j]=C[i][j]+A[i][j2]*B[j2][j];
                }
            }
        }
        for (int x[] : C) {
            for (int is2 : x) {
                System.out.print(is2+" ");
            }
            System.out.println();
            }
        }
    }
