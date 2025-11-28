import java.util.Scanner;
    
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            int suNo=sc.nextInt();
            int quizNo=sc.nextInt();
            
            int A[]=new int[suNo+1];
            int S[]=new int[suNo+1];
            
            for(int i=1;i<=suNo;i++){
                A[i]=sc.nextInt();
                S[i]=S[i-1]+A[i];
            }
            for(int i=0;i<quizNo;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                
                System.out.println(S[b]-S[a-1]);
            }
            sc.close();
        }
    }