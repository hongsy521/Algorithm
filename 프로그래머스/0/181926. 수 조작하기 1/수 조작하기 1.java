class Solution {
    public int solution(int n, String control) {
        char[] charArray = control.toCharArray();
       for(char c : charArray){
           if(c=='w'){
               n+=1;
           } else if(c=='s'){
               n-=1;
           } else if(c=='d'){
               n+=10;
           } else if(c=='a'){
               n-=10;
           }
       }
        return n;
    }
}