class Solution {
    public int solution(int[] num_list) {
        String odd="";
        String even="";
        int answer = 0;
        
        for(int num:num_list){
            if(num%2==0)
                even+=num;
            if(num%2!=0)
                odd+=num;
        }
        answer=Integer.valueOf(even)+Integer.valueOf(odd);
        return answer;
    }
}