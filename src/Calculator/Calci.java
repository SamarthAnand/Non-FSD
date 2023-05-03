package Calculator;

import java.util.Scanner;



public class Calci {
    public void add(int a, int b){
        System.out.println(" =========> "+(a+b));
    }


    public void subs(int a, int b){
        System.out.println(" =========> "+(a-b));
    }


    public void multiply(int a,int b){
        System.out.println(" =========> "+(a*b));
    }
    public void divide(int a,int b) throws ArithmeticException{
        try{
            System.out.println(" =========> "+(a/b));

        }catch(Exception e){

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calci calculate = new Calci();
        calculate.add(a,b);



    }
}
