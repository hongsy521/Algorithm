import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int age;
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        System.out.println("2022년 기준 "+age+"살이므로 "+solution.solution(age)+"년생입니다.");
    }
    public int solution(int age){
        return 2022-age+1;
    }
}