import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] ends_string = new String[my_string.length()];
        
        for(int i=0;i<my_string.length();i++){
            ends_string[i]=my_string.substring(i);
        }
        String[] answer = Arrays.stream(ends_string)
                                .sorted()
                                .toArray(String[]::new);
        
        return answer;
    }
}