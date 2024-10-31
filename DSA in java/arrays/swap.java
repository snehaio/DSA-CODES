import java.util.Arrays;

public class swap {
    public static void main(String args[])
    {
        int[] a={100 , 250, 300, 500, 700};
        Swap ( a, 1, 3);
    
    System.out.println(Arrays. toString(a));
    }

    static void Swap (int []a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

}
