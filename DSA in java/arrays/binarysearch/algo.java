package binarysearch;
public class algo {
    public static void main(String[] args)
    {
        int a[]={2,4,6,8,11,12,14,20,36,48};
        int t= 36;
        System.out.println(binarySearch(a,t));
    }

    //return the index and -1 if it does not exist
    static int binarySearch (int [] arr , int target) {
        int l = 0;
        int u= arr.length -1 ;
        while (l<u){
            // find the middle element
            int m= l+ (u-l)/2;

            if(target > arr[m])
            l = m+1;
            else if (target < arr[m])
            u= m-1;
            else
           return m;
        }
            return -1;
        }

    }






