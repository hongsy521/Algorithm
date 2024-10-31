import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList()); 
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());

        arrList.removeAll(deleteList);

        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
