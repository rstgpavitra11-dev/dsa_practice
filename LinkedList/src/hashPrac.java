import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashPrac {
    public static void main(String[] args) {
        Map<String,Integer> hash = new TreeMap<>();
        hash.put("jet",1);
        hash.put("cat",23);
        hash.put("car",25);
        hash.put("rat",43);
        System.out.println(hash.get("jet"));
        System.out.println(hash.containsValue(23));
        System.out.println(hash.containsValue(1));

        for (String sat: hash.keySet()){
            System.out.println(sat);

        }
        for(Integer val: hash.values()){
            System.out.println(val);

        }
        System.out.println(hash.size());
        hash.remove("jet");
        System.out.println(hash.size());
    }
}
