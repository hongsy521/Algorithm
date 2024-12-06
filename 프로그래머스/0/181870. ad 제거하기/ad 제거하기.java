import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        
        for(String str : strArr){
            if(str.contains("ad")){
                continue;
            }
            strList.add(str);
        }
        String[] answer = strList.toArray(new String[0]);
        return answer;
    }
}