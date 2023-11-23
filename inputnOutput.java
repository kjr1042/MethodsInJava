package methods;
class method3{
	int c;
	int add(int a,int b) {
		c=a+b;
		return c;
	}
}

public class inputnOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method3 m3 =new method3();
		int result=m3.add(20, 30);
		System.out.println(result);

	}

}
