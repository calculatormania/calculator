import java.util.Arrays;

//length-lexicographical orderによるベクトルの比較
public class Lexorder {
	public static void main(String[] args) {
		double [] vec1 = {1,2,3,4,5,6,7,10,1};	
		double [] vec2 = {2,2,3,4,5,6,7,8,1};
		int i = 0;
		if(Arrays.equals(vec1, vec2)) {
			System.out.println("vec1 = vec2");
		}
		else if(vec1.length < vec2.length) {
			System.out.println("vec1 " + "<_lex " + "vec2");
		}
		else if(vec2.length < vec1.length) {
			System.out.println("vec2 " + "<_lex " + "vec1");
		}
		else {
			while(vec1.length == vec2.length && vec1[i] == vec2[i]) {
				i++;
			}
			System.out.println("比較を行う場所は左から"+(i+1)+"番目");
			if(vec1[i] < vec2[i]) System.out.println("vec1 " + "<_lex " + "vec2");
			else System.out.println("vec2 " + "<_lex " + "vec1");
		}
	}
}