//魔力......456賽っ......！
public class Shigoro {
	//サイコロを振るメソッド
	public static int dice(){
		int r = 0;
		int fortune = new java.util.Random().nextInt(6)+1;
		switch (fortune) {
		case 1:
		case 2:
			r = 4;
			break;
		case 3:
		case 4:
			r = 5;
			break;
		case 5:
		case 6:
			r = 6;
			break;
		}
		return r;
	}
	//試行メソッド ざわ...
	public static void main(String[] args) {
		double a = 10000;//試行回数
		double n4 = 0;
		double n5 = 0;
		double n6 = 0;
		for(int i = 1; i <= a; i++) {
			if(dice() == 4)
				n4 += 1;
			if(dice() == 5)
				n5 += 1;
			if(dice() == 6)
				n6 += 1;
		}
		System.out.println("(4が出た回数)/(試行回数) = " + n4/a + ", 本来の確率は " + 1.0/3.0);
		System.out.println("(5が出た回数)/(試行回数) = " + n5/a + ", 本来の確率は " + 1.0/3.0);
		System.out.println("(6が出た回数)/(試行回数) = " + n6/a + ", 本来の確率は " + 1.0/3.0);
	}
}