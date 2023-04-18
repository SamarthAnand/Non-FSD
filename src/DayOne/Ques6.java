package DayOne;

import java.util.Scanner;

public class Ques6 {
    public static void large(int a, int b,int c){
        if(a > b && a > c)
            System.out.println(a+"is largest.");
        else if(b > a && b >c )
            System.out.println(b+ " is largest.");
        else
            System.out.println(c+" is largest.");

    }
    public static void factorial(int n){
        int num = n;
        for(int i=n-1;i>0;i--){
            num *= i;
        }
        System.out.println("Factorial of "+n+" is :"+num );
    }
    public static boolean primeNo(int n){
        for(int i=2;i<n;i++){
            if(n%i ==0 )
                return false;
        }
        return true;
    }
    public static void fibonacchi(int n){
        int a = 0;
        int b = 1;
        System.out.println(a+"\n"+b);
        int c = 0;
        while(a+b <n){
            c =a+b;
            a= b;
            b = c;
            System.out.println(c);
        }

    }
    public static void sumUpto(int n){
        int sum = 0;
        int i = 0;
        do{

            sum += i;
            i++;
        }while(i<=n);

        System.out.println(sum);
    }

    public static void reverseString(String s){
        for(int i =0;i<s.length();i++){
            System.out.print(s.charAt(s.length()-i-1));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//
//      large(a,b,c);

        System.out.println("Question 7 ---->" );

        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }

        System.out.println("Question 8 ---->" );

        for(int i=2;i<=n;i++){
            if(i%2 ==0 )
            System.out.println(i);
        }
        System.out.println("Question 9 ---->" );
        factorial(n
        );

        System.out.println("Question 10 ---->" );
        System.out.println(primeNo(n));
        System.out.println("Question 11 ---->" );
        fibonacchi(n);
        System.out.println("Question 11 ---->" );
         sumUpto(n);

        System.out.println("Question 12 ---->" );
        reverseString("Pavitra");


    }

}
