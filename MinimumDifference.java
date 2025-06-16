import java.util.*;
class MinimumDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr = new int[a];
        for(int i = 0;i < a;i++){
            arr[i] = input.nextInt();
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int min_diff=arr[n-1];
        for(int k =1;k<n;k++){
            int diff = arr[k]-arr[k-1];
            if (diff<min_diff){
                min_diff = diff;
            }
            
        }
        int[ ] new_arr = new int[n*2];
        int count = 0;
        for(int i = 1;i<n;i++){
            if (arr[i]-arr[i-1]==min_diff){
                new_arr[count++]=arr[i-1];
                new_arr[count++]=arr[i];
            }
        }
        int m = new_arr.length;
         for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                if (new_arr[j] > new_arr[j + 1]) {
                    int temp = new_arr[j];
                    new_arr[j] = new_arr[j + 1];
                    new_arr[j + 1] = temp;
                }
            }
        }
        
        
        for(int j = 0;j < m;j++){
            if(new_arr[j]!=0){
                System.out.print(new_arr[j]+" ");
            }
        }
        input.close();
        
    }
}