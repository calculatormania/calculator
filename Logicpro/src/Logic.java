public class Logic {
	public static void main(String[] args) {
		int[][] x = 
			{
					{1, 1,2,3}, //{係数, xのべき, yのべき, zのべき}
					{2, 1,2,1},
					{-1, 2,2,1}
			};
		int[][] y = 
			{
					{2, 1,2,3},
					{4, 1,2,1},
					{-1, 2,2,1},
					{1, 1,2,4}
			};
		int[][] z = new int [7][4];  //[単項式の個数][4]
		
		int k = 0;
			
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < y.length; j++) {
					
					//for(int l = 1; l < y.length; l++) {
						if(x[i][1] == y[j][1] && x[i][2] == y[j][2] && x[i][3] == y[j][3]) {

							z[k][0] = x[i][0] + y[j][0];
							z[k][1] = x[i][1];
							z[k][2] = x[i][2];
							z[k][3] = x[i][3];
						}
					//}
				
				} 
				k++;
			}
		
		

		for (int i = 0; i <= z.length-1; i++) {
			for (int j = 0; j <= z[0].length-1; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");

	}
}