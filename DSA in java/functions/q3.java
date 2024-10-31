package functions;
import java.util.*;

public class q3 {
    public static int multiplyTwoNumbers(int a, int b) {
        int product=a*b;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       int product = multiplyTwoNumbers(a,b); //calling function
       System.out.println(product);
    }
    
}

