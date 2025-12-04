import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int Result[] = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<N;i++){
            if(i==0){
                stack.push(i);
                continue;
            }
            while(!stack.isEmpty() && A[stack.peek()]<A[i]){
                Result[stack.pop()]=A[i];
            }
            stack.push(i);
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                int index = stack.pop();
                Result[index]=-1;
            }
        }
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<N;i++){
            bw.write(Result[i]+" ");
        }
        bw.flush();
    }
}