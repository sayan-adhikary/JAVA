public class sortingArrayString {
    public static void main(String[] args) {
        String A[]={"Java","Python","Pascale","Smalltalk","Ada","Basic"};

        java.util.Arrays.sort(A);

        for (String string : A) {
            System.out.println(string+" ");
        }
    }
}
