import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int A[][] = new int[N+1][N+1];
        int S[][] = new int[N+1][N+1];
        
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                A[i][j]=Integer.parseInt(st.nextToken());
                S[i][j]=S[i][j-1]+S[i-1][j]-S[i-1][j-1]+A[i][j];
            }
        }
        for(int i=1;i<=M;i++){
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            System.out.println(S[c][d]-S[c][b-1]-S[a-1][d]+S[a-1][b-1]);
        }
    }
}