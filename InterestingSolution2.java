import java.util.Scanner;
/*Программу, которая просит пользователя
 ввести путь к файлу и проверяет,
  что это за файл по его расширению. */

public class InterestingSolution2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("Это Jpeg!");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("Это HTML-страница");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("Это документ Word");
        } else {
            System.out.println("Неизвестный формат");
        }
    }
}







