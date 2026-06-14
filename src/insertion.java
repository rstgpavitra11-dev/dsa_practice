public class insertion {
    public static void main(String[] args) {
        int arr[] = {20, 10, 40, 15, 5};
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                   temp[i]=arr[j];
                   temp[j]=arr[i];
                }

            }


        }
        for (int x : temp){
            System.out.println(x);
        }
    }
}
