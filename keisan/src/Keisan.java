public class Keisan {
	//mainメソッド
	public static void main(String[] args) {
		double a = 1.0;
		double b = 2.0;
		double eps = Math.pow(10, -20);
		double m = 0.0;
		int i = 0;
		while (b-a > eps) {
			i++;
			m = (a+b)/2.0;
			if(f(m)*f(a) < 0) b = m;
			else a = m;
			if(i == 10000) break;
		}
		System.out.println(m);
	}
	//代入メソッド
	public static double f(double x) {
		return x*x - 3;
	}

}