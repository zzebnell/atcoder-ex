import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASCIIArt {
	
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
	
	public static char equivalentChar(byte n) {
		char res = ' ';
		String abc = ".ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		res = abc.charAt(n);
		
		return res;
	}
	
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		
		byte H = fr.nextByte();
		byte W = fr.nextByte();
		
		byte[][] matrix = new byte[H][W];
		
		for (int i = 0; i < H; i++) {
			for (int a = 0; a < W; a++) {
				matrix[i][a] = fr.nextByte();
			}
		}
		
		for (int i = 0; i < H; i++) {
			for (int a = 0; a < W; a++) {
				System.out.print(equivalentChar(matrix[i][a]));
			}
			System.out.println();
		}
		
	}
}