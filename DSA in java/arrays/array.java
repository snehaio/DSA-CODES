import java.util.*;
public class array {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    int prices []= new int[100] ;
	float sum=0, product = 1 ;
	float avg=0;
	int i;
	System.out.println(" enter the price of 5 items");
	for(i=1;i<=5;i++){
		System.out.println("enter prices for item ");
		prices [i]= sc.nextInt();
		
    }
	for(i=1;i<=5;i++){
		sum+=prices[i];
		product*=prices[i];
		avg = sum/5;
		
	}
	
	System.out.println("sum=" + sum);
	System.out.println("product" + product);
	System.out.println("average=" + avg);
}
}