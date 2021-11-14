class power{
	double a;
	public power(int x,int n){
		a=Math.pow(x,n);
	}
	void show() {
		System.out.println(a);
	}
}
public class JAVA907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		power b = new power(2,5);
		power c = new power(3,2);
		b.show();
		c.show();
	}
}
