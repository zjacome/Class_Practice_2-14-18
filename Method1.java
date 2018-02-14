
public class Method1 {

	public static void main(String[] args) {
		
		int c=smallestNumber(2,4);
		int d=smallestNumber(6, 21);
		int e=smallestNumber(119, 112);
		
		System.out.println("The smaller number is "+c);
		System.out.println("The smaller number is "+d);
		System.out.println("The smaller number is "+e);
	}
	public static int smallestNumber(int a, int b) { 
		if (a>b) {
			return b;
		}
		else if (b>a);{
			return a;
			
		}
	}

}
