import java.util.Scanner;

public class Task14 {
//write a program that get 3 parameters:
// 1) the length of the title.
// 2) name (can be several words)
// 3) color (yellow or black)
//    And counts ugly words. A word is considered ugly if 2 adjacent letters are of the same color.
// Example -> Input: 1) 27; 2) Algorithm and Datastructures; 3) BBYBYBBBBYYYYBBBBYYBBBYBYYYBB

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int numberOfLetters = scanner1.nextInt(); // I don't need this parameter to count an ugly word
        String name = scanner2.nextLine();
        String color = scanner3.nextLine();
        int counterOfUglyWord = 0;
        char[] chColor = color.toCharArray();
        char[] chName = name.toCharArray();
        for (int i = 0; i < chName.length; i++) {
            if (chName[i] == ' ') {
                for (int j = i; j != 0 || chName[j] == ' '; j--) {
                    if (chColor[j] == 'B' && chColor[j + 1] == 'B' || chColor[j] == 'Y' && chColor[j + 1] == 'Y') {
                        counterOfUglyWord++;
                        break;
                    }
                }
            }
        }
        System.out.println(counterOfUglyWord);
        scanner1.close();
        scanner1.close();
        scanner1.close();
    }
}
