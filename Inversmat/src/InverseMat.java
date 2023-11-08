//正則行列の逆行列を求めるプログラム
public class InverseMat {

	public static void main(String[] args) {

		double [][] A = {{-4,0,-1,   1,0,0},  // A.lengthは行数
				{          1,1,1,    0,1,0},        // A[0].lengthは列数
				{          1,0,0,    0,0,1}};

		Showmat(A);

		for(int t=0; t<= A.length-1; t++) { //ループ開始

			for(int i=t+1; i<= A.length-1; i++) {
				if(A[i][t] != 0) {
					for(int k=0; k<=A[0].length-1; k++) {
						A[t][k] = A[t][k] + A[i][k];  //t行とi行の入れ替え
						A[i][k] = A[t][k] - A[i][k];
						A[t][k] = A[t][k] - A[i][k];
					}
					break;
				} 
			}

			Showmat(A);


			//主成分を作る計算
			if(A[t][t] != 0) {
				for(int i=0; i<= A.length-1; i++) {
					if(A[i][t] != 0 && i != t) {
						for(int k=0; k<=A[0].length-1; k++) {
							A[i][A[0].length -1-k] -= ((A[i][t])/(A[t][t]))*A[t][A[0].length -1-k];
						}
					}
				}
			} else {
				System.out.println("行列式は0です。つまり正則ではありません。");
				return;
			}

			Showmat(A);
		} 


		for(int i=0; i<= A.length-1; i++) {

			for(int k=0; k<=A[0].length-1; k++) {
				A[i][A[0].length -1-k] = A[i][A[0].length -1-k]/A[i][i];
			}

		}
		Showmat(A);

		for (int i = 0; i <= A.length-1; i++) {
			for (int j = (A[0].length-1)/2 + 1; j <= A[0].length-1; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}


//
	public static void Showmat(double [][]A){
		for (int i = 0; i <= A.length-1; i++) {
			for (int j = 0; j <= A[0].length-1; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	}

}




