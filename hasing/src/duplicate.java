import java.util.HashMap;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6};
        HashMap<Integer,Integer> map =new HashMap<>();
          for (int i = 0; i< arr.length; i++){
              if(map.containsKey(arr[i])){
                  System.out.println("true");
              }
              else{
                  map.put(arr[i],i);
              }
          }
    }
}

