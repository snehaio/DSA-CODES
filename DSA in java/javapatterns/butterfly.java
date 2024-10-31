package javapatterns;

public class butterfly {
    public static void main (String args[]) {
        int n=4;
        //upper half
        for(int i=1;i<=n;i++) {
            int space= 2*(n-i);

            for(int j=1;j<=i;j++) {
                System.out.print("*"); //for left star 
            }
            for(int j=1;j<=space;j++) {
                System.out.print(" "); //for spaces
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*"); //for right stars
            }
            System.out.println();
        }

        //lower half
        
        for(int i=n;i>=1;i--) {
            int space= 2*(n-i);

            for(int j=1;j<=i;j++) {
                System.out.print("*"); //for left star 
            }
            for(int j=1;j<=space;j++) {
                System.out.print(" "); //for spaces
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*"); //for right stars
            }
            System.out.println();
        }
    }
}
        
        
    

