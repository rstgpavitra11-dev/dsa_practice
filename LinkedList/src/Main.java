public class Main {
    public static void main(String[] args) {
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
        printlinkedlist(head);
    }

    public static void printlinkedlist(node head) {
        node curr = head;
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
