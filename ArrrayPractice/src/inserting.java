import java.util.Scanner;

public class inserting {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0]= 89;
        a[1]=21;
        a[2]=34;
        a[3]=32;
        a[4]=54;
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int value = sc.nextInt();
        for(int i = a.length-1; i>index;i--){
            a[i]=a[i-1];

        }
        a[index]=value;
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
