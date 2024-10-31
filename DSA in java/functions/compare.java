package functions;
import java.util.*;

public class compare {
    public static int compareTwoNo ( int a, int b) {
        if(a>b) 
        return a;
        else
        return b;
        }
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in); 
            int a= sc.nextInt();
            int b=sc.nextInt();

           System.out.println( compareTwoNo(a, b));
    }
    
}
