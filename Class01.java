class CRectangle{
	int width;
	int height;
	CRectangle(int w, int h){
		width = w;
		height = h;
		this.width = w;
		this.height = h;
	}
}
public class JAVA901 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle a = new CRectangle(10,8);
		System.out.println("長="+a.width);
		System.out.println("寬="+a.height);
	}
}
