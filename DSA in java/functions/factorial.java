package functions;
import java.util.*;

public class factorial {
    public static void printFactorial(int n) {
        int fact=1;
        for(int i=n; i>=1; i--) {  
            fact=fact*i;
        }
           System.out.println(fact);
           
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); {
            int n=sc.nextInt();

            printFactorial(n);  
          
        }

    }

   

    }

    

