class Solution {
    public int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 두 수 중 더 큰 수 n
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        answer[0] = gcd(n, m);
        
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}