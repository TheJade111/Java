import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;

public class HashMapClass{
    public static void main(String[] args) {
        HashMap<Object,Boolean> hm=new HashMap<>();
        HashMap<Object,Boolean> hm2=new HashMap<>();
        for(int i=0;i<10;i++){
            hm.put("Object "+i,false);
        }
        hm2.putAll(hm);
        // System.out.println(hm2.keySet());
        hm.put("Object 1",true);
        hm.remove("Object 0");
        // System.out.println(hm.get("Object 09"));
        // System.out.println(hm.containsKey("Object 1"));
        // System.out.println(hm.containsValue(null));
        // System.out.println(hm.keySet());
        // System.out.println(hm.values());
        // System.out.println(hm.entrySet());
        for(Object x:hm.keySet()){
            System.out.println(x+" => "+hm.get(x));
        }
    }
}
