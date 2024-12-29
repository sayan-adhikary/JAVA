public class GCD {                      //Greatest Common Divisor
     int gcd(int n,int m){
        while (m!=n) {
            if (m>n)
             m=m-n;
            else 
             n=n-m;
        
    }
    return m;
}
public static void main(String[] args) {
    GCD X=new GCD();
        System.out.println(X.gcd(25,15 ));
}
}
