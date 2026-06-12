import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//         int i = 1;
//         int n = 100;
//         while(i<n){
//             System.out.println(i);
//             i= ++i;
//        do{
//            System.out.println(i);
//            i = ++i;
//        }while(i<n);
        Scanner sc =new Scanner(System.in);
        int j = sc.nextInt();
        int sum = 1;
        for(int p=j ; p>0; p-- ){

            sum=sum * p;
            System.out.println(sum);
        }

     }
    }

