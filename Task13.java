import java.util.*;
public class Task13 {
    //    Input: l1 = [2,4,3], l2 = [5,6,4]
    //    Output: [7,0,8]
    //    Explanation: 342 + 465 = 807
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(4);
        solve(list1, list2);
    }
    public static void solve(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Collections.reverse(list1);
        Collections.reverse(list2);
        int totalList1 = 0;
        int totalList2 = 0;
        for (int i = 0; i < list1.size(); i++) {
            totalList1+=list1.get(i);
            totalList1*=10;
            totalList2+=list2.get(i);
            totalList2*=10;
        }
        totalList1/=10;
        totalList2/=10;
        int result = totalList1+totalList2;
        List<Integer>listResult = new ArrayList<>();
        listResult.add(result%10);
        result/=10;
        listResult.add(result%10);
        listResult.add(result/10);
        System.out.println(listResult);
    }
}