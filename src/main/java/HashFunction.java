import java.util.*;

public class HashFunction {


    public ArrayList myfunction(String s) {

        //Set mySet = new HashSet();
        TreeSet myTreeSet = new TreeSet(Arrays.asList(s.split(" ")));
       // myTreeSet.addAll(myTreeSet);
        ArrayList sortedList = new ArrayList(myTreeSet);
       // Collections.sort(sortedList);
        return sortedList;
    }
}
