
public class conversion {
    public static void main(String[] args) {
        int a = 127;
        byte k = (byte)a;
        float f = 5.7f;
        int t = (int) f;
        System.out.println(k);
        System.out.println(t); // we will lost the point value in integer format
    }
    
}
