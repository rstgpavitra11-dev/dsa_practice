public class shufflear {
    public static void main(String[] args) {
        int nums[] ={12,32,34,54,65,67};
        int arr[] = new int[nums.length];
        int n =3;
        for(int i = 0; i<n ; i++){
            arr[2*i]= nums[i];
            arr[2*i+1]=nums[i+n];
        }

        for (int x : arr){

            System.out.println(x);
        }

    }
}
