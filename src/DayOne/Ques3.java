package DayOne;

import java.util.Scanner;

public class Ques3 {
    public void greaterThan(int a, int b){
        if(a > b)
            System.out.println(a+" is greater than "+b);
        else if(a < b )
            System.out.println(a+" is lesser than "+b);
        else
            System.out.println(a+" is equal than "+b);
    }
    public void evenOdd(int a){
        if(a%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public void posNeg(int x){
        if(x > 0)
            System.out.println("positive");
        else if(x < 0)
            System.out.println("negative");
        else{
            System.out.println("zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Ques3 obj = new Ques3();
        obj.greaterThan(a,b);

        obj.evenOdd(a);

        int x = sc.nextInt();
        obj.posNeg(x);

    }
}
