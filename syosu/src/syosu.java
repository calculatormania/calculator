public class syosu {
	public static void main(String[] args) {

		double x = 0.00041480012086533;
		System.out.println(Ro(1.0/x));
		System.out.println(Ro( 1.0/Roo(x) ));
		
		System.out.println(Roo(x)*Ro( 1.0/Roo(x) ));
		System.out.println(Roo(x)*Ro( 1.0/x ));
		}

	public static double R(double x) {
		double y = ((double)Math.round(x * 10))/10;
		return y;
	}

	public static double Ro(double x) {
		double y = ((double)Math.round(x * 100000))/100000;
		return y;
	}
	
	public static double Roo(double x) {
		double y = ((double)Math.round(x * 10000000))/10000000;
		return y;
	}
}