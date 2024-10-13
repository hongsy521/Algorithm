class Solution {
    public boolean solution(int x) {
        String s=String.valueOf(x);
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Integer.valueOf(s.substring(i,i+1));
        }
        if(x%sum==0){
            return true;
        }else{
            return false;
        }
    }
}