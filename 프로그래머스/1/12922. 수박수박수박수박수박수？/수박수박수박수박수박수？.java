class Solution {
    public String solution(int n) {
        String str = "수박";
       if(n%2==0){
               str=str.repeat(n/2);
       }else{
           str=str.repeat(n/2)+"수";
       }
        return str;
    }
}