class Solution {
    public int solution(String myString, String pat) {
        String lower_myString = myString.toLowerCase();
        String lower_pat = pat.toLowerCase();
        if(lower_myString.contains(lower_pat)){
            return 1;
        }
        return 0;
    }
}