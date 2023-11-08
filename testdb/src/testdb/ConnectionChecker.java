package testdb;
public class ConnectionChecker {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ドライバのロードに成功");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}