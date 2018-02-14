
public class Method2 {

	public static void main(String[] args) {
		double x=AverageNums(118,36,22);
		double y=AverageNums(200, 6, 97);
		
		System.out.println("The avergae is "+ x);
		System.out.println("The avergae is "+ y);
	}
	public static double AverageNums(double a, double b, double c ) {
		double avg=((a+b+c)/3);
		
		return avg;
	}

}
