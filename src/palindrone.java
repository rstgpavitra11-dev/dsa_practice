import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int reverse = 0;
        while(n>0){
            int r = n%10;
            reverse= r + reverse*10;
            n=n/10;

        }
        if(reverse == m){
            System.out.println("palindrone");
        }
        else {
            System.out.println("not");
        }
    }
}
