import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagram {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> anagram = new HashMap<>();
        for(String str : strs){
           char arr[]= str.toCharArray();
           Arrays.sort(arr);
           String key = String.valueOf(arr);
           if(!anagram.containsKey(key)){
               anagram.put(key, new ArrayList<>());
           }



            }
        }
    }

