import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer add[]= {12,23,34,54,5,87,89};
        stack.addAll(Arrays.asList(add));
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search(34));
        System.out.println(stack.);

    }
}
