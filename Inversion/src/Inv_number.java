public class Inv_number {
	public static void main(String[] args) {

		int [] sigma = {4,2,5,1,3};	
		int inv = 0;

		System.out.println("以下の置換の転倒数と偶奇を調べます。\n");

		for (int i = 0; i < sigma.length; i++) {
			System.out.print(i + 1 + "\t");
		}
		System.out.println("\n");
		for (int i = 0; i < sigma.length; i++) {
			System.out.print(sigma[i] + "\t");
		}

		System.out.println("\n");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆\n");
		
		
        //for文のネストで転倒数を調べる
		for (int i = 0; i < sigma.length; i++) {
			for (int j = i+1; j < sigma.length; j++) {
				if (sigma[i] > sigma[j]) {
					inv += 1;
				} else {
					inv += 0;
				}
			}
		}
		System.out.print("転倒数は" + inv + ",");
		
		
		//偶置換か奇置換か、転倒数の偶奇で判定
		if (inv % 2 == 0) {
			System.out.println("偶置換です。");
		} else {
			System.out.println("奇置換です。");
		}
		
		int [][] S = new int [inv][2];
		
		for (int i = 0; i < sigma.length; i++) {
			for (int j = i+1; j < sigma.length; j++) {
				if (sigma[i] > sigma[j]) {
					sigma[i] = sigma[i] + sigma[j];
					sigma[j] = sigma[i] - sigma[j];
					sigma[i] = sigma[i] - sigma[j];
				} else {
					inv += 0;
				}
			}
		}
		
	}
}


