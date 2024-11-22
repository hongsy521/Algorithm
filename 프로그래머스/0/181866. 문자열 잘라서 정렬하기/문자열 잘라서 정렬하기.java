import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArray = myString.split("x");
        String[] answer = Arrays.stream(splitArray)
                                .filter(s->!s.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return answer;
    }
}