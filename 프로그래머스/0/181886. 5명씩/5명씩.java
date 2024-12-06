class Solution {
    public String[] solution(String[] names) {
        int groupSize = (names.length + 4) / 5; 
        String[] answer = new String[groupSize];
        
        for(int i=0;i<groupSize;i++){
            answer[i]=names[i*5];
        }
        return answer;
    }
}