package DayTwo;

import java.util.Scanner;

public class Q5 {
    public static void commonElements(int[] a, int[] b,int n){
        int[] arr = new int[n];
        int temp = 0;
        for(int i =0;i<n;i++){
           int j = 0;
           while(a[i]>=b[j] && j < n){
               if(a[i] == b[j]){
                   arr[temp] = a[i];
                   temp++;
               }
               j++;
           }
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sumAnonymous(int[] a){
        int sum = 0;
        for(int i :a){
            sum+=i;
        }
        System.out.println("\n"+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            b[i] = sc.nextInt();
        }

        commonElements(a,b,n);
        sumAnonymous(new int[]{1,23,43,53});
    }
}
