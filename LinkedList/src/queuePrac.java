import java.util.LinkedList;
import java.util.Queue;

public class queuePrac {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
            queue.offer("fds");
            queue.add("weqrqqw");
            queue.offer("hello");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
