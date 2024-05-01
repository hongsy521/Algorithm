class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        double avg;
        for(int i=0;i<numbers.length;i++){
            answer+=numbers[i];
        }
        avg=(double)answer/numbers.length;
        return avg;
    }
}