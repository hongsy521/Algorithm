import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
       String s = String.valueOf(n);
        String[] strArray = new String[s.length()];
        StringBuilder strb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            strArray[i]=String.valueOf(s.charAt(i));
        }
        Arrays.sort(strArray,Collections.reverseOrder());
        for(String str : strArray){
            strb.append(str);
        }
        long answer = Long.valueOf(strb.toString());
        return answer;
    }
}