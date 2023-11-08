import java.security.SecureRandom;
import java.util.Random;
public class Randomdicere {		

	public static void main(String[] args) {
		
		int [] DICE = {1,2,3,4,5,6};
		
		double n = 0;
		double N = 100000;
		double M = 3000;

	  for(int j = 1; j <= M; j++) {

		  n = 0;
		
		for(int i = 1; i <= N; i++) {
		  for(int k = 0; k < DICE.length; k++) {
			  DICE[k] = k+1;
		  }
			Shuffle(DICE);			
			if(DICE[0] == 1) {
				n++;
			}
			
		}
		System.out.println(n/N);
		  
	  }	
		
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