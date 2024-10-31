import java.util.Arrays;

public class reverse {
    public static void main(String args[]){
        int a[]= { 1, 3, 23, 9, 18};
        Reverse(a);
        System.out.println(Arrays.toString(a));
    }
    static void Reverse ( int a[]) {
      for(int i= a.length-1, j=0;i>=j;i--,j++){
        int temp = a[j];
        a[j] = a[i];
        a[i]=temp;
      }
    }
}