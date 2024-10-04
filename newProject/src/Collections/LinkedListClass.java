import java.util.LinkedList;
import java.util.Collections;

public class LinkedListClass {
    public static void main(String []args){
        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> newList=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,-1);
        newList.addAll(list);
        // list.remove(0);
        // list.set(list.size()-1,list.get(0));
        // System.out.println(list.size());

                            // LinkedList => Exclusive Functions //

        list.addFirst(0);
        list.addLast(4);
        // list.removeFirst();
        // list.removeLast();
        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());
        // for(int x:list){
        //  System.out.println(x);
        // }
        // list.removeAll(newList);

                            // Collections => Exclusive Functions //

        // Collections.shuffle(list);
        // Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
