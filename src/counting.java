import java.util.Scanner;

//counts how many digit num is the given num
public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(a>0){
            a= a/10;
            count++;
        }
        System.out.println(count);
    }
}