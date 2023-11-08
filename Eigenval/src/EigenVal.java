public class EigenVal {
	public static void main(String[] args) {

		double [][] A = {{2,0,0},  // A.lengthは行数
				{1,2,0},        // A[0].lengthは列数
				{1,1,1}};
		double [][] x = {{1},{0},{0}}; //ベクトルの初期値
		double [][] y;
		
		int N = 510; //ループ回数を指定


		for(int i=1; i<=N; i++) {
			y = Prod(A,x);
			if(i >= N-10) {
			System.out.println("固有値: " + Inn(y,y)/Inn(y,x));
			System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
			}
			x = y;
		}
		/*double [][]z;
		for(int i=0; i<=A.length-1; i++) {
			z[i][0] =   (Inn(y,y)/Inn(y,x))*x[i][0];
		}*/
	}


	//行列を参照する関数
	public static void Showmat(double [][]A){
		for (int i = 0; i <= A.length-1; i++) {
			for (int j = 0; j <= A[0].length-1; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	}

	//行列の積演算関数
	public static double [][] Prod(double [][]A, double [][]B){
		double [][]C = new double [A.length][B[0].length];
		for (int i = 0; i <= A.length-1; i++) {
			for (int j = 0; j <= B[0].length-1; j++) {
				C[i][j]=0;
				for(int k = 0; k <= A.length-1; k++) {
					C[i][j] = C[i][j] + A[i][k]*B[k][j];
				}
			}
		}
		return C;
	}

	//ベクトルの内積関数
	public static double Inn(double [][]x, double [][]y){
		double val = 0;
		for(int k = 0; k<=x.length-1; k++) {
			val = val + x[k][0]*y[k][0];
		}
		return val;
	}

}