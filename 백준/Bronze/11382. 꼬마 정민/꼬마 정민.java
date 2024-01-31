import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        long a=sc.nextLong();  // int로 선언시 런타임 오류 주의
        long b=sc.nextLong();
        long c=sc.nextLong();

        System.out.println(a+b+c);
        sc.close();
    }
}
