public class stock {
    public static void main(String[] args) {
        int a[] = {9,7,5,12,13,2,3,5,75,1};
        int sell=0;
        int low = a[0];
        for(int i= 0; i<a.length; i++){
            int profit = a[i]-low;
            if(profit>sell){
                sell=profit;
            }
            low= Math.min(a[i],low);
        }
        System.out.println(sell);
    }}




