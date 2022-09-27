import java.util.function.Function;
/*
given a string, you have to reverse and uppercase all letters using
Function interface and method reference
 */
public class Task3 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseAndUppercaseString(s));
    }
    public static String reverseAndUppercaseString(String s){
        Function<String, String>function=String::toUpperCase;
        String result = function.apply(s);
        StringBuilder sb = new StringBuilder(result);
        return sb.reverse().toString();

    }
}