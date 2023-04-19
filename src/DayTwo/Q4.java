package DayTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {


    public static void maxi_mini(int[] arr,int n){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        System.out.println(mini+" "+maxi);
    }
    public static void sortArray(int[] arr,int n){
        for(int i =0;i<n;i++){
            int j = i;
            int a = arr[i];
            while( j > 0 && arr[j-1] > a){
                arr[j] = arr[j-1];
                j--;

            }
            arr[j] = a;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void repeatedValues(int[] arr,int n){
        int repeat = 0;
        Arrays.sort(arr);
        for(int i =1;i<n;i++){
            if(arr[i] == arr[i-1]){
                repeat++;

            }

        }
        System.out.println(repeat);
    }
    public static boolean occurance(int[] arr, int n,int num){
        for(int i =0;i<n;i++){
            if(arr[i] == num)
                return true;
        }
        return false;
    }
    public static void reverseArray(int[] arr, int n){
        for(int i =0;i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for(int i =0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

    maxi_mini(arr,n);
       //5
        // repeatedValues(arr,n);

        //sortArray(arr,n);
        System.out.println(occurance(arr,n,320));
        reverseArray(arr,n);
    }
}
