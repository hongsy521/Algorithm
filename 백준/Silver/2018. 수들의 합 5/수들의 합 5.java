import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int cnt=1;
        int start_index=1;
        int end_index=1;
        int sum=1;
        
        while(N!=end_index){
            if(sum<N){
                end_index++;
                sum+=end_index;
            }
            else if(sum>N){
                sum-=start_index;
                start_index++;
            } else {
                cnt++;
                end_index++;
                sum+=end_index;
            }
        }
        System.out.println(cnt);
    }
}