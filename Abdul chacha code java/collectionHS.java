import java.util.*;
public class collectionHS {

    public static void main(String[] args) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);     //bucket index=hash(element)&(capacity−1)
        
        System.out.println(hs);     //[20, 10, 30]  {(Bucket 4  → 20) (Bucket 10 → 10) (Bucket 14 → 30) (All other buckets empty)}
    }
    
}
