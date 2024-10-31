public class maxwealth {
    public static int main(String[] args){
        int arr[][]= { 
            {1,2,3}, {4,5,6}, {7,8,9}
        };
 System.out.println(maxWealth(arr));
return 0;
    }
    static int maxWealth (int[][] arr){

    
        int maxWealth = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          sum = 0;
          for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
            if (maxWealth > sum) {
              maxWealth = sum;
            }
          }
        }
        return maxWealth;
      }
    }

    
    