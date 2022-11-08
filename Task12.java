import java.util.Arrays;
import java.util.Collections;

public class Task12 {
//    Example 1:
//
//    Input: s = "the sky is blue"
//    Output: "blue is sky the"
//    Example 2:
//
//    Input: s = "  hello world  "
//    Output: "world hello"
//    Explanation: Your reversed string should not contain leading or trailing spaces.

    public static void main(String[] args) {

        String s1 = "the sky is blue";

        System.out.println(reverseWords(s1));

    }
    public static String reverseWords(String s) {

        String[] words = s.trim().split(" ");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);

    }
}