import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListClass {
    public static void main(String []args){
        ArrayList<Integer> al=new ArrayList<>();
        int []arr=new int[]{10,20,30,40,50};
        ArrayList newAl=new ArrayList(Arrays.asList(arr));
        al.add(2);
        al.add(0,1);
        al.add(3);
        // al.remove(0);
        // al.set(1,30);
        Collections.shuffle(newAl);
        Collections.sort(newAl);
        // Iterator<Integer> it=al.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }
        for(Object x:newAl){
            System.out.println(x);
        }
    }
}
