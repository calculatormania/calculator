//正方行列の行列式を求めるプログラム
public class Determinant {

	public static void main(String[] args) {

		double [][] A = { 
				{5,14,13},  // A.lengthは行数
				{3,7,7},        // A[0].lengthは列数
				{2,7,6}
		};

		for(int t=0; t<= A.length-1; t++) { //ループ開始

			for(int i=t+1; i<= A.length-1; i++) {
				if(A[i][t] != 0) {
					for(int k=0; k<=A[0].length-1; k++) {
						A[t][k] = A[t][k] + A[i][k];  //t行とi行の入れ替え
						A[i][k] = A[t][k] - A[i][k];
						A[t][k] = A[t][k] - A[i][k];
						A[i][k] = - A[i][k];          //交代性により、行にマイナスを掛ける
					}
					break;
				} 
			}

			//対角成分より下の成分を0にする計算
			if(A[t][t] != 0) {
				for(int i=t+1; i<= A.length-1; i++) {
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
		}

		//Showmat(A);

		double D = 1.0;
		for(int j=0; j<= A.length-1; j++) {
			D = D * A[j][j];
		}
		System.out.println("行列式は" + D + "です");
	}


	/*
	public static void Showmat(double [][]A){
		for (int i = 0; i <= A.length-1; i++) {
			for (int j = 0; j <= A[0].length-1; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	}*/

}




