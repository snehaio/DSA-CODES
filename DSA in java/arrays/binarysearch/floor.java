package binarysearch;
// floor - greatest element in the array smaller than or equal to the target element

public class floor {
    
    public static void main(String args[]){
        int a[]={2,3,5,9,14,16,18};
        int t= 15;
        System.out.println(Ceiling(a,t));

    }
    static int Ceiling (int arr[] ,int target){
        int l = 0;
        int u= arr.length -1 ;
        while (l<=u){
            // find the middle element
            int m= l+ (u-l)/2;

            if(target > arr[m])
            l = m+1;
            else if (target < arr[m])
            u= m-1;
            else 
           return m;
        }
        return u;
            
    }
    
}



