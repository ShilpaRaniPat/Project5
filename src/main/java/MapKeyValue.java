import java.util.*;

public class MapKeyValue {


    public Map hashmethod(LinkedHashMap<String,String> input) {
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();
         key1 = "";
         key2 = "";
         val1 = "";
        val2 = "";

        hashMap.put(key1, val1);
        hashMap.put(key2, val2);
        String newValue1 = hashMap.put(key1, " ");
        String newvalue2 = hashMap.put(key2, val1);


//    LinkedList ll = new LinkedList();
//    Iterator itr = hashMap.keySet().iterator();
//    while (itr.hasNext()) {
//        String k= itr.next();
//        ll.replace("");

        return hashMap;
    }
}
