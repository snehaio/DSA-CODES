package javapatterns;
// half pyramid

public class halfpyramid {
    public static void main(String args[]) {
        int n=5;

        //row number= total number of columns in that row
        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
    
}
