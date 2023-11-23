package methods;
class method2{
	int a=20;
	int b=30;
	int add() {
		int c=a+b;
		return c;
	}
}
public class noInputnOutput {
	public static void main(String args[]) {
		method2 m= new method2();
		int result = m.add();
		System.out.println(result);
	}

}
