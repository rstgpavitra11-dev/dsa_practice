public class secondlargest {
    public static void main(String[] args) {
                int a[] = {132, 234, 56879, 9, 342, 54, 67};
                int max = a[0];
                int max2 = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (a[i] >= max) {
                        max2 = max;
                        max = a[i];

                    }
                    else if(a[i]>= max2){
                        max2 = a[i];
                    }

                }
                System.out.println(max2);
            }}


