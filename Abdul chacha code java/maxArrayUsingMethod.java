public class maxArrayUsingMethod {
        static int max(int[] A) {
    
            int max = A[0]; 
            for (int i = 1; i < A.length; i++) {
                if (A[i] > max) {
                    max = A[i]; 
                }
            }
            return max; 
        }
    
        public static void main(String[] args) {
            int A[]={1, 2, 3, 4, 5, 6, 22, 12};
            System.out.println(max(A)); 
        }
    }
    

