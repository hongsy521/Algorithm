class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            if(n%2==0){
                answer+=Math.pow(n,2);
            } else {
                answer+=n;
            }
            n=n-2;
        }
        return answer;
    }
}