package functions;
public class oddsum {
    public static void printSumOfOdd () {
        int a=0;
     for(int i=1;i<=10;i++) {
        if((i%2)!=0) 
        a=a+i;
    }
    System.out.print("sum="+ a);
}
public static void main(String args[]) {
    printSumOfOdd();
}
}
  
