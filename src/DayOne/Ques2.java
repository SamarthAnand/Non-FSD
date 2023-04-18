package DayOne;

public class Ques2 {
    public static void main(String[] args) {
        int a = 34;
        String s = Integer.toString(a);  //AutoBoxing and then to String
        System.out.println(s +" "+s.getClass());

        String str = "435";
        int strToInt = Integer.valueOf(str);

        System.out.println(strToInt);

        double d = 4554;
        int dtoi = (int)d;
        System.out.println(dtoi);

        double strtod =  Double.valueOf(str);
        System.out.println(strtod);
    }

}
