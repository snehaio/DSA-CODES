package functions;
import java.util.*;

public class q2 {
    public static int addTwoNumbers(int a, int b) {
        int sum=a+b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       int sum = addTwoNumbers(a,b); //calling function
       System.out.println(sum);
    }
    
}
