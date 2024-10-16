import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder answer =new StringBuilder();
        
       for(int i=0;i<s.length();i++){
           list.add(String.valueOf(s.charAt(i)));
        }
        
       String[] strArray = new String[list.size()];
        
       for(int i=0;i<list.size();i++){
            strArray[i]=list.get(i);
        }
        
       Arrays.sort(strArray,Collections.reverseOrder());
        
       for(String str : strArray){
           answer.append(str);
       }
        
        return answer.toString();
    }
}