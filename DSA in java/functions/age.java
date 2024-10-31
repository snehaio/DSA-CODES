package functions;
import java.util.*;

public class age {
    public static void eligibility(int age) {
        if(age>18)
        System.out.println("eligible to vote");
        else
        System.out.println(" not eligible to vote");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int age= sc.nextInt();
        eligibility(age);
     
    }
    
}
