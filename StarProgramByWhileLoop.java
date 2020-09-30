public class whileLoop {

    public static void main(String[] args) {
        System.out.println("while loop triangle");
        int i,j;
        i=1;
        while(i<=5) {

            j = 1;
            while (j <= i) {
                System.out.println("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
