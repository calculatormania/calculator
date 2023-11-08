public class Matdet {

	public static void main(String[] args) {

		double [][] A = {{0,1,0,3,0},  // A.lengthは行数
				{0,-2,1,2,1},        // A[0].lengthは列数
				{0,-4,1,5,2}};

		Showmat(A);


		//for(int j=0; j<=A.length-1; j++) {

		//0でない成分を入れ替えで持ってくる
		for(int t=0; t<= A.length-1; t++) { //ループ開始

			//int l = 0;
			
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
			}

			Showmat(A);
		} 
	}
	//}
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




