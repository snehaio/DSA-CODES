public class maxitem {
    public static void main(String args[])
    {
      int a[]= {1,3,23,9,18}  ;
      System.out.println(max(a));
    }

    static int max(int[] a){
      int m= a[0];
       for(int i=0; i <a.length; i++)
    {
        
        if(a[i]>m){
            m=a[i];
        }
    }
        return m;
    
    }
}
    

