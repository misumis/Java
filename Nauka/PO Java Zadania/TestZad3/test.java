
public class test {
	double x=0, y=0;

	test (double parametr1 , double parametr2){
		x=parametr1;
		y=parametr2;
	}
	public String toString(){
		String text;
		text = "Wspolrzedne (" + x + "," + y + ")";
		text = "Wspolrzedne ("+ String.format("%.1f",x) + " , " + String.format("%.1f",y) + ")";
		return text;
	}
	public static void main(String[] args){
		int arraySize = 10;
		test[] arrayOfPoints = new test[arraySize];

		for (int i = 0 ; i < arrayOfPoints.length ; i++){
			arrayOfPoints[i] = new test (Math.random()*100, Math.random()*100);
		}
		for (int j = 0 ; j < arrayOfPoints.length ; j++){
			System.out.println(arrayOfPoints[j]);
		}
	}
}
