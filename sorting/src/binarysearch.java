import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int a[] = {132, 234, 56879, 9, 342, 54, 67};
        Arrays.sort(a);
        int start =1; int end=a.length-1;
        int key =234;
        while(start<=end){
            int mid= (start+end)/2;
            if (a[mid]< key){
                start= mid+1;
            } else if (a[mid]>key) {
                end=mid-1;
            }
            else{
                System.out.println("index"+mid);
                System.exit(0);
            }
        }

    }
}
