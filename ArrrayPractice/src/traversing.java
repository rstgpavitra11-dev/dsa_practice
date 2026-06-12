public class traversing {
    public static void main(String[] args) {
        int A[] = {50,6,7,8,97,65};
        int b[] = new int[6];
        // from left to right
//        for(int i = 0; i<A.length; i++){
//            System.out.println(A[i]);
        // reverse
//        for(int i=A.length-1;i>=0;i--){
//            System.out.print(A [ i ] + " ");
        for(int x: A){
            System.out.println(x);
        }
    }
}
