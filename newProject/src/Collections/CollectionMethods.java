import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class CollectionMethods{
    public static void main(String []args){
        Collection<Integer> c1Collection=new ArrayList<>();
        Collection<Integer> c2Collection=new ArrayList<>();
        c1Collection.add(1);
        c1Collection.add(2);
        c1Collection.add(3);
        
        c2Collection.add(2);
        c2Collection.add(3);
        c2Collection.add(4);

        // c1Collection.addAll(c2Collection);
        // c1Collection.remove(1);
        // c1Collection.removeAll(c2Collection);
        // c1Collection.retainAll(c2Collection);
        // System.out.println(c1Collection.isEmpty());
        // System.out.println(c1Collection.contains(2));
        // System.out.println(c1Collection.containsAll(c2Collection));

        for(int x:c1Collection){
            System.out.print(x+" ");
        }

        System.out.println();

        for(int x:c2Collection){
            System.out.print(x+" ");
        }
    }

    // Helper function to print two ArrayList; to be used in another class
    public static void print2(List<Integer> l1,List<Integer> l2){
        for(int x:l1){
            System.out.print(x+" ");
        }

        System.out.println();

        for(int x:l2){
            System.out.print(x+" ");
        }
    }
}