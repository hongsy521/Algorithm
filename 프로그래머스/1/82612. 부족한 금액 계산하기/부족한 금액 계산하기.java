class Solution {
    public long solution(int price, int money, int count) {
        long answ=0;
        long sum=0;
        for(int i=1;i<=count;i++){
            sum+=price*i;
        }
        answ=sum-money;
        if(answ>0){
            return answ;
        }else{
            return 0;
        }
    }
}