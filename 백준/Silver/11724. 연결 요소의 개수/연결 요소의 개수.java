import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main{
    static ArrayList<Integer> A[];
    static boolean visited[];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        
        for(int i=1;i<n+1;i++){
            // 인접 리스트 초기화
            A[i]=new ArrayList<Integer>();
        }
        
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            A[u].add(v);
            A[v].add(u);
        }
        int count =0;
        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    
    static void DFS(int i){
        if(visited[i]){
            return;
        }
        visited[i]=true;
        for(int j:A[i]){
            if(visited[j]==false){
                DFS(j);
            }
        }
    }
}