import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[] {-1};
        }
        
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        List<Integer> numList = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                numList.add(num);
            }
        }

        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}
