package Calculator;

import java.util.function.Predicate;

public class Predicat {
    public static void main(String[] args) {
        Predicate<String> checkLength = str -> str.length() > 5;
        System.out.println(checkLength.test("fat"));
    }

}
