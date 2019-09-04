package fppassignment;

public class Prog2 {

	public static void main(String[] args) {
		float a= 1.27f;
		float b=3.881f;
		float c=9.6f;
		float sum =a+b+c;
		//the sum of the floats as an integer, obtained by casting the sum to type int
		int sumCasting = (int)sum;
		//the sum of the floats as an integer, obtained by rounding the sum to the nearest integer,
		//using the Math.round function
		int sumRounding = (int)Math.round(sum);
		
		System.out.println("Sum Casted: " + sumCasting);
		System.out.println("Sum Rounded: " + sumRounding);

	}

}
