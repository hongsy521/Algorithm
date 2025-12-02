import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int checkArr[] = new int[4];
    static int myArr[] = new int[4];
    static int checkCount = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        char A[] = new char[S];
        int result=0;
        
        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<4;i++){
            checkArr[i]=Integer.parseInt(st.nextToken());
            
            if(checkArr[i]==0)
                checkCount++;
        }
        
        for(int i=0;i<P;i++){
            Add(A[i]);
        }
        if(checkCount==4)
            result++;
        
        // 슬라이딩 윈도우
        for(int i=P;i<S;i++){
            int j=i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkCount==4)
            result++;
        }
        System.out.println(result);
        br.close();
    }
    
    public static void Add(char c){
        switch(c){
            case 'A':
                myArr[0]++;
                if(myArr[0]==checkArr[0])
                    checkCount++;
                break;
            case 'C':
               myArr[1]++;
                if(myArr[1]==checkArr[1])
                    checkCount++;
                break; 
            case 'G':
               myArr[2]++;
                if(myArr[2]==checkArr[2])
                    checkCount++;
                break;   
            case 'T':
               myArr[3]++;
                if(myArr[3]==checkArr[3])
                    checkCount++;
                break; 
        }
    }
    
    public static void Remove(char c){
        switch(c){
            case 'A':
                if(myArr[0]==checkArr[0])
                    checkCount--;
                myArr[0]--;
                break;
            case 'C':
               if(myArr[1]==checkArr[1])
                    checkCount--;
                myArr[1]--;
                break; 
            case 'G':
               if(myArr[2]==checkArr[2])
                    checkCount--;
                myArr[2]--;
                break;   
            case 'T':
               if(myArr[3]==checkArr[3])
                    checkCount--;
                myArr[3]--;
                break; 
        }
    }
}