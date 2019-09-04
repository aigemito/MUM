package fppassignment;

public class Prog7 {

	public static void main(String[] args) {
		if(args.length!=0) {
			int count = 0;
			for (int i = 0; i < args.length; ++i) {
			System.out.println("Length of index " + i + " " + args[i] + " = "
			+ args[i].length());
			//its a case sensitive 
			if (args[i].startsWith("A")) {
			count++;
			}
			}
			System.out.println("\nTotal starts with in spell A is = "+ count);
		}else {
			System.out.println("Please provide input First from command prompt");
		}
			
	}

}