import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterestingSolution13 {
    public static void main(String[] args) {
        List<Integer>list1 = countSpecificNum(readFromFile("C:\\Users\\Asus\\Desktop\\FileForTask.txt"));
        list1.forEach(System.out::println);
    }
    public static List<Integer> readFromFile(final String path) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while (bufferedReader.ready()) {
                list.add(Integer.parseInt(bufferedReader.readLine()));
            }
        } catch (IOException ioException) {
            throw new RuntimeException(String.format("Error while processing with path %s", path));
        }
        return list;
    }
    public static List<Integer> countSpecificNum(List<Integer> list){
        return list.stream()
                .filter(x->x%2==0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
