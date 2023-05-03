package DaySix;

import java.util.Scanner;

public class Test24 {

    public void areaRectangle(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width= sc.nextInt();
        Q24 obj = new Q24(length, width);
        obj.areaRectangle(obj.getLength(),obj.getWidth());



    }

}
