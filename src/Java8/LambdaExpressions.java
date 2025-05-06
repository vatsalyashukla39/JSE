package Java8;

import java.sql.SQLOutput;
import java.util.Collections;

@FunctionalInterface
interface MathOperation {
    String process(String s);
}
public class LambdaExpressions {
    public static void main(String[] args) {
       MathOperation m1= s -> s.toUpperCase();
       MathOperation m2= s -> String.valueOf(new StringBuilder(s).reverse());
    }
}
