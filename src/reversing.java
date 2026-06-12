import java.util.Scanner;

public class reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while(n>0){
            int r = n%10;
            reverse= r + reverse*10;
            n=n/10;

        }
        System.out.println(reverse);
    }
}
