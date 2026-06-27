//javaimport java.util.Arrays;
//
//public class binarysearch {
//    public static void main(String[] args) {
//        int a[] = {132, 234, 56879, 9, 342, 54, 67};
//        Arrays.sort(a);
//        int start =1; int end=a.length-1;
//        int key =234;
//        while(start<=end){
//            int mid= (start+end)/2;
//            if (a[mid]< key){
//                start= mid+1;
//            } else if (a[mid]>key) {
//                end=mid-1;
//            }
//            else{
//                System.out.println("index"+mid);
//                System.exit(0);
//            }
//        }
//
//    }
//}
//### Problem
//```
//A coffee shop has listed prices: [2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0]
//
//Your friend has a budget of $4.20.
//
//Find the most expensive coffee they can afford (price ≤ budget).
public class binarysearch{
    public static void main(String[] args) {
        double[] prices= {2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0};
        double budget=4.2;
        int start =0,end=prices.length-1;
        double expensive =0.0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(prices[mid]<=budget){
                expensive=prices[mid];
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(expensive);
    }
}
