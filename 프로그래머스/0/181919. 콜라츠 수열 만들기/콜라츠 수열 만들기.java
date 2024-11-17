import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> num_list = new ArrayList<>();
        num_list.add(n);
        
        while(n!=1){
            if(n%2==0){
                n/=2;
            } else {
                n=3*n+1;
            }
            num_list.add(n);
        }
        answer=num_list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}