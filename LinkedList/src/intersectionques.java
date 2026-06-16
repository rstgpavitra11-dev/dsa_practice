import java.util.LinkedList;

public class intersectionques {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        node ten = new node(10);
        node twenty = new node(20);
        node thirty = new node(30);
        node forty = new node(40);
        node head = ten;
        ten.setNext(twenty);
        twenty.setData(21);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(null);
        LinkedList<Integer> lli = new LinkedList<>();
        node ten1 = new node(10);
        node forty4 = new node(40);
        node twenty2 = new node(20);
        node thirty3 = new node(30);

        node head1 = ten1;
        ten.setNext(forty4);
        forty4.setNext(twenty2);
        twenty2.setNext(thirty3);
        thirty3.setNext(null);
        main(ListN fp=head);

    }
    }
