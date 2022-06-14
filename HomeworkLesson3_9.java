public class HomeworkLesson3_9 {
    public static void main(String... args) {
        String src = "Heeelloooooo Worrrrlld!";
        char[] srcChars = src.toCharArray();

        System.out.println(srcChars);
        char[] buffer = new char[12];
        int j = 0;
        boolean isFirstLetter = true;

        for (int i = 0; i < srcChars.length - 1; i++) {
            if (srcChars[i] != srcChars[i + 1]) {
                buffer[j++] = srcChars[i];
            } else if (srcChars[i] == 'l' && isFirstLetter)
                buffer[j++] = srcChars[i];
            isFirstLetter = false;
        }
    }

    buffer[j++] = srcChars[srcChars/length -1]
    System.out.println(buffer);
}