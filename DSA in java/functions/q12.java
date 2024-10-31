package functions;
import java.util.*;

public class q12 {
    public static double power(double x ,double n) {
        double v= Math.pow(x, n);
        return v;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        double x= sc.nextDouble();
        double n=sc.nextDouble();

   System.out.println( power(x,n));
   

    }
    
}
