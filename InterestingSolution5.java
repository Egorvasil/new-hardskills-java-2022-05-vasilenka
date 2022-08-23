import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterestingSolution5 {
    // Написать программу, считывающую последовательность целых чисел из файла и выводящую их в порядке убывания
    // INPUT.txt
    // 10 123 441 23 12 44 12 1000
    // ----------------------------
    // 1000 441 123 44  23 12 12 10


    public static void main(String[] args) throws IOException {
        System.out.println(createListFromFile("C:\\Users\\Asus\\Desktop\\Input.txt.txt"));
    }
    public static String readFromFile(final String path) throws IOException {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("C:\\Users\\Asus\\Desktop\\Input.txt.txt"))) {
            return bufferedReader.readLine();
        }
    }
    public static List<Integer> createListFromFile(String path) throws IOException {
        List<Integer>arrayList=new ArrayList<>();
        String result = readFromFile(path);
        String [] arrayString = result.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            arrayList.add(Integer.valueOf(arrayString[i]));
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        return arrayList;
    }
}






