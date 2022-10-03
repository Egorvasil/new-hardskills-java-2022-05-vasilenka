import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

//   Input: candidates = [2,3,6,7], target = 7
//   Output: [[2,2,3],[7]]
//  Explanation:
//   2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//   7 is a candidate, and 7 = 7.
//   These are the only two combinations.

    public static void main(String[] args) {
        int [] array = {2,3,6,7};
        System.out.println(combinationSum(array,7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        getResult(result, new ArrayList<>(), candidates, target, 0);

        return result;
    }

    private static void
    getResult(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }
        }
        else if(target == 0 ){
            result.add(new ArrayList<>(cur));
        }
    }
}