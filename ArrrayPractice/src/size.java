import java.util.Arrays;

public class size {
    public static void main(String[] args) {
        int a[] = {132, 234, 56879, 9, 342, 54, 67};
        int b[] = new int[7];
        for (int i = 0; i < a.length; i++) {
            b[b.length-1 - i]=a[i];
        }
        System.out.println( Arrays.toString(b));
        System.out.println(Arrays.equals(a,b));
        
        }
    }

