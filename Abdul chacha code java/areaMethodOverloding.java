public class areaMethodOverloding {
    static double area(double x,double y){
        return x*y;
    }
    static double area(double x){
        return Math.PI*x*x;
    }
    static double area(double x,double y,double z){
        return z*x*y;
    }
public static void main(String[] args) {
    System.out.println(area(3,4,8));
}
}
