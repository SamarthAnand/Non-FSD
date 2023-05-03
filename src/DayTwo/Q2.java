package DayTwo;

import java.util.Scanner;

public class Q2 {
    public static void multiply(int n,int[][]a,int[][] b){
        int[][] res = new int[n][n];
        for(int i =0;i<n;i++){

            for(int j=0;j<n;j++){
                for(int k =0;k<n;k++){
                    res[i][j] += a[i][k]*b[k][i];
                }
                System.out.print(res[i][j]);

            }

        }
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){

                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new  int[3][3];
        int[][] b = new  int[3][3];

        int[][] res = new  int[3][3];
        System.out.println("Enter 1st Matrix");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter 2nd Matrix");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
              res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

       multiply(3,a,b);
    }
}
