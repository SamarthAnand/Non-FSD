package DayTwo;

import java.util.Scanner;

public class Q1 {

    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c ){
        return a+b+c;
    }

    public static void main(String[] args) {
        //Overloading  methods
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(add(a,b) +" "+add(a,b,c));
    }

}
