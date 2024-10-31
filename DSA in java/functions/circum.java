package functions;
import java.util.*;

public class circum {
    public static double printCircumference (double r) {
        double c= 2* 3.14* r;
        return c;
     }

     public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        System.out.println(printCircumference(r) );
     }
    
}
