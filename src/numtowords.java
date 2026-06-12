import java.awt.*;
import java.util.Scanner;


public class numtowords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        while (n > 0) {
            int r = n % 10;
            str = str + r;
            n = n / 10;
        }
        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0':System.out.print(" zero ");
                case '1': System.out.print(" one ");
break;

            }

        }
    }
}
