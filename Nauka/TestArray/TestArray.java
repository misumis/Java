import java.awt.*;

public class TestArray{
	public int x;
	void TestArray(int x){
		x = this.x;
	}
	int getX(){return x;}

	public static void main(String[] args) {

		TestArray[] array = new TestArray[10];
		for (int i=0; i < 10; i++) {
			array[i] = new TestArray();
			array[i].x = 10;
		}
		for (int i = 0; i< 10	; i++ ) {
			System.out.println(array[i].getX());			
		}
		/*TestArray[] A = new TestArray[10];
		for (int i= 0; i < 10; i++) {
			A[i].TestArray(x) = (int) Math.round(Math.random() * 100);
			System.out.println(A);
		}*/
	}
}