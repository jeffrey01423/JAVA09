class add{
	int a=0;
	public add(int n){
		for (int x=1;x<=n;x++) {
			a=a+x;
		}
	}
	void show()	{
		System.out.println(a);
	}
}
public class JAVA906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add b = new add(5);
		add c = new add(10);
		b.show();
		c.show();
	}

}
