package Calculator;

import java.util.Scanner;

@FunctionalInterface
interface Foo{
    void mate();

    default void fun(){
        System.out.println("FUN");
    }
    static void funny(){
        System.out.println("FUNNY");

    }
}
public class TwoDArrayMulti {
    public static void main(String[] args) {

        Foo foot = () -> {

            System.out.println("Hello mate");
        };
        foot.mate();
        foot.fun();
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        int[][] arr1 = new int[row][col];
//        int[][] arr2 = new int[row][col];
//
//        int[][] res = new int[row][col];
//
//        for(int i =0;i<row;i++){
//            for(int j=0;j<col;j++){
//                arr1[i][j] = sc.nextInt();
//            }
//
//        }
//        for(int i =0;i<row;i++){
//            for(int j=0;j<col;j++){
//                arr2[i][j] = sc.nextInt();
//            }
//
//        }
//
//        for(int i =0;i<row;i++){
//            for(int j=0;j<col;j++){
//               res[i][j] = 0;
//               for(int k =0;k<row;k++){
//                   res[i][j]+=arr1[i][k]*arr2[k][j];
//               }
//                System.out.print(res[i][j]+" ");
//            }
//            System.out.println();
//
//        }



    }
}
