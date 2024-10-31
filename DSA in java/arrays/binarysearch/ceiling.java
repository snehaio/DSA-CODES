package binarysearch;
// ceiling - smallest element in the array greater or equal to the target element

public class ceiling {
    public static void main(String args[]){
        int a[]={2,3,5,9,14,16,18};
        int t= 15;
        System.out.println(Ceiling(a,t));

    }
    static int Ceiling (int arr[] ,int target){
        int l = 0;
        int u= arr.length -1 ;

        // but what if target is greater than the greatest number in the array
        if(target>arr[u])
       return -1;

        else{
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
        return l;
            
    }
}
    
}

