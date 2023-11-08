import java.security.SecureRandom;
import java.util.Random;

public class Gettime {		

	public static void main(String[] args) {
		
		int [] DICE = {1,2,3,4,5,6};
		double n = 0;
		double N = 100000;
		double M = 2000;
		
	  for(int j = 1; j <= M; j++) {
		  
		  n = 0;
		
		for(int i = 1; i <= N; i++) {
			 for(int k = 0; k < DICE.length; k++) {
				  DICE[k] = k+1;
			  }
				Shuffle(DICE);
			
			long T = System.currentTimeMillis();
		  if(T%6 == 0) {
			  n++;
		  } else{
			n = n + 0; 
		  }
			
		}
		System.out.println(n/N);
		  
	  }	
		/*for(int i = 0; i <= 15; i++) { 
		long T = System.currentTimeMillis();
		 System.out.println(T);
		 T = 10;
		 T = 100;
		}*/
	}
	public static int [] Shuffle(int Arr[]){
		 int [] SHU;
			SHU = new int [Arr.length];
			Random R = new SecureRandom();
			for(int i = 0; i < Arr.length; i++) {
				int j = R.nextInt(Arr.length);
				while(Arr[j] == -1) {
					j = R.nextInt(Arr.length);
				}
				SHU[i] = Arr[j];
				Arr[j] = -1;
			}
			for (int k = 0; k < Arr.length; k++) {
				Arr[k] = SHU[k];
			}
			return Arr;
		
	}
}