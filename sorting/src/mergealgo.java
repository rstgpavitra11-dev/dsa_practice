public class mergealgo {
    public static void main(String[] args) {
        int a[] = {21,32,34,54,56,76,78};
        int b[] ={23,34,45,65,76,78,89};
        int c[] = new int[a.length+b.length];
        int i=0; int j=0; int n = a.length; int m= b.length;int k=0;
        while(i<n||j<m){
            if(i<n&&j<m){
                if(a[i]<b[j]){
                    c[k]=a[i];
                    k++;
                    i++;
                }
                else{
                    c[k]=b[j];
                    j++;
                    k++;
                }
            } else if (i<n) {
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }

        }
        for(int x : c){
            System.out.print(x+" ");
        }
    }

}
