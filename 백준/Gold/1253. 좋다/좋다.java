import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A[] = new long[n];
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count=0;
        
        for(int k=0;k<n;k++){
            long niceNum = A[k];
            
            int i=0;
            int j=n-1;
            
            while(i<j){
              if(A[i]+A[j]==niceNum){
                if(i!=k&&j!=k){
                    count++;
                    break;
                } else if(i==k){
                    i++;
                } else if(j==k) {
                    j--;
                }
            } else if(A[i]+A[j]>niceNum) {
                j--;
            } else {
                i++;
            }
            }
           
        }
        System.out.println(count);
        br.close();
    }
}