//コラッツ予想プログラム

public class CollatzRe{

	public static void main(String[] args) {
		long N = 1000_0000_0000L;
		long a = 0;
		//ArrayList<Long> List = new ArrayList<>();


		for(long i = 2; i <= N ; i++) {

			//List.add(i);
			a = i;

			while(a >= 2) {			
				if(C(a) < i) {
					break;
				}
				/*if(List.contains(C(a))) {
					break;
				}*/
				a = C(a);
				//List.add(a);
				if(a < 0) {
					System.out.println("値がオーバーフローしました");
					break;
				}
			}

		}
		System.out.println(N+"以下の自然数は全てコラッツ予想を満たす");

	}
	//コラッツ関数
	public static long C(long N) {
		if ((N & 1) == 0) {
			N >>= 1;
		}
		else {
			N = (3 * N) + 1;
		}
		return N;
	}
}