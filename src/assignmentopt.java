import java.util.Scanner;

public class assignmentopt {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        float x,y,z,s;
        double area;
        x = nums.nextFloat();
        y = nums.nextFloat();
        z = nums.nextFloat();
        //assignment opt--- +,-,*,/,% //
        /*
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        */


        // area of triangle
        area = (1f/2f)*x*y;
        System.out.println(area);
        s = (x+y+z)/2f;
        area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println(area);
    }
}
