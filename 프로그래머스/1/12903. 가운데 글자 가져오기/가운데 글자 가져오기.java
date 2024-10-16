class Solution {
    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        
        if(s.length()%2==0){
            str.append(s.charAt(s.length()/2-1));
            str.append(s.charAt(s.length()/2));
        }else{
            str.append(s.charAt(s.length()/2));
        }
        return str.toString();
    }
}