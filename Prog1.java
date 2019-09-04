package fppassignment;


public class Prog1 {

	public static void main(String[] args) {
		//get a random number x in the range 1 .. 9 and compute π the power of x
        int x=RandomNumbers.getRandomInt(1, 9);
        System.out.println("The result of  π the power of "+ x +" is "+ Math.pow(Math.PI, x));
        
        //get a random number y in the range 3 .. 14 and compute y the power of π
        
        int y=RandomNumbers.getRandomInt(3, 14);
        System.out.println("The result of "+ y +" the power of π is "+ Math.pow(y, Math.PI));
        
	}

}
