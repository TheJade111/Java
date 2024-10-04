import java.util.HashSet;
import java.util.ArrayList;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet hset=new HashSet(100,(float)0.5);
        // Size of HashSet = 100 & load factor = 0.5 i.e size of hashset is increased after 50% of initial HashSet is filled!
        ArrayList arrList=new ArrayList();
        arrList.add(5.5);
        arrList.add(true);

        hset.add(1);
        hset.add(5.5);
        hset.add(true);
        hset.add('H');
        hset.add("Hello");
        // System.out.println(hset.add("Hello"));
        // System.out.println(hset.contains(5.5));
        // hset.remove('H');
        // hset.removeAll(arrList);
        // System.out.println(hset.containsAll(arrList));
        // System.out.println(hset);
        // for(Object x:hset){
        //     System.out.println(x);
        // }
    }
}
