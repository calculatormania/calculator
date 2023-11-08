import java.security.SecureRandom;
import java.util.Random;
public class Jikken {		

	public static void main(String[] args) {
		
		double n = 0;
		double N = 1000;
		double M = 1000000;
		
		//Random R = new SecureRandom();
		//Random rnd1 = new SecureRandom();
		Random rnd2 = new SecureRandom();

	 for(int j = 1; j <= M; j++) {
		  
		  n = 0;
		
		for(int i = 1; i <= N; i++) {
		/*	int s = 0;
			int x = -1;
			s = R.nextInt(2);
		  if(s == 0) {
			  x = rnd1.nextInt(6);
		  } else {*/
			
		int	x = rnd2.nextInt(2); 
		  
		  if(x == 0) {
		  	n++;
		  }
			
		}
		System.out.println(n/N);
		//System.out.println(1.0/2.0);
	  }	
		
	}
}