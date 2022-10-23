public class Task9 {
    public static void main(String[] args) {
        String s = "Hello world  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }
}