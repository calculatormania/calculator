// 正 則 行 列 の 自 動 生 成 プ ロ グ ラ ム
import java.util.Random;
public class Rmatgenerate {
	public static void main(String[] args) {
		int N = 25; //欲しい正則行列の個数
		int [][] A = new int [3][3];
		for(int m=1; m<=N; m++) {  //正則行列をランダムにN個生成
			Reg(A);            //Reg関数（ランダムに正則行列を生成し、出力させる関数）をこれより下で予め作っておく

		}
	}

	//ランダムに正則行列を生成し、出力させる関数
	public static void Reg(int [][]B){

		int [][] A = {{1,0,0},
				{0,1,0},
				{1,0,1}};
		int t = 20;                      //基本変形の回数
		Random rnd = new Random();
		int[] L = {0,1};
		int[] R = {0,1,2,3};
		int[] S = {-1,1};

		for(int l=1; l<=t; l++) {        //変形のループ開始　

			int b = L[rnd.nextInt(2)];   //変形する際に、行か列を選択する乱数（0ならば行、1ならば列）
			int r = R[rnd.nextInt(A.length)];   //スカラー倍して足す方の行（列）の乱数
			int k = R[rnd.nextInt(A.length)];   //足される側の行（列）の乱数
			int sc = S[rnd.nextInt(2)];  //スカラー倍して別の行（列）に足す時の、スカラーの乱数

			for(int j=0; j<=A.length-1; j++) {

				if(b == 0) {           //b=0なら行で変形
					if(r != k) {
						A[k][j] = A[k][j] + sc*A[r][j];
					} else {
						A[k][j] = A[k][j] + sc*A[Math.abs(k-1)][j];
					}
				} else {               //b=1なら列で変形
					if(r != k) {
						A[j][k] = A[j][k] + sc*A[j][r];
					} else {
						A[j][k] = A[j][k] + sc*A[j][Math.abs(k-1)];
					}
				}
			}

			if(l<t) {         //一回ごとに変形した行列を保存、途中の行列はcontinue文で省略
				continue;     //lがtに到達したとき、ランダム変形で得られた正則行列を出力
			}
			for (int i = 0; i <= A.length-1; i++) {
				for (int j = 0; j <= A.length-1; j++) {
					B[i][j] = A[i][j];
					System.out.print(B[i][j] + "\t");
				}
				System.out.println("\n");
			}
			System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		}
	}
}