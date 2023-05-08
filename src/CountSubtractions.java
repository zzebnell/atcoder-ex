import java.util.Scanner;

public class CountSubtractions {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long contador = 0;
		
		long n = 0;
		
		if (A == 1 || B == 1) {
			contador = (A * B) - 1;
		} else {
			while (A != B) {
				if (A < B) {
					n = (long) Math.ceil((A - B) / (double) - A);
					if (B - (A * n) > 0) {
						B = B - (A * n);
					} else {
						B = B - (A * (n - 1));
						n--;
					}
				}
				else if (A > B) {
					n = (long) Math.ceil((B - A) / (double) - B);
					if (A - (B * n) > 0) {
						A = A - (B * n);
					} else {
						A = A - (B * (n - 1));
						n--;
					}
					
				}
				
				if (n > 0) {
					contador += n;
				}								
			}
		}
		
		System.out.println(contador);
		
	}
	
}