import java.util.Scanner;

public class conditionss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0 && a<=14){
            System.out.println("child");
        }
        else if(a<=55){
            System.out.println("young");
        }
        else{
            System.out.println("old");
        }
    }
}
