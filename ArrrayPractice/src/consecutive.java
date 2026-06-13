public class consecutive {
    public static void main(String[] args) {

        int arr[] = {1, 1, 1, 0, 1, 1, 1,1, 1, 1, 0,1,1,1,1,1};
        int streak= 0;
        int highest =0;
        for(int i =0 ; i<arr.length; i++){
            if (arr[i]==1){
                streak= streak +1;
                highest = Math.max(highest,streak);
            }
            else{
                streak=0;
            }
        }
        System.out.println(highest);
    }
}
