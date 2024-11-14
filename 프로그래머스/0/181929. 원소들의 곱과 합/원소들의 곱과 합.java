class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for(int num : num_list){
            mul*=num;
            sum+=num;
        }
        if(mul>Math.pow(sum,2)){
            return 0;
        } 
        return 1;
    }
}