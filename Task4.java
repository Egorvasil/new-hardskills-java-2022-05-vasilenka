import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Create your own Class and Method.
 Use them in Stream.map(add zero for each num) like method reference;
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(3,4,5,6,7);
        list.stream().map(addZero::addZeroForEachNumber)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
class addZero{
    public static int addZeroForEachNumber(int n){
        return n*10;
    }
}