import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeSequences {
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
        
        byte nextByte() { return Byte.parseByte(next()); }
        
        short nextShort() { return Short.parseShort(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		
		int N = fr.nextInt();
		int M = fr.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[M];
		int C[] = new int[M + N];
		
		for (int i = 0; i < N; i ++) {
			A[i] = fr.nextInt();
		}
		
		for (int i = 0; i < M; i ++) {
			B[i] = fr.nextInt();
		}
		
		int j = 0;
		
		for (int i = 0; i < N; i++) {
			C[j] = A[i];
			j++;
		}
		
		for (int i = 0; i < M; i++) {
			C[j] = B[i];
			j++;
		}
		
		Arrays.sort(C);
		
		for (int i = 0; i < N; i ++) {			
			if (i != N - 1) {
				System.out.print((Arrays.binarySearch(C, A[i]) + 1) + " ");
			} else {
				System.out.print((Arrays.binarySearch(C, A[i]) + 1));
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < M; i ++) {			
			if (i != M - 1) {
				System.out.print((Arrays.binarySearch(C, B[i]) + 1) + " ");
			} else {
				System.out.print((Arrays.binarySearch(C, B[i]) + 1));
			}
		}
		
	}
}