import java.util.Arrays;
public class Polyprac {

	public static void main(String[] args) {

		int [][][]P = { {{1},{1,1}}, {{2},{2,5}}, {{7},{1,2}}, {{1},{2,2}} };
		int [][][]Q = { {{1},{1,1}}, {{-1},{2,1}}, {{1},{0,0}}, {{1},{2,5}} };
		int M = Math.max(P.length,Q.length); 

		int varnum = P[0][1].length;

		int [][][]R = new int [M][][];   //Rの定義
		for(int i = 0; i < M; i++) {
			R[i] = new int [2][];
		}
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					R[i][j] = new int [1];	
				} else {
					R[i][j] = new int [varnum];	
				}
			}
		}

		int [][][]S = new int [M][][];  //Sの定義
		for(int i = 0; i < M; i++) {
			S[i] = new int [2][];
		}
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					S[i][j] = new int [1];	
				} else {
					S[i][j] = new int [varnum];	
				}	
			}
		}                

		int n = 0;
		int k = 0;
		int l = 0;
		for (int i = 0; i < P.length; i++) {
			n = 0;
			for (int j = 0; j < Q.length; j++) {
				if (!Arrays.equals(P[i][1],Q[j][1])) {
					n++;
				} else {
					R[k][0][0] = P[i][0][0] + Q[j][0][0];   //PとQ共通の単項式と、各単項式の係数の和をRに入れる
					R[k][1][0] = P[i][1][0];
					R[k][1][1] = P[i][1][1];
					k++;
				}

				if (n == Q.length) {        //Qに出現しないPの単項式とその係数をSに入れる
					S[l][0][0] = P[i][0][0];
					S[l][1][0] = P[i][1][0];
					S[l][1][1] = P[i][1][1];
					l++;
				}
			}
		}

		int r = 0;
		int s = 0;
		for (int i = 0; i < Q.length; i++) {             //Pに出現しないQの単項式とその係数をSに入れる
			r = 0;
			for (int j = 0; j < P.length; j++) {
				if (!Arrays.equals(Q[i][1],P[j][1])) {
					r++;
				} 

				if (r == P.length) {
					S[l+s][0][0] = Q[i][0][0];
					S[l+s][1][0] = Q[i][1][0];
					S[l+s][1][1] = Q[i][1][1];
					s++;
				}
			}
		}

		int N = k+l+s;

		int [][][]U = new int [N][][];   //Rの定義
		for(int i = 0; i < N; i++) {
			U[i] = new int [2][];
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					U[i][j] = new int [1];	
				} else {
					U[i][j] = new int [varnum];	
				}	
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				if (j == 0) {
					if(i < k) {
						U[i][j][0] = R[i][j][0];
					} else {
						U[i][j][0] = S[i-k][j][0];
					}
				} else {
					for(int p = 0; p < varnum; p++) {
						if(i < k) {
							U[i][j][p] = R[i][j][p];
						} else {
							U[i][j][p] = S[i-k][j][p];
						}
					}
				}
			}
		}

		for(int i = 0; i < U.length; i++) {
			System.out.println(U[i][0][0] + "*" + Arrays.toString(U[i][1]));
		}

	}
}