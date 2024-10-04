import java.util.List;
import java.util.ArrayList;

public class ListMethods {
    public static void main(String []args){
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
      
        list1.add(1);
        list1.add(2);
        list1.add(4);

        list1.add(2,3);
        list2.addAll(list1);
        list2.addAll(list2.size(),list2);  // To append same arrayList at the end
        System.out.println(list1.get(0));
        list1.set(0,10);   //Change the index element to specified value
        CollectionMethods.print2(list1,list2);
    }
}
