import java.util.Arrays;

public class Max {
	//有限個の単項式達の中から辞書式順序に関して最大のもの（多項式のLeadingTerm）をとるメソッド
	public static void main(String[] args) {
		int [] [] monomials = {{1,2,3}, {5,5,2},{5,2,4}};
		int [] LT = new int [3];
		for(int i =0; i < monomials.length; i++) {
			LT = Maxlex(monomials[i], LT);
		}
		System.out.println(Arrays.toString(LT));
	}
	//2つの単項式のうち、辞書式順序に関して大きい方をとる関数！
	public static int [] Maxlex(int mono1[], int mono2[]){
		int [] M = new int [3];
		int i = 0;
		if(Arrays.equals(mono1, mono2)){
			M = mono1;			
		}
		else {
			while(mono1[i] == mono2[i]) {
				i++;
			}
			if(mono1[i] < mono2[i]) {
				M = mono2;
			}
			else {
				M = mono1;
			}
		}
		return M;
	}

}