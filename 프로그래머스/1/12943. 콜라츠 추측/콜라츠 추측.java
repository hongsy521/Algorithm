class Solution {
    public int solution(int num) {
        int count=0;
        long n=(long)num;
        if(n==1){
            return 0;
        }else{
        while(n!=1){
        if(n%2==0){
            n=n/2;
            count++;
        }else{
            n=n*3+1;
            count++;
        }
            if(count==500){
                break;
            }else{
                continue;
            }
        }
        if(count==500){
            return -1;
        }else{
            return count;
        }  
        }
    }
}