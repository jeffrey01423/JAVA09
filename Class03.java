class Caaa{
	private int value;
	
	public Caaa(){
		value=10;
		System.out.println("value="+value);
	}
	public Caaa(int i) {
		value=i;
		System.out.println("value="+value);
	}
}
public class JAVA903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
	}

}
//第4行與第8行的建構元被呼叫
//不能，存取控制字符只能使用在類別變數中
//不會，因為其他行沒有需要存取value變數
