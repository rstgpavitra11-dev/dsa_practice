//## 🎯 PRACTICE 2: Temperature Alert System
//
//### Problem
//```
//A factory monitors temperature: [68, 69, 71, 74, 78, 82, 85, 89, 92, 95, 98]
//
//Set an alert when temperature FIRST exceeds 80°C.
//
//Find the index of first temperature that triggers the alert.
public class q2 {
    public static void main(String[] args) {
        int [] temperature= {68, 69, 71, 74, 78, 82, 85, 89, 92, 95, 98};
        int start =0, end=temperature.length-1;
        int alert = 80;
        int ans =1;
        while(start<=end){
            int  mid = start+ (end - start)/2;
            if(temperature[mid]>=alert){
                end =mid-1;
                ans=temperature[mid];
            }
            else{
                start=mid+1;
            }

        }
        System.out.println(ans);
    }
}
