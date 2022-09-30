import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task7 {

    //create 2 methods which check if string is Palindrome?
    //first simple method and second one with using "ListIterator"
    //input MADAM => output TRUE, because it reads backwards
    //input HELLO => output FALSE

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";
        String num1 = "12321";
        String num2 = "1234";
        System.out.println(isStringPalindrome(s1));
        System.out.println(isStringPalindrome(s2));
        System.out.println(isStringPalindrome(num1));
        System.out.println(isStringPalindrome(num2));
        isPalindrome(s1);
        isPalindrome(s2);
        isPalindrome(num1);
        isPalindrome(num2);
    }
    public static boolean isStringPalindrome(String word){ //this method works for numbers and strings
        char [] ch = word.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!=ch[(ch.length-1)-i]){
                return isPalindrome =false;
            }
        }
        return true;
    }
    public static void isPalindrome(String word){ //this method use "ListIterator"
        char [] ch = word.toCharArray();
        List<Character> listChar = new ArrayList<>();
        for (char c : ch) {
            listChar.add(c);
        }
        ListIterator<Character>iterator = listChar.listIterator();
        ListIterator<Character>reverseIterator = listChar.listIterator(listChar.size());
        boolean isPalindrome = true;
        while (iterator.hasNext()&&reverseIterator.hasPrevious()){
            if(iterator.next()!=reverseIterator.previous()){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("It's Palindrome");
        }else {
            System.out.println("It's not Palindrome!");
        }
    }
}