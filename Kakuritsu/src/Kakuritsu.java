import java.security.SecureRandom;
import java.util.Random;
public class Kakuritsu {

	public static void main(String[] args) {

		int[] arr = {0, 0, 0, 1, 1, 1, 1};

		double n1 = 0;
		double N = 10000;

		Random rnd = new SecureRandom();

		for(int i = 1; i <= N; i++) {

			int s1 = rnd.nextInt(7);

			//System.out.println(arr[s1] + "," + s1);

			int s2 = s1;
			while (s2 == s1) {
				s2 = rnd.nextInt(7); 
			}

			//System.out.println(arr[s2] + "," + s2);

			int s3 = s2;
			while (s3 == s1 || s3 == s2 ) {
				s3 = rnd.nextInt(7); 
			}

			//System.out.println(arr[s3] + "," + s3);
			//System.out.println("☆☆☆");

			if(arr[s1] == 0 && arr[s2] == 0 && arr[s3] == 0) {
				n1++;
			}

		}
		System.out.println(N +"回の試行のうち、とりだした玉が全て白玉である回数は" + (int)n1);
		System.out.println("白玉3つ取り出した回数を"+ (int)N +"で割った数：" +n1/N);
		System.out.println("1/35=" + 1.0/35.0);
	}
}